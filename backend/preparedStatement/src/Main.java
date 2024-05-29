import db.H2Connection;
import org.apache.log4j.Logger;


import java.sql.*;

public class Main {
    public static Logger LOGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS(ID INT AUTO_INCREMENT PRIMARY KEY, NUMEROCUENTA INT NOT NULL," +
            "NOMBRE VARCHAR(50) NOT NULL, SALDO NUMERIC(7,2) NOT NULL)";
    public static String SQL_INSERT = "INSERT INTO CUENTAS VALUES (DEFAULT, ?,?,?)";
    public static String SQL_SELECT = "SELECT * FROM CUENTAS";
    public static String SQL_UPDATE = "UPDATE CUENTAS SET SALDO =? WHERE NUMEROCUENTA=?";
    public static void main(String[] args) {
        Connection connection = null;
        Cuenta cuentaDB = null;

        Cuenta cuenta = new Cuenta(1234, "cuenta.mp", 1818);
        try{
            connection = H2Connection.getConnection();
            //crear tabla
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE);
            //insercion
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setInt(1, cuenta.getNumeroCuenta());
            preparedStatement.setString(2, cuenta.getNombre());
            preparedStatement.setDouble(3, cuenta.getSaldo());

            preparedStatement.execute(); // Execute the update statement


            //mostrar datos

            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                Integer numeroCuenta = resultSet.getInt(2);
                String nombre = resultSet.getString(3);
                double saldo = resultSet.getDouble(4);
                cuentaDB = new Cuenta(id,numeroCuenta,nombre,saldo);

            }
            LOGGER.info("Datos de la cuenta: " + cuentaDB);

            //Update

            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setDouble(1,cuenta.getSaldo()+10);
            preparedStatement.setInt(2, cuenta.getNumeroCuenta());


            //update transaccion
            connection.setAutoCommit(false);
            try {
                PreparedStatement preparedStatement1 = connection.prepareStatement(SQL_UPDATE);
                connection.commit();

            }catch (Exception e){
                connection.rollback();
            }
            connection.setAutoCommit(true);

        }catch (Exception e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                LOGGER.error(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

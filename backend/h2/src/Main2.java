import org.apache.log4j.Logger;

import java.sql.*;


public class Main2 {

    public static Logger LOGGGER = Logger.getLogger(Main2.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS FIGURAS;"+
            "CREATE TABLE FIGURAS (ID INT AUTO_INCREMENT PRIMARY KEY,"+
            "FIGURA VARCHAR(50) NOT NULL, COLOR VARCHAR(50) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO FIGURAS VALUES (DEFAULT, 'CIRCULO', 'ROJO')," +
            "(DEFAULT, 'CIRCULO', 'AZUL'), (DEFAULT, 'CUADRADO', 'VERDE')," +
            "(DEFAULT, 'CUADRADO', 'AMARILLO'), (DEFAULT, 'CUADRADO', 'GRIS')";


    public static String SQL_SELECT = "SELECT * FROM FIGURAS";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE);
            statement.execute(SQL_INSERT);
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            while (resultSet.next()){
                LOGGGER.info("Figura: "+ resultSet.getInt(1)+ " - " +resultSet.getString(2)+
                        " - " + resultSet.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
            LOGGGER.error(e.getMessage());
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
                LOGGGER.error(e.getMessage());
            }
        }
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase9","SA","SA");
    }

}

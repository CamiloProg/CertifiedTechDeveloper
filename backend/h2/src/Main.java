import org.apache.log4j.Logger;

import java.sql.*;


public class Main {

    public static Logger LOGGGER = Logger.getLogger(Main.class);
    public static String SQL_CREATE = "DROP TABLE IF EXISTS ANIMALS;"+
            "CREATE TABLE ANIMALS (ID INT AUTO_INCREMENT PRIMARY KEY,"+
            "TIPO VARCHAR(50) NOT NULL, NOMBRE VARCHAR(50) NOT NULL)";

    public static String SQL_INSERT = "INSERT INTO ANIMALS VALUES (DEFAULT, 'PERRO', 'ODIN' ),"+
            "(DEFAULT, 'GATO', 'ODINA' ), (DEFAULT, 'OVEJA', 'ODINE' ),(DEFAULT, 'PEZ', 'DORY' )," +
            "(DEFAULT, 'DINOSAURIO', 'DINO' ),";

    public static String SQL_SELECT = "SELECT * FROM ANIMALS";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE);
            statement.execute(SQL_INSERT);
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            while (resultSet.next()){
                LOGGGER.info("Animal: "+ resultSet.getInt(1)+ " - " +resultSet.getString(2)+
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
        return DriverManager.getConnection("jdbc:h2:~/clase8","SA","SA");
    }

}

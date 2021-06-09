import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDconnection {

    private Connection connection;

    public  BDconnection(){

        try{
            String ConnectionDB = "jdbc:sqlserver://TR1SQLPRD1:<PORTA>;databaseName=<NOME_BANCO>;user=<USUARIO>;password=<SENHA>";
            connection = DriverManager.getConnection(ConnectionDB);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void closeDataBaseConnection(){
        try{
            connection.close();
        }catch(SQLException e) {
            e.getErrorCode();
        }
    }
}

package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectio {

    Connection connection;
    Statement statement;

    public Connectio(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Sidh@nt123");
            statement =connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package TaskManager;
import java.sql.*;
public class DBConnection {
private static final String URL="jdbc:mysql://localhost:3306/Task";
private static final String User="root";
private static final String password=System.getenv("TASK_DB_PASSWORD");

public static Connection getConnection() {
    Connection con=null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection(URL,User,password);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return con;
}
}

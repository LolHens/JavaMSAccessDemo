import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by LolHens on 11.01.2015.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        aktualisiereTabelle();
    }

    public static void aktualisiereTabelle() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://Melvin-Pierre.mdb");
        
        new MainWindow(connection);
    }
}

package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {
		Properties p = loadPropertiesFile();
		Class.forName(p.getProperty("driver"));
		Connection conn = null;
		conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		
		return conn;
		
	}
	
	public static Properties loadPropertiesFile() throws IOException {
		 Properties prop = new Properties();
		 InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		 prop.load(in); 
		 in.close();
		 return prop;
		
	}
	
}

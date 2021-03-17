package Master;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class ReadTestData {

	public static Properties prop;

	public static String value;

	public static String readTestData(int colNum, int rowNum, String table) throws Exception {

		Connection connection = null;

		prop = new Properties();

		prop.load(new FileInputStream("src/main/java/config/config.properties"));

		String url = prop.getProperty("serverURL");

		String DBUserName = prop.getProperty("DBUserName");

		String DBPassword = prop.getProperty("DBPassword");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create a connection to the database

			connection = DriverManager.getConnection(url, DBUserName, DBPassword);

			// Get a result set containing all data from test_table

			Statement statement = connection.createStatement();

			ResultSet results = statement.executeQuery("SELECT * FROM "+table);

			while (results.next()) {

				if(results.getRow()==rowNum)
				{
					value = results.getString(colNum);
					break;
				}
			}

		} catch (SQLException e) {

			System.out.println("Could not retrieve data from the database " + e.getMessage());
		}
		return value;
	}

	// to insert data into table 

	public static boolean insertTestData(String query) throws Exception {

		Connection connection = null;

		boolean result = false;
		
		prop = new Properties();

		prop.load(new FileInputStream("src/main/java/config/config.properties"));

		String url = prop.getProperty("serverURL");

		String DBUserName = prop.getProperty("DBUserName");

		String DBPassword = prop.getProperty("DBPassword");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create a connection to the database

			connection = DriverManager.getConnection(url, DBUserName, DBPassword);

			Statement statement = connection.createStatement();

			 result = statement.execute(query);

		} catch (SQLException e) {

			System.out.println("Could not insert datainto the database " + e.getMessage());
		}
		return result;
	}

}
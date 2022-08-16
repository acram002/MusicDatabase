import java.sql.*;

public class Proj4 {

	public static void main (String [] args) {
		Connection connection;
		
		try {
			connection  = getConnection();
			Statement statement = connection.createStatement();
			
			String query = "SELECT * FROM Albums";
			
			ResultSet music = statement.executeQuery(query);
			
			while(music.next()) {
				System.out.println(music.getString("AlbumID"));
				//System.out.println(music.ge);
			}
			
			music.close();
			
		}
		catch (SQLException ex) {
			System.out.println("Error accessing database" + ex.getMessage());
		}
		
		
	}//end main
	
	private static Connection getConnection() throws SQLException {
		
		String dbUrl = "jdbc:sqlite:music_artists.sqlite";
		Connection connection = DriverManager.getConnection(dbUrl);
		
		return connection;
	}
	
}

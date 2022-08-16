import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.HashMap;

public class MusicDB {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	private static int albumId;
	private static int artistId;
	private static String albumName;
	//private static String artistName;
	//private static HashMap<Integer, String> albumArtist = new HashMap<Integer, String>();

	
	public static void setAlbums() {
	
	Connection connection;
	
	try {
		connection  = getConnection();
		Statement statement = connection.createStatement();
		
		String query = "SELECT * FROM Albums";
		
		ResultSet music = statement.executeQuery(query);
		
		while(music.next()) {
			albumId = music.getInt("AlbumID");
			artistId = music.getInt("ArtistID");
			albumName = music.getString("Name");
			
			albums.add(new Album(albumId, artistId, albumName));

		}//end while
		
		for (int i = 0; i < albums.size(); i++) {
		System.out.println(albums.get(i).getAlbumId());
		System.out.println(albums.get(i).getAlbumId());
		System.out.println(albums.get(i).getAlbumName());
		}
		
		music.close();
		
	}//end try
	catch (SQLException ex) {
		System.out.println("Error accessing database" + ex.getMessage());
	}//end catch
	
	
}//end createAlbums
	
public static void setArtists() {
	
}

private static Connection getConnection() throws SQLException {
	
	String dbUrl = "jdbc:sqlite:music_artists.sqlite";
	Connection connection = DriverManager.getConnection(dbUrl);
	
	return connection;
}

}

//for mapping artistId from albums to artistName use artistId value to get value from artist hashmap

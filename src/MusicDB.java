import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;

public class MusicDB {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	private static ArrayList<Artist> artists = new ArrayList<Artist>();
	//private static ArrayList<ArrayList<String>> artistAlbums = new ArrayList<ArrayList<String>>();
	private static int albumId;
	private static int artistId;
	private static String albumName;
	private static String artistName;
	//private static String artistName;
	private static HashMap<Integer, ArrayList<String>> albumArtist = new HashMap<Integer, ArrayList<String>>();

	
	public static void setAlbums() {
		
	Connection connection;
	
	try {
		connection  = getConnection();
		Statement statement = connection.createStatement();
		
		String query = "SELECT * FROM Albums ORDER BY Name ASC;";
		
		ResultSet music = statement.executeQuery(query);
				
		while(music.next()) {
			albumId = music.getInt("AlbumID");
			artistId = music.getInt("ArtistID");
			albumName = music.getString("Name");
			
			while(albumArtist.get(artistId) == null){
				albumArtist.put(artistId, new ArrayList<String>());
			}
			
			albumArtist.get(artistId).add(albumName);
			
			albums.add(new Album(albumId, artistId, albumName));

		}//end while
		
		//for (int i = 0; i < albums.size(); i++) {
		//System.out.println(albums.get(i).getAlbumId());
		//System.out.println(albums.get(i).getArtistID());
		//System.out.println(albums.get(i).getAlbumName());
		//}
		
		music.close();
		
	}//end try
	catch (SQLException ex) {
		System.out.println("Error accessing database" + ex.getMessage());
	}//end catch
	
	
}//end setAlbums
	
public static void setArtists() {
	
		Connection connection;
		
		try {
			connection  = getConnection();
			Statement statement = connection.createStatement();
			
			String query = "SELECT * FROM Artists ORDER BY Name ASC;";
			
			ResultSet music = statement.executeQuery(query);
			
			while(music.next()) {
				artistId = music.getInt("ArtistID");
				artistName = music.getString("Name");
				
				//artistAlbums.add(albumArtist.get(artistId));
				
				//for (int i = 0; i < albums.size(); i++) {
				//if(artistId == albums.get(i).getArtistID()) {
				//	artistAlbums.add(albums.get(i).getAlbumName());
				//	System.out.println(artistAlbums);
				//}
				//else {
				//}
			
				//}
				
				
				artists.add(new Artist(artistId, artistName, albumArtist.get(artistId)));
				
				//artists.add(new Artist(artistId, artistName, artistAlbums));

				//System.out.println(albumArtist.get(artistId));
				//System.out.println(artistName);

			}//end while
			
			
			//for (int i = 0; i < artists.size(); i++) {
			//	System.out.println(artists.get(i).getArtistName());
				//System.out.println("boop");
		//}
			//System.out.println(albumArtist.get(1));
			music.close();
			
		}//end try
		catch (SQLException ex) {
			System.out.println("Error accessing database" + ex.getMessage());
		}//end catch
		
		
	}//end setArtists
	

private static Connection getConnection() throws SQLException {
	
	String dbUrl = "jdbc:sqlite:music_artists.sqlite";
	Connection connection = DriverManager.getConnection(dbUrl);
	
	return connection;
}

public static ArrayList<Artist> getArtists(){
	
	return artists;
}
}



import java.util.ArrayList;
import java.util.HashMap;

public class Artist {

	private String artistName;
	private int artistId;
	//private ArrayList<ArrayList<String>> albums;
	private ArrayList<String> albums;
	
	
	public Artist(int artistId, String artistName, ArrayList<String> albums) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.albums = albums;
	}
	public void setAlbums(ArrayList<String> albums) {
		this.albums = albums;
	}
	public ArrayList<String> getAlbums(){
		return albums;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	
	
	
}

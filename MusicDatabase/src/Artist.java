import java.util.ArrayList;

public class Artist {

	private String artistName;
	private int artistId;
	private ArrayList<Album> albums;
	
	
	public Artist(int artistId, String artistName, ArrayList<Album> albums) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
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

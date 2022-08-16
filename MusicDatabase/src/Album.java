
public class Album {

	private int artistID;
	private String albumName;
	
	public Album(int artistID, String albumName) {
		super();
		this.artistID = artistID;
		this.albumName = albumName;
	}
	public int getArtistID() {
		return artistID;
	}
	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	
	
}

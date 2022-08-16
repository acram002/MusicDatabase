
public class Album {

	private int albumId;
	private int artistID;
	private String albumName;
	
	
	public Album(int albumId, int artistID, String albumName) {
		super();
		this.albumId = albumId;
		this.artistID = artistID;
		this.albumName = albumName;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
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

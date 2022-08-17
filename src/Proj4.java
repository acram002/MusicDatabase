import java.util.ArrayList;

public class Proj4 {

	public static void main (String [] args) {
		MusicDB.setAlbums();
		
		MusicDB.setArtists();
		
		ArrayList<Artist> musicInfo = MusicDB.getArtists();
		//= new ArrayList<Artist>();
		//musicInfo = MusicDB.getArtists();
				
		System.out.println("Artist and Album Listing\n");
		System.out.println("Artists");
		System.out.println("-------");
		
		for(int i = 0; i < musicInfo.size(); i++) {
		System.out.println(musicInfo.get(i).getArtistName());
		}
		
		System.out.println("\nAlbums\n------");
		
		for (int i = 0; i < musicInfo.size(); i++) {
		for (String s : musicInfo.get(i).getAlbums()) {
			System.out.println(s);
		}
		}
		
		System.out.println("\nAlbums by Artist\n----------------");
		
		for(int i = 0; i < musicInfo.size(); i++) {
			System.out.println(musicInfo.get(i).getArtistName());
			for (String s : musicInfo.get(i).getAlbums()) {
				System.out.println("\t" + s);
			}
		}
		
	}//end main

	
}
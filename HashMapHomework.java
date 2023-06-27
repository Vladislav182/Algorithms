package Algoritmi;
import java.util.*;
public class HashMapHomework {
	 public static void pushSongsAndArtists(HashMap data ){
	        data.put("Artist1" , "song1");
	        data.put("Artist2" , "song2");
	        data.put("Artist3" , "song3");
	        data.put("Artist4" , "song4");
	        data.put("Artist5" , "song5");
	        data.put("Artist6" , "song6");
	        data.put("Artist7" , "song7");
	        data.put("Artist8" , "song8");
	        data.put("Artist9" , "song9");
	    }

	    public static void main(String[] args) {
	        //create data
	        HashMap<String, String> songsAndArtists = new HashMap<String, String>();
	        //push all songs and artists into it
	        pushSongsAndArtists(songsAndArtists);
	        //create dialog with user
	        songsAndArtists.get("song1");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter song or Artist for SEARCHING  (to cancel  this type END): ");
	        String actorOrSong = scanner.nextLine();


	        while(!actorOrSong.equals("END")){
	            if(songsAndArtists.containsKey(actorOrSong)){
	                    System.out.printf("Song [%s] is by %s%n" , songsAndArtists.get(actorOrSong) , actorOrSong);
	            }else if(songsAndArtists.containsValue(actorOrSong)){
	                for (Map.Entry< String, String> items : songsAndArtists.entrySet()){
	                    if(items.getValue().equals(actorOrSong)){
	                        System.out.printf("Artist [%s] sings %s%n" , items.getKey() , actorOrSong);
	                    }
	                }

	            }

	            System.out.print("Enter another song or actor : ");
	            actorOrSong = scanner.next();

	        }

	        System.out.println("BYE!");

	    }
	}



	
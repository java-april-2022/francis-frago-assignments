import java.util.HashMap;
import java.util.Set;

public class HashMatique {

    public static void main(String[] args) {
        HashMap<String, String> trackTitle = new HashMap<String, String>();
        trackTitle.put("Pardon Me", "Pardon me while I burst...");
        trackTitle.put("Dig" , "We all have something that digs at us...");
        trackTitle.put("Oil and Water" , "We've been trying, trying, trying, oh to mix it up.");
        trackTitle.put("Drive" , "Sometime I feel the fear of uncertainty stinging clear");

        String songTitle = trackTitle.get("Dig");
        System.out.println("\nSingle Track: ");
        System.out.println(songTitle);

        Set<String> keys = trackTitle.keySet ();
        System.out.println("\nFour Track Titles & Lyrics: ");
        for(String key : keys) {
            System.out.println(key + ": " + trackTitle.get(key));
        }
    }












}
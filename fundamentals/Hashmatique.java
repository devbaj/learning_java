import java.util.HashMap;
import java.util.Set;

public class Hashmatique
{
  public void MakeTrackMap()
  {
    HashMap<String, String> trackList = new HashMap<>();
    trackList.put("Knights of Cydonia", "Come ride with me through the veins of history");
    trackList.put("Supermassive Black Hole", "I thought I was a fool for no one");
    trackList.put("Map of the Problematique", "Fear and panic in the air");
    trackList.put("Assassin", "War is overdue, the time has come for you");
    trackList.remove("Assassin");
    Set<String> trackNames = trackList.keySet();
    for (String track : trackNames)
    {
      System.out.printf("%s: %s\n", track, trackList.get(track));
    }
  }
}
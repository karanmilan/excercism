import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {

    Map<String, Integer> newMap = new HashMap<String, Integer>();

    for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
      List<String> alphabets = entry.getValue();
      Integer value = entry.getKey();
      for (String current : alphabets) {
        newMap.put(current.toLowerCase(), value);
      }
    }

    return newMap;
  }
}

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {

   void storeKey(String key);

   List<String> fetchKey();

  default Map<String,Integer> keyData(){
     return null;
  }

}

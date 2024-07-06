import java.util.*;

public class KeyAnalyzerImpl implements KeyAnalyzer{

//    List<String> list = new ArrayList<>();
//Set<String> set = new HashSet<>();
//Set<String> set = new LinkedHashSet<>();
//    Set<String> set = new TreeSet<>();

//    Map<String,Integer> map = new HashMap<>();
    Map<String,Integer> map = new LinkedHashMap<>();


    @Override
    public void storeKey(String key) {
        //list.add(key);
//        set.add(key);
        if (map.containsKey(key)){
            map.put(key,map.get(key)+1);
            //System.out.println(map.get(key));
        }
        else {
            map.put(key,1);
        }
    }

    @Override
    public List<String> fetchKey() {
//        return List.copyOf(set);
        return null;
    }

    @Override
    public Map<String, Integer> keyData() {
return map;
    }
}

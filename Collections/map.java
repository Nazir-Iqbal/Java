import java.util.*;

class Demo {
    public static void main(String[] args){
        // Map
        HashMap<String,Integer> sampleMap = new HashMap<>();
        // TreeMap<String,Integer> students = new TreeMap<>();
        // LinkedHashMap<String,Integer> = new LinkedHashMap<>();

        sampleMap.put("apple", 10);
        sampleMap.put("banana", 5);
        sampleMap.put("cherry", 7);
        sampleMap.put("mango", 12);
        sampleMap.put("orange", 6);

        // iterate in the map using keyset
        for(String key : sampleMap.keySet()){
            System.err.println(key+" : "+sampleMap.get(key));
        }

        //  iterate using the entry set
        for(var entry : sampleMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
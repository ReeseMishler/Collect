import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		
		// Sets are not ordered. no duplicate Element
		// HashSet TreeSet implement set
		// Tree has a structure/order
		
		// String as key
		
		List<Integer> list1 = new ArrayList<Integer>();
	      list1.add(100);
	      list1.add(200);
	      list1.add(300);
	      list1.add(400);
	      list1.add(400);
	      list1.add(500);
	      list1.add(600);
	      list1.add(600);
	      list1.add(700);
	      list1.add(400);
	      list1.add(500);
	      System.out.println("original list");
	      for (Integer num: list1)
        	  System.out.println(num);
	      
	      HashSet<Integer> set = new HashSet<Integer>(list1);
	      
	      List<Integer> list2 = new ArrayList<Integer> (set);
	      
          System.out.println("List after set removes duplicates");
          for (Integer num: list2)
        	  System.out.println(num);
          
          //Show HashMap and TreeMap examples
          
          HashMap<String, Integer> countryMap = new HashMap<String, Integer>();
          countryMap.put("Germany", 1);
          countryMap.put("Brazil", 2);
          countryMap.put("Finland", 3);
          countryMap.put("USA", 4);
          countryMap.put("Canada", 5);
          
          System.out.println("original country map");
	      for (String key: countryMap.keySet())
        	  System.out.println(key);
          
          TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
          treeMap.putAll(countryMap);
          
          System.out.println("country map after being put into a treeMap");
          for (String key: treeMap.keySet())
        	  System.out.println(key);
          
          
	}

}

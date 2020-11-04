import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
	      
	      HashSet<Integer> set = new HashSet<Integer>(list1);
	      
	      List<Integer> list2 = new ArrayList<Integer> (set);
	      
	      

	}

}

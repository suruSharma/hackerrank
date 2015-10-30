import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CheckSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set setA = new HashSet();

		String element = "element 1";

		setA.add(element);
		setA.add(element);
		setA.add(element);
		setA.add(element);

		Iterator iter = setA.iterator();
		
		System.out.println(setA.size());
		while (iter.hasNext()) {
		    System.out.println(iter.next());
		}
	}

}

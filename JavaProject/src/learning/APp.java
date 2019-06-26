package learning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.lang.model.util.Elements;

public class APp {
	
	public static void main(String[] args) {
		
		List<GenericClass<Integer>> elements = new LinkedList<>();

		elements.add(new GenericClass<Integer>(1));
		elements.add(new GenericClass<Integer>(2));
		elements.add(new GenericClass<Integer>(3));
		elements.add(new GenericClass<Integer>(4));

		APp app = new APp();
		app.printList(elements);
		
	}
	
	void printList(List<GenericClass<Integer>> list) {
		Iterator<GenericClass<Integer>> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

	
}

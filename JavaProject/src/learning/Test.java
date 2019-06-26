package learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws MyException {

	GenericClass<String> gc = new GenericClass("hello generic");
	String s = gc.getData();
		
	List<GenericClass<Object>> date = new ArrayList<>();
	date.add(new GenericClass<Object>("hello"));
	date.add(new GenericClass<Object>("yelllo"));
	date.add(new GenericClass<Object>("wite"));
	date.add(new GenericClass<Object>("blak"));
	date.add(new GenericClass<Object>("hi"));

	
	
	System.out.print(date);

		
	}

}

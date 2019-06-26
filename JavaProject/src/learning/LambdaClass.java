package learning;

import java.util.function.IntPredicate;

public class LambdaClass {

	public static void main(String[] args) {

		IntPredicate p = i -> i<18;
		System.out.println(p.test(19));
	}

}

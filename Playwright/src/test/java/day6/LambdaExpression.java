package day6;

import java.util.ArrayList;

public class LambdaExpression {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    
		numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    numbers.forEach( (n) -> { System.out.println(n); } );
	  }
	}
	
// Lambda syntax:
//	Consumer alert= (n) -> System.out.println(n);
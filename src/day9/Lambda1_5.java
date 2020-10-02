package day9;

import java.util.*;
import java.util.function.Predicate;


public class Lambda1_5 
{
	public static void main(String[] args) {
		  
		  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(33,785,347,222,11,12,248));
		  Predicate<Integer> isEvenFunction=n->n%2==0;
		  
		  numbers.forEach(n->{
			  System.out.println("Applying is Even function on  "+n+"  and result is :"+isEvenFunction.test(n));
		  });
		  
	   }
}

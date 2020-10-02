package day9;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;


class MyConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println("Method2 value::"+t);
	}
}

public class Lambda1_4 
{
	public static void main(String[] args) {
		  
		  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(65,29,98,72,98,63,24));
		  Function<Integer,Double> doubleFunction=Integer->(Double.valueOf(Integer));
		  numbers.forEach(n->{
			  System.out.println("Applying double function "+doubleFunction.apply(n));
		  });
		  
	   }
}

package day9;

@FunctionalInterface
interface MathFunction{
	int calculate(int a,int b);
	
	static void printResult(int a,int b,String function,MathFunction fobj) {
		System.out.println("Result of "+function+" is "+fobj.calculate(a,b));
	}
}
public class Lambda1_2 
{
	 public static void main(String[] args) {
		   MathFunction add=(x,y)->x+y;
		   MathFunction subtract=(x,y)->x-y;
		   MathFunction division=(x,y)->x/y;
		   int a,b;
		   a=50;
		   b=25;
		   MathFunction.printResult(a, b,"Addition", add);
		   MathFunction.printResult(a, b,"Subtraction", subtract);
		   MathFunction.printResult(a, b,"Division", division);
		   
	   }
}

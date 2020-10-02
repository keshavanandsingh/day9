package day9;

@FunctionalInterface
interface MathFunction{
	int calculate(int a,int b);
}

public class Lambda1_1
{
	 public static void main(String[] args) {
		   MathFunction add=(x,y)->x+y;
		   MathFunction subtract=(x,y)->x-y;
		   MathFunction division=(x,y)->x/y;
		   int a,b;
		   a=50;
		   b=25;
		   System.out.println("Addition is : "+add.calculate(a, b));
		   System.out.println("Subtraction is : "+subtract.calculate(a, b));
		   System.out.println("Division is : "+division.calculate(a, b));
	   }
}

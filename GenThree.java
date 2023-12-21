/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		double num1 = (double)(Math.random() * (b-a)+a);
		double num2 = (double)(Math.random() * (b-a)+a);
		double num3 = (double)(Math.random() * (b-a)+a);
		double minnum = Math.min(num1,Math.min(num2,num3));
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("The minimal generated number was " + minnum);

		// Put your code here	
	}
}

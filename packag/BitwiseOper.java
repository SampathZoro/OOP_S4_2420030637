package packag;
import java.util.*;
//Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
public class BitwiseOper {
	public static void main (String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("AND Operator is  "+ (a&b));
		System.out.println("OR Operator is  "+ (a|b));
		System.out.println("XOR Operator is  "+ (a^b ));
		System.out.println("Complement Operator is  "+ ~a + " " + ~b);
	} 
	
}
package packag;
import java.util.*;
//Check if a student passed both theory and practical exams using logical AND
public class ANDoperator {
	public static void main (String[] args) {
		System.out.println("Enter two MARKS of the THEORY AND PRACTIAL for 60 and 40");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > 20 && b > 15) {
			System.out.println("Student is Passed");
		}
		else {
			System.out.println("FAILED");
		}
	}
		}

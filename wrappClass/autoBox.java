

package wrappClass;
import java.util.Scanner;

public class autoBox {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in); 
		 System.out.println("Enter a number");
  int a=sc.nextInt();
  Integer i=a;
  System.out.println("Autoboxing: "+i);

	}
}
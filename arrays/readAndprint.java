package arrays;
import java.util.*;
public class readAndprint {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter a array");
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Array:");
      System.out.println(Arrays.toString(arr));
	}

}
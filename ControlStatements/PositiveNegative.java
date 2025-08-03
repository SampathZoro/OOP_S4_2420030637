package ControlStatements;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0) {
        	System.out.println("the give number "+a+" is Positive");
        }
        else if(a<0) {
        	System.out.println("the give number "+a+" is Negative");
        }
	}

}
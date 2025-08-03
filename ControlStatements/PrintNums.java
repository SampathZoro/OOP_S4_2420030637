package ControlStatements;

import java.util.Scanner;

public class PrintNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	System.out.print(i+" ");
        }
	}

}
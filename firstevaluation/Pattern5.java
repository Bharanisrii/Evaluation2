package firstevaluation;

import java.util.Scanner;

public class Pattern5 {
public static void main(String[]args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter The Value: ");
	        int n = scanner.nextInt();
	       

	      	        for (int i = 0; i < n; i++) {
	      	        	
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - 1 - j) {
	                    System.out.print("1");
	                
	                	} else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}
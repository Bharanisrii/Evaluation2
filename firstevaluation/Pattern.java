
package firstevaluation;

public class Pattern {
	

	    public static void main(String[] args) {
	        char input = 'F';
	        int n = input - 'A' + 1;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.print((char) ('A' + i));
	            if (i > 0) {
	                for (int j = 0; j < 2 * i - 1; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print((char) ('A' + i));
	            }
	            System.out.println();
	        }

	        for (int i = n - 2; i >= 0; i--) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.print((char) ('A' + i));

	            if (i > 0) {
	                for (int j = 0; j < 2 * i - 1; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print((char) ('A' + i));
	            }
	            System.out.println();
	        }
	    }
	}


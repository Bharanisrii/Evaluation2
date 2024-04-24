package firstevaluation;


	import java.util.*;

	import java.util.ArrayList;
	import java.util.List;

	public class LargestContiguousSubarray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the array size");
	        int size=scanner.nextInt();
	        
	        int[]array=new int[size];
	        System.out.println("Enter The Array elements");
	        for(int i=0;i<size;i++) {
	        array[i]=scanner.nextInt();
	        
	        }
	        
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;
	        List<Integer> currentSubarray = new ArrayList<>();
	        List<Integer> maxSubarray = new ArrayList<>();

	        for (int num : array) {
	            if (num >= 0) {
	                currentSum += num;
	                currentSubarray.add(num);
	                if (currentSum > maxSum) {
	                    maxSum = currentSum;
	                    maxSubarray = new ArrayList<>(currentSubarray);
	                }
	            } else {
	                currentSum = 0;
	                currentSubarray.clear();
	            }
	        }

	        System.out.println("Sum: " + maxSum);
	        System.out.print("Elements: ");
	        for (int i = 0; i < maxSubarray.size(); i++) {
	            System.out.print(maxSubarray.get(i));
	            if (i < maxSubarray.size() - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();
	    }
	}
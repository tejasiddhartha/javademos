package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayProgram {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myIntegers = getIntegers(5);
		printMyArray(myIntegers);
		double average = getAverage(myIntegers);
		System.out.println("Average = " + average);
		
		
		System.out.println("Minimum = " + findMin(myIntegers));
		
		int[] newArray = new int[5];
		for (int i=0; i<myIntegers.length; i++)
			newArray[i] = myIntegers[i];
		
		int[] newnewArray = Arrays.copyOf(myIntegers, myIntegers.length);
		printMyArray(newnewArray);
		
		printMyArray(newArray);
		
	}

	private static int findMin(int[] myIntegers) {
		int min = Integer.MAX_VALUE;
		for (int i=0; i<myIntegers.length; i++) {
			if (myIntegers[i] < min)
				min = myIntegers[i];
		}
		return min;
	}

	private static double getAverage(int[] myIntegers) {
		int sum = 0;
		for (int i=0; i<myIntegers.length; i++)
			sum += myIntegers[i];
		return sum / myIntegers.length;
	}

	private static void printMyArray(int[] myIntegers) {
		for (int i=0; i<myIntegers.length; i++)
			System.out.println("Element " + i + ", value is " + myIntegers[i]);		
	}

	private static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		for (int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
}

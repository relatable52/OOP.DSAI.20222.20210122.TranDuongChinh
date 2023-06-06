import java.util.Scanner;

public class MyArray {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter array: ");
		String strArr = keyboard.nextLine();
		String[] strNums = strArr.trim().split(" ");
		double[] myArr = new double[strNums.length];
		
		double sum = 0;
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = Double.parseDouble(strNums[i]);
			sum += myArr[i];
		}
		
		sortArr(myArr);
		
		System.out.print("Sorted array: ");
		for (int i = 0; i<myArr.length; i++) {
			System.out.print(myArr[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Sum of array: " + sum);
		System.out.println("Average value of array: " + (sum/myArr.length));
	}
	
	private static void sortArr(double[] a) {
		boolean sorted = false;
		
		for (int i = 0; i < a.length - 1; i++) {
			sorted = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] >= a[j+1]) {
					a[j] += a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
		}
	}
}

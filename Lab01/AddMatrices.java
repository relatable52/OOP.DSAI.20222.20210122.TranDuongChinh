import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		int n;
		
		System.out.print("Enter the number of rows: ");
		m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		n = sc.nextInt();
		
		double[][] mat1 = new double[m][n];
		double[][] mat2 = new double[m][n];
		
		System.out.println("Enter the first matrix line by line (seperated by space): ");
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				mat1[i][j] = Double.parseDouble(sc.next());
			}
		}
		
		System.out.println("Enter the second matrix line by line (seperated by space): ");
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				mat2[i][j] = Double.parseDouble(sc.next().trim());
			}
		}
		
		System.out.println("The sum of two matrices:");
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				System.out.print((mat1[i][j] + mat2[i][j]) + " ");
			}
			System.out.println("");
		}
	}
}

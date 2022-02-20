package array_2D;

import java.util.*;

public class diagonalTraversal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int [][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scn.nextInt();
			}
		}

		for(int i=0;i<=n;i++) {
			for(int j=i,c=0;j<n;j++,c++) {
				System.out.println(arr[c][j]);
			}
			
		}
		scn.close();
	}

}
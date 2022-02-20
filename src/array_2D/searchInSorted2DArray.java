package array_2D;

import java.util.Scanner;

public class searchInSorted2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int [][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int ele = scn.nextInt();
		int check=0;
		for(int i=0;i<m;i++) {
			if(arr[i][n-1]==ele) {
				System.out.print(i+" "+(n-1));
				check=1;
				break;
			}
			else if(arr[i][n-1]>ele) {
				for(int j=n-1;j>=0;j--) {
					if(arr[i][j]==ele) {
						System.out.print(i+" "+j);
						check=1;
						break;
					}
				}
			}
			else if(arr[i][n-1]<ele) {
				continue;
			}
			
		}
		if (check!=1) {
			System.out.println("Element Not Found");
		}
		scn.close();
		
	}


}

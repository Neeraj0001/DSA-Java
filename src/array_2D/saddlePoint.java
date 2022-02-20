package array_2D;

import java.util.Scanner;

public class saddlePoint {

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
		for(int i=0;i<m;i++) {
			int min=arr[i][0];
			int temp=0;
			for(int j=0;j<n;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
					temp=j;
					
				}
			}
			int max=arr[i][0];
			int k;
			for(k=0;k<m;k++) {
				if(max<arr[k][temp]) {
					max=arr[k][temp];
				}
			}
			if(min==max) {
				
				System.out.println(arr[i][temp]);
			}
//			System.out.print(min+" "+ max);
		}
		
		
		
		
		scn.close();
		
	}

}

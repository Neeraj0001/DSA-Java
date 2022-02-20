package array_2D;
import java.util.*;

public class Array_2D_Rotate_90_Degree {
	public static void Rotate(int [][] arr,int m,int n) {
		int temp=0;
		for(int i=0;i<m;i++) {
			for(int j=i;j<n;j++) {
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}	
	}
	public static void leftshift_clockwise(int [][] arr,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void bottomshift_anticlockwise(int [][] arr,int m,int n) {
		for(int i=m-1;i>=0;i--) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
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
		Rotate(arr,m,n);
		System.out.println("Rotate 90 Degree Clockwise");
		leftshift_clockwise(arr,m,n);
		System.out.println("Rotate 90 Degree Anticlockwise");
		bottomshift_anticlockwise(arr,m,n);
		scn.close();
	}

}

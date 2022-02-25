package recursion_and_backtracking;

import java.util.Scanner;

public class arrayDisplayReverse {
	public static void displayReverse(int[] arr,int idx) {
		if(idx==arr.length) {
			return;
		}
		displayReverse(arr,idx+1);
		
		System.out.println(arr[idx]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		displayReverse(arr,0);
		scn.close();
	}
	
}

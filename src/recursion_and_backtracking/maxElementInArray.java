package recursion_and_backtracking;

import java.util.Scanner;

public class maxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		int maxele = maxElement(arr,0);
		System.out.println(maxele);
		scn.close();
	}
	public static int maxElement(int[] arr, int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		int temp = maxElement(arr,idx+1);
		if(temp>=arr[idx]) {
			return temp;
		}
		else {
			return arr[idx];
		}
		
		
	}

}

package recursion_and_backtracking;

import java.util.Scanner;

public class firstIndexOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		int searchEle = scn.nextInt();
		int maxEle = maxElement(arr,0,searchEle);
		System.out.println(maxEle);
		scn.close();
	}
	public static int maxElement(int[] arr,int idx,int searchEle) {
		if(arr[idx]==searchEle) {
			return idx;
		}
		else if(idx == arr.length) {
			return -1;
		}
		
		int firstEleIndex = maxElement(arr,idx+1,searchEle);
		return firstEleIndex;
		
		
	}

}

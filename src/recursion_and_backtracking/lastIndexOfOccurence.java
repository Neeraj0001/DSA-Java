package recursion_and_backtracking;

import java.util.Scanner;

public class lastIndexOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		int searchEle = scn.nextInt();
		int lastIndex = lastElementIndex(arr,0,searchEle);
		System.out.println(lastIndex);
		scn.close();

	}

	public static int lastElementIndex(int[] arr,int idx,int ele) {
		if(arr.length==idx) {
			return -1;
			
		}
		int firstEleIndex = lastElementIndex(arr,idx+1,ele);
		if (firstEleIndex ==-1) {
			if(arr[idx]==ele) {
				return idx;
			}
			else {
				return -1;
			}
		}
		else {
			return firstEleIndex;
		}
		
		
		
	}
}

package recursion_and_backtracking;

import java.util.Scanner;

public class allIndicesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		int searchEle = scn.nextInt();
		int[] iarr = allIndices(arr,searchEle,0,0);
		if(iarr.length==0) {
			System.out.println();
		}
		else {
			for(int i=0;i<iarr.length;i++) {
				System.out.println(iarr[i]);
			}
		}
		scn.close();
	}
	
	public static int[] allIndices(int[] arr,int ele,int idx,int fsf) {
		if(idx==arr.length) {
			int[] resultarray=new int[fsf];
			return resultarray;
		}
		else {
			if(arr[idx]==ele) {
				int[] result=allIndices(arr,ele,idx+1,fsf+1);
				result[fsf]=idx;
				return result;
				
			}
			else {
				int[] result=allIndices(arr,ele,idx+1,fsf);
				return result;
			}
			
			
			
			
			
		}
		
	}

}

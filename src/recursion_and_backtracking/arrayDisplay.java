package recursion_and_backtracking;
import java.util.*;
public class arrayDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		displayArray(arr,0);
		scn.close();
	}
	public static void displayArray(int[] arr,int idx) {
		System.out.println(arr[idx]);
		if(arr.length==idx+1) {
			return;
		}
		displayArray(arr,idx+1);

	}

}

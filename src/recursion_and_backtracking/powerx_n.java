package recursion_and_backtracking;

import java.util.Scanner;

public class powerx_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int out= power(x,n);
		System.out.println(out);
		scn.close();

	}
	public static int power(int x,int N) {
		if(N==1) {
			return x;
		}
		int func = power(x,N-1);
		int res =x*func;
		return res;
	}
	
}

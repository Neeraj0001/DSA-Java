package recursion_and_backtracking;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int out= fact(n);
		System.out.println(out);
		scn.close();

	}
	
	public static int fact(int N) {
		if(N==1) {
			return 1;
		}
		int func = fact(N-1);
		int res =N*func;
		return res;
	}
}

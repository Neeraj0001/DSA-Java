package recursion_and_backtracking;

import java.util.Scanner;

public class power_log {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int out= power_logarithmic(x,n);
		System.out.println(out);
		scn.close();

	}
	
	public static int power_logarithmic(int X,int N) {
		if(N==1) {
			return X;
		}
		int func=power_logarithmic(X,N/2);
		if(N%2==0) {
			return func*func;
		}
		else {
			return func*func*X;
		}
		
		
	}

}

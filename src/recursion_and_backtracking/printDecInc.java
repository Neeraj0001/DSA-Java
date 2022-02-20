package recursion_and_backtracking;

import java.util.Scanner;

public class printDecInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecIncrease(n);
		scn.close();

	}
	
	public static void printDecIncrease(int N) {
		if(N==0) {
			return ;
		}
		System.out.println(N);
		printDecIncrease(N-1);
		System.out.println(N);
	}
}

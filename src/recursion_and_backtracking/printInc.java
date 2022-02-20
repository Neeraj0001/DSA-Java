package recursion_and_backtracking;

import java.util.Scanner;

public class printInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printIncrease(n);
		scn.close();

	}
	
	public static void printIncrease(int N) {
		if(N==0) {
			return ;
		}
		
		printIncrease(N-1);
		System.out.println(N);
	}

}

package recursion_and_backtracking;
import java.util.*;
public class printDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecrease(n);
		scn.close();

	}
	
	public static void printDecrease(int N) {
		if(N==0) {
			return ;
		}
		System.out.println(N);
		printDecrease(N-1);
	}

}

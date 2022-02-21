package recursion_and_backtracking;
import java.util.*;

public class zig_zag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Very Important Question for tree
		Scanner scn = new Scanner(System.in);
		int N =scn.nextInt();
		zigzag(N);
		scn.close();
	}
	
	public static void zigzag(int N) {
		if(N==0) {
			return ;
		}
		System.out.println("PRE"+N);
		zigzag(N-1);
		System.out.println("IN"+N);
		zigzag(N-1);
		System.out.println("POST"+N);
	}

}

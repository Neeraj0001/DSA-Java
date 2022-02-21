package recursion_and_backtracking;
import java.util.*;
public class towerOFHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int toh1 = scn.nextInt();
		int toh2 = scn.nextInt();
		int toh3 = scn.nextInt();
		tOH(n,toh1,toh2,toh3);
		scn.close();
	}
	public static void tOH(int N, int t1,int t2,int t3) {
		if(N==0) {
			return;
		}
		tOH(N-1,t1,t3,t2);
		System.out.println(N+"["+t1+"->"+t2+"]");
		tOH(N-1,t3,t2,t1);
	}

}

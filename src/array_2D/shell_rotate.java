package array_2D;
import java.util.*;
public class shell_rotate {
	
	public static int[] shellToArray_1D (int [][] arr,int s) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length -s;
		int maxc = arr.length -s;
		int count=0;
		int size_1D = (2*(maxr-minr+1)+2*(maxc-minc+1))-4;
		int[] oned = new int[size_1D];
		//left
		for(int i=minr,j=minc;i<=maxr;i++) {
			oned[count]=arr[i][j];
			count++;
		}
		minc++;
		//Right
		for(int i=maxr,j=minc;j<=maxc;j++) {
			oned[count]=arr[i][j];
			count++;
		}
		maxr--;
		for(int i=maxr,j=maxc;i>=minr;i--) {
			oned[count]=arr[i][j];
			count++;
		}
		maxc--;
		for(int i=minr,j=maxc;j>=minc;j--) {
			oned[count]=arr[i][j];
			count++;
		}
		minr--;
		return oned;
		
	}
	public static void array_1DToShell (int [][] arr,int [] oned ,int s) {
		int minr = s-1;
		int minc = minr;
		int maxr = arr.length -s;
		int maxc = arr.length -s;
		int count=0;


		//left
		for(int i=minr,j=minc;i<=maxr;i++) {
			arr[i][j]=oned[count];
			count++;
		}
		minc++;
		//Right
		for(int i=maxr,j=minc;j<=maxc;j++) {
			arr[i][j]=oned[count];
			count++;
		}
		maxr--;
		for(int i=maxr,j=maxc;i>=minr;i--) {
			arr[i][j]=oned[count];
			count++;
		}
		maxc--;
		for(int i=minr,j=maxc;j>=minc;j--) {
			arr[i][j]=oned[count];
			count++;
		}
		minr--;

		
	}
	
	
	
	public static void rotateArray(int [] oned, int rotate) {
		int temp=0;
		for(int i=0,j=oned.length-rotate-1;i<(oned.length-rotate)/2;i++) {
			temp=oned[j];
			oned[j]=oned[i];
			oned[i]=temp;
			j--;
		}
		for(int i=oned.length-rotate,j=1;i<(oned.length+(oned.length-rotate))/2;i++) {
			temp=oned[i];
			oned[i]=oned[oned.length-j];
			oned[oned.length-j]=temp;
			j++;
		}
		for(int i=0;i<oned.length/2;i++) {
			temp=oned[i];
			oned[i]=oned[oned.length-i-1];
			oned[oned.length-i-1]=temp;
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int [][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int shell = scn.nextInt();
		int rotation = scn.nextInt();
		if (shell <= arr.length/2) {
			int[] oned = shellToArray_1D(arr,shell);
			System.out.println("One-D Array of the input shell value");
			for(int i=0;i<oned.length;i++) {
				System.out.println(oned[i]);
			}
			rotateArray(oned,rotation);


			array_1DToShell(arr,oned,shell);
			System.out.println("After Shell Rotation");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				
				}
				System.out.println();
			}
		}
		else {
		System.out.println("Wrong Shell number ");
		}
		scn.close();
		}

	}



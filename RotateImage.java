import java.util.*;
public class Rotateimage{
	public static void main(String[] ars){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				m[i][j]=sc.nextInt();
			}
		}
		rotate(m,n);
		// for(int i=n-1;i>=0;i--){
			// for(int j=0;j<n;j++){
				// System.out.print(m[j][i]+" ");
			// }
			// System.out.println();
		// }
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rotate(int m[][],int n){
		for(int row=0;row<n;row++){
			int start_col=0;
			int end_col=n-1;
			while(start_col<end_col){
				m[row][start_col]=m[row][start_col]+m[row][end_col];
				m[row][end_col]=m[row][start_col]-m[row][end_col];
				m[row][start_col]=m[row][start_col]-m[row][end_col];
				
				start_col++;
				end_col--;
			}
		}
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println("i,j"+i+j);
				if(i<j){
					m[i][j]=m[i][j]+m[j][i];
					m[j][i]=m[i][j]-m[j][i];
					m[i][j]=m[i][j]-m[j][i];
				}
			}
		}
	}
}
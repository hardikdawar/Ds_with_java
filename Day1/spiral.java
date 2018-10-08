import java.util.*;
class spiral{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[10][10];
		System.out.println("enter the value of rows and column of matrix");
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++){
			if(i%2==0){
				for(int j=0;j<n;j++){
					System.out.print(arr[i][j]+" ");
				}
			}
				else{
					for(int j=m-1;j>=0;j--){
						System.out.print(arr[i][j]+" ");
					}
				}
		}
		
	}
}
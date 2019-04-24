import java.util.Scanner;
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE NO.  ");
int n=sc.nextInt();
int[][] arr=new int[n][n];

int i=0,j=0,k=1,m=n,n1=0;

while(k<=n*n)
{

i=n1;
if(k<=n*n)
for(j=n1;j<m;j++){
		arr[i][j]=k;
		k++;
	}
j=j-1;
if(k<=n*n)
for(i=n1+1;i<m;i++){
	arr[i][j]=k;
	k++;
}

i--;
if(k<=n*n)
for(j=m-2;j>=n1;j--){
	arr[i][j]=k;
	k++;
}

j=n1;
if(k<=n*n)
for(i=m-2;i>n1;i--){
	arr[i][j]=k;
	k++;
}
m--;
n1++;
}


//	arr[]



for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		System.out.printf("%3d ",arr[i][j]);
	}
	//System.out.printf("%2d\n",arr[i][j]);
	System.out.println();
}


	}

}

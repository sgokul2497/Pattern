/**
 * Alternate factoral and natural numbers
 * factorial starts with 0,1,1,2,3,5.....
 * natural number starts with 1,2,3,4,5,6.....
 * the pattern is 0,1,1,2,1,3,2,4,3,5,5,6,8,7,13,8,21,9,34........
 * get the number for that particular location
 * 
 */




import java.util.Scanner;

//import java.Math.*;
public class PatternAlternateFactoralAndNaturalNumbers
{
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b1=0,b2=1;
	if(a%2==0){
		System.out.println(a/2);
	}
	
	else{
		if(a==0)
			System.out.print("0");
		for(int i=1;i<a/2;i++){
		
		
		int temp=b2;
		b2=b1+b2;
		b1=temp;
		
	}System.out.print(b2);
		
	}
	
sc.close();
	}
}

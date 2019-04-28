/**
 * Ocrrance for all variable with one iteration(if sorting order)
 * if the array is not noted using sort then find occurance in one iteration
 * 
 */


import java.util.*;

public class OccuranceForAllVariableInOneIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).nextLine();
		char[] arr=s.toCharArray();
		int count=1;
		int i;
		Arrays.sort(arr);
		System.out.println(arr);
			for(i=0;i<s.length()-1;i++){
				if(arr[i]==arr[i+1])
					count++;
				else
				{
					System.out.println(arr[i]+" "+count);
					count=1;
				}
			}
			
			
			
			
			
			
			if(i==s.length()-1){
				if(arr[i-1]==arr[i])
					System.out.println(arr[i]+" "+count);
				else
					System.out.println(arr[i]+" 1");
			}
			
			
		
		
		
		
	
	}

}

package Java_Practice;

import java.util.HashSet;

public class hash_map {

	public static void main(String[] args) {
		
		int arr[]= {10,10,20,30,10,10,30};
		
		HashSet hs = new HashSet(); 
		for(int i=0;i<=arr.length-1;i++) {
			if(hs.add(arr[i])) {
				System.out.println(arr[i]+" "+i);
			}
			else
			{
				System.out.println("This is duplicate value "+arr[i]+" "+i);
			}
		}
	}
}

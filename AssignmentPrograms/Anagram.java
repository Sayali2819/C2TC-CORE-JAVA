import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String s1 = sc.next();
		
		System.out.println("Enter String2:");
		String s2 = sc.next();
		
		//Convert String to Array
		char arr1[] = s1.toLowerCase().toCharArray();
		char arr2[] = s2.toLowerCase().toCharArray();
		
		if(arr1.length != arr2.length)
		{
			System.out.println("Not Anagram!");
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean status = Arrays.equals(arr1, arr2);
		
		if(status) 
		{
			System.out.println("Anagram!");
		}
		else 
		{
			System.out.println("Not Anagram");
		}
	}

}

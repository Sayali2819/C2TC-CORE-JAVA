import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		int sum = 0;
		int product = 1, lastdigit;
		
		while(n>0) {
			lastdigit = n % 10;
			sum = sum + lastdigit;
			product = product * lastdigit;
			n = n/10;
		}
		if(sum == product) {
			System.out.println("Number is a Spy Number");
		}
		else
		{
			System.out.println("Number is not Spy Number");
		}

	}

}

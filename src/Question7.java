import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no : ");
		int no = scanner.nextInt();
		while(no <= 0) {
			System.out.println("Number is negative. Please enter positive number again : ");
			no = scanner.nextInt();
		}
		double ans = Math.sqrt(no);
		System.out.println("Square Root is : " + ans);
		
		scanner.close();
	}

}

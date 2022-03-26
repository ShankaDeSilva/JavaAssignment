import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		int no = 0, total = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("I will add up numbers you give me");

		do {
			System.out.println("Number : ");
			no = scanner.nextInt();
			total = total + no;
			System.out.println("Total so far is " + total);
		}
		while(no  != 0);
	}

}

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		int from, to, by;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Count from : ");
		from = scanner.nextInt();
		System.out.println("Count to : ");
		to = scanner.nextInt();
		System.out.println("Count by : ");
		by = scanner.nextInt();
		
		for(int i = from; i <= to;) {
			System.out.print(i + " ");
			i = i + by;
		}
		scanner.close();
	}

}

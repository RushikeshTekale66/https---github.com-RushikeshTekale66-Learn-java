import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "Rushikesh";
		System.out.println("Enter character to check : ");
		char ch = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Count of character : " + ch + " is " + count);

	}
}
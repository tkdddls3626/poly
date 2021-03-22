import java.util.Scanner;

public class codeup1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int list[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			list[i] = s.charAt(i) - '0';
		}

		System.out.println("[" + list[0] * 10000 + "]");
		System.out.println("[" + list[1] * 1000 + "]");
		System.out.println("[" + list[2] * 100 + "]");
		System.out.println("[" + list[3] * 10 + "]");
		System.out.println("[" + list[4] + "]");
	}
}
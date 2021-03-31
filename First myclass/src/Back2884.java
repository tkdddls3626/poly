import java.util.Scanner;

public class Back2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<45) {
			m+=60; 					//https://javacatcher.tistory.com/9
			h--;
			if(h<0) h=23;
		}
		System.out.println(h+" "+(m-45));
	}

}

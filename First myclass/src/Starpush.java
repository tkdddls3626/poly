import java.util.Scanner;
public class Starpush {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i,j;
		
		for(i=1; i<=a; i++) {
			for(j=a; j>0; j--) {	
			if(j>i) {
			System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
		}
			System.out.println();
	}

}
}

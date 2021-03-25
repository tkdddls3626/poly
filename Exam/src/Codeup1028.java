import java.util.Scanner;
public class Codeup1028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d;
	      String arr = sc.next(); // 문자열을 입력받음
	        String[] A = arr.split("\\-");  // split는 문자열 string를 쪼갠다 (:)이걸로
	        int b = Integer.parseInt(A[1]); //string 타입의 숫자를 int타입으로 변환시켜줌
	        
	        System.out.printf("%02d", b);
	}

}

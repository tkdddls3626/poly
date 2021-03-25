import java.util.Scanner;
public class coceup1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      String arr = sc.next(); // 문자열을 입력받음
	        String[] A = arr.split("\\.");  // split는 문자열 string를 쪼갠다 (:)이걸로
	        
	        System.out.printf("%s-%s-%s", A[2],A[1],A[0]);
	}

}
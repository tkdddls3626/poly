import java.util.Scanner;
public class coceup1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      String arr = sc.next(); // ���ڿ��� �Է¹���
	        String[] A = arr.split("\\.");  // split�� ���ڿ� string�� �ɰ��� (:)�̰ɷ�
	        
	        System.out.printf("%s-%s-%s", A[2],A[1],A[0]);
	}

}
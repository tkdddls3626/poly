import java.util.Scanner;
public class Codeup1028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d;
	      String arr = sc.next(); // ���ڿ��� �Է¹���
	        String[] A = arr.split("\\-");  // split�� ���ڿ� string�� �ɰ��� (:)�̰ɷ�
	        int b = Integer.parseInt(A[1]); //string Ÿ���� ���ڸ� intŸ������ ��ȯ������
	        
	        System.out.printf("%02d", b);
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backeaam03{

   public static void main(String[] args) throws IOException{
      // ���۸��� �Է¹޴� ��ü ����
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      // ���۶����� ����ϴ� ��ü ����
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // ��� ������� �Է¹޴� ���� ����
      int t = Integer.parseInt(bf.readLine());
      // ��Ʈ�� ��ũ������ ��ü ����
      StringTokenizer st;
      
      for(int i = 0; i < t; i++) {
         // ��ũ������ ��ü ���� �Է¹��� ���۰��� ���� �������� ����
         // 1 1 �Է��ϸ� 11�� �����ϸ鼭 ��� �ڿ� ����
         st = new StringTokenizer(bf.readLine());
         // 
         bw.write((Integer.parseInt(st.nextToken())) + Integer.parseInt(st.nextToken())+ "\n");
      }
      bf.close();
      
      bw.close();
   }

}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backeaam03{

   public static void main(String[] args) throws IOException{
      // 버퍼리더 입력받는 객체 생성
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      // 버퍼라이터 출력하는 객체 생성
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // 계산 몇번할지 입력받는 변수 선언
      int t = Integer.parseInt(bf.readLine());
      // 스트링 토크나이저 객체 선언
      StringTokenizer st;
      
      for(int i = 0; i < t; i++) {
         // 토크나이저 객체 생성 입력받은 버퍼값을 공백 기준으로 붙힘
         // 1 1 입력하면 11로 저장하면서 계속 뒤에 붙힘
         st = new StringTokenizer(bf.readLine());
         // 
         bw.write((Integer.parseInt(st.nextToken())) + Integer.parseInt(st.nextToken())+ "\n");
      }
      bf.close();
      
      bw.close();
   }

}
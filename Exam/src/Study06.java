package example;

public class Study06 {

	public static void main(String[] args) {
		int a = 10;
		
		a++;
		System.out.println("a ==>" +a);
		System.out.println("a++ ==>" + a++); // 후위 연산자 a++
		
		System.out.println("a ==>" +a);
		System.out.println("++a ==>" + ++a); // 전위 연산자 ++a
		
		a--;
		System.out.println("a-- ==>" +a);
		
		a +=5;
		System.out.println("a+= ==>" +a);
		
		a-= 5;
		System.out.println("a-= ==>" +a);
		
		a *= 5;
		System.out.println("a*= ==>" +a);
		
		a/= 5;
		System.out.println("a/= ==>" +a);
		
		a%= 5;
		System.out.println("a%= ==>" +a);
		
		
	}

}

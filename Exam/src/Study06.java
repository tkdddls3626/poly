package example;

public class Study06 {

	public static void main(String[] args) {
		int a = 10;
		
		a++;
		System.out.println("a ==>" +a);
		System.out.println("a++ ==>" + a++); // ���� ������ a++
		
		System.out.println("a ==>" +a);
		System.out.println("++a ==>" + ++a); // ���� ������ ++a
		
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

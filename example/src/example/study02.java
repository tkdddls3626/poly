package example;

public class study02 {

	public static void main(String[] args) {
	char a,b,c,d,e;
	
	a = 'A';
	System.out.printf("%c \t",a);
	System.out.println((int)a);
	
	b = a;
	c = (char)(b+1);
	System.out.printf("%c \t",b);
	System.out.printf("%c \n", c);
	
	d = 90;
	System.out.printf("%c \n",d);
	
	d = '��';
	e = (char)(d+1);
	
	System.out.printf("%d \t",(int) d);
	System.out.printf("%c \n", e);
	
	}
}

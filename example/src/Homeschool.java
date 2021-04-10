
public class Homeschool {

	public static void main(String[] args) {

		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.print(j + "x" + i + "=" + (i * j)+"\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}

public class exercise1_4 {
	public static void main(String[] args) {
		int a = 1;
		System.out.println("a  a^2   a^3");
		
		while (a < 5) {
		int b = a * a;
		int c = a * a * a;

		System.out.println(a + "   " + b + "    " + c);
		a = a + 1;
		}
	}
}
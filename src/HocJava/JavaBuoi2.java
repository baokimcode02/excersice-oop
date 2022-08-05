package HocJava;

public class JavaBuoi2 {
//	public static Double Sum(double a, double b) {
//		double c = a + b;
//		return c;
//	}
//	public static Double Multiply(double a, double b) {
//		double d = a*b;
//		return d;
//	}
//	public static void main(String[] args) {
//		double c = Sum(0.1, 0.3);
//		double d = Multiply(0.2, 0.5);
//		System.out.println(c);
//		System.out.println(d);
	
//	}
	public String concat(String a, String b) {
		String c = a +" "+ b;
		return c;
	}
	public static void main(String[] args) {
//		String c = concat("Bao", "Kim");
//		System.out.println(c);
		JavaBuoi2 baokim = new JavaBuoi2 ();
		String c = baokim.concat("Bao", "Kim");
		System.out.println(c);
	}

}

package HocJava;

import java.util.Scanner;

public class JavaBuoi3 {
public static void main(String[] args) {
	 int n;
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Nhập vào số nguyên: ");
	 n = scanner.nextInt();
	if (n < 0) {
		n = n*(-1);
	
	}
	System.out.println(n);
}

}

package HocJava;

import java.util.Scanner;
import java.lang.Math;
public class javabuoi4 {
	public static void main(String[] args) {
//		float x, a, b;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("nhap a:");
//		a = scanner.nextFloat();
//		System.out.print("nhap b:");
//		b = scanner.nextFloat();	
//		if( a == 0 ) {
//			if( b == 0) {
//				System.out.print("phuong trinh vo so No");
//			} else {
//				System.out.print("phuong trinh vo No");
//			}
//
//		} else {
//			x = -b/a;
//			System.out.print(x);
//		}
		float a, b, c, dt, x1, x2, x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a:");
		a = scanner.nextFloat();
		System.out.print("nhap b:");
		b = scanner.nextFloat();
		System.out.print("nhap c:");
		c =  scanner.nextFloat();
		System.out.println("vay phuong trinh la: "+a+"X^2 + " + b + "X + " + c + " = 0");
		if (a == 0) {
			if( b == 0 ) {
				if( c == 0) {
					System.out.print("phuong trinh vo so No");
				} else {
					System.out.print("phuong trinh vo No");
				}
			} else {
				x = -b/c;
				System.out.print(x);
			}
		} else {
			dt = b*b-4*a*c;
			if ( dt < 0) {
				System.out.print("phuong trinh vo No");
			}else {
				if (dt == 0) {
					x = -b/(2*a);
					System.out.print("co No kep la:"+x);
				}else {
					x1 = (float) ((-b + Math.sqrt(dt))/(2*a));
					x2 = (float) ((-b - Math.sqrt(dt))/(2*a));
					System.out.println("No thu 1 la:"+x1);
					System.out.print("No thu 2 la:"+x2);
				}
			}
		}
	}
}


package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		System.out.println("Valor inicial A = " + a);
		System.out.println("Valor inicial B = " + b);
		System.out.println("Valor inicial C = " + c);
		System.out.println("Valor inicial D = " + d);
		
		b = c;
		System.out.println("Valor modificado B = " + b);
		c = a;
		System.out.println("Valor modificado C = " + c);
		a = d;
		System.out.println("Valor modificado A = " + a);
		d = b;
		System.out.println("Valor modificado D = " + d);

		
	}

}

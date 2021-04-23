import java.util.Scanner;
public class Calculator {
	public void Menu() {
		System.out.println("Ingrese un numero para seleccionar la operacion");
		System.out.println("1.Adicion");
		System.out.println("2.Sustraccion");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
		System.out.println("5.Modulo");
	}



	int add(int a, int b){ 
	public int add(int a, int b){ 
		return a + b; 
	}

	int sub(int a, int b){ 
	public int sub(int a, int b){ 
		int val = a - b;

		return val;
	}

	int mul(int a, int b){
	public int mul(int a, int b){
		return a*b;
	}
	int div(int a, int b){
	public int div(int a, int b){

		return a/b;
	}
	int mod(int a, int b){ 
	public int mod(int a, int b){ 
		int quot = a/b;
		int mod = a-(quot*b);
		return mod;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		int x,a,b;
		double resp;
		System.out.println("Ingrese primer valor");
		a = scan.nextInt();
		System.out.println("Ingrese segundo valor");
		b = scan.nextInt();
		calc.Menu();
		x = scan.nextInt();

		switch (x) {
		case 1:
			resp = calc.add(a,b);
			System.out.println(resp);
			break;
		case 2:
			resp = calc.sub(a,b);
			System.out.println(resp);
			break;
		case 3:
			resp = calc.mul(a,b);
			System.out.println(resp);
			break;
		case 4:
			resp = calc.div(a,b);
			System.out.println(resp);
			break;
		case 5:
			resp = calc.mod(a,b);
			System.out.println(resp);
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
	}
}

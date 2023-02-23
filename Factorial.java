public class Factorial {

	private int factorialACalcular;

	Factorial(int a) {
		factorialACalcular = a;
	}

	public int getFactorial() {
		return calcularFactorial(factorialACalcular);
	}

	private int calcularFactorial(int a) {
	
		if(a > 1) 
			return a * calcularFactorial(a-1);
		
		return 1;
	}

}
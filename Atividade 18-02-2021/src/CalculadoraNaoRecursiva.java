
public class CalculadoraNaoRecursiva {

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair (int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar (int num1, int num2) {
		return num1 * num2;
	}
	
	public static int dividir (int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencia (int num1, int num2) {
		
		int total = 1;
		
		for (int i = 1; i <= num2; i++) {
			total *= num1;
		}
		return total;
	}
	
public static int fatorialNRescursivo (int num) {
		
		if(num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}	
	

//fatorial (5) = 5 * fatorial(4)
//fatorial (4) = 4 * fatorial(3)
//fatorial (3) = 3 * fatorial(2)
//fatorial (2) = 2 * fatorial(1)
//fatorial (1) = 1 * fatorial(0)
//fatorial (0) = 1

public static int fatorial(int num) {
	
	if (num == 0) {
		return 1;
	}
	
	return num * fatorial (num-1);
}

}

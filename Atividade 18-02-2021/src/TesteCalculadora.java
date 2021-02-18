
public class TesteCalculadora {
	public static void main (String[] args) {
		
		int fatorialNR = CalculadoraNaoRecursiva.fatorialNRescursivo(5);
		System.out.println (fatorialNR);
		
		int fatorial = Calculadora.fatorial(5);
		System.out.println (fatorial);
		
	}

}

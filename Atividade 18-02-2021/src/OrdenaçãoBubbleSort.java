
public class OrdenaçãoBubbleSort {
	
	public static void main (String [] args) {
		
		int valor[] = {3, 6, 2, 1, 8, 4};
		int aux;
		boolean controle;
		
		for (int i = 0; i < valor.length; ++i) {
			controle = true;
			for (int j = 0; j < (valor.length - 1); ++j) {
				if (valor[j] > valor [j + 1]) {
					aux = valor[j];
					valor[j] = valor [j + 1];
					valor [j + 1] = aux;
					controle = false;
					}
			}
			if (controle) {
				break;
			}
		}
		
		for (int i = 0; i < valor.length; ++i) {
			System.out.print(valor[i]+"");
		}
	}

}

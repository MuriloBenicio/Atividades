import java.util.Arrays;
import java.util.Random;

public class OrdenaçãoSelectionSort {
	
	public static void main (String[] args) { 
		int []v = gerarVetor(20);
		selectionSort(v);
		System.out.println (Arrays.toString(v));
				}

	private static void selectionSort(int[] v) {	//0(n^2)
		for (int i = 0;i < v.length;i++) {	//0(n)
			int menor = i;
			for (int j = i + 1; j < v.length; j++) {	//0(n-1)
				if (v[j] < v[menor])
					menor = j;
			}
			trocar (v, i, menor);
		}
		
	}

	private static void trocar(int [] v, int i, int menor) {
		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
	}

	private static int[] gerarVetor(int n) {
		int []v = new int [n];
		Random gerador = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = gerador.nextInt(100);
		}
		
		return v;
	}

}

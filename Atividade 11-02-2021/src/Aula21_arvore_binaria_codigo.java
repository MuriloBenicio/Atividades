
public class Aula21_arvore_binaria_codigo {

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		System.out.println("\n\nEm Ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\n\nPr�-Ordem: ");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\n\nP�s-Ordem: ");
		arvore.posOrdem(arvore.getRaiz());

	}

}

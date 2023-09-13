package one.digitalinovation;

public class Main {
	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaLista = new ListaEncadeada<>();
		
		minhaLista.add("add 1");
		minhaLista.add("add 2");
		minhaLista.add("add 3");
		minhaLista.add("add 4");
		
		System.out.println(minhaLista);
		System.out.println(minhaLista.remove(1));
		
		System.out.println(minhaLista);

	}
}

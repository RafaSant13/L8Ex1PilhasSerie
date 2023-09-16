package view;

import controller.SerieInteiro;

public class Principal {

	public static void main(String[] args) throws Exception {
		SerieInteiro si = new SerieInteiro();
		int [] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};

		System.out.println("A quantidade de itens na pilha é: "+si.Serie(vetor, 0));
	}

}

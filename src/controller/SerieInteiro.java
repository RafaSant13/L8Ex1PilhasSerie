package controller;

import model.PilhaInt;

public class SerieInteiro {

	public SerieInteiro() {
		super();
	}
	
	static PilhaInt p = new PilhaInt();
	
	public int Serie(int[] vetor, int i) throws Exception {
		int tamanho = vetor.length;
		if (i>=tamanho) {
			return p.size();
		}
		else {
			if (vetor[i]>= 0) {
				p.push(vetor[i]);
			}
			else {
				int soma = p.pop() + p.pop();
				p.push(vetor[i]);
				p.push(soma);
			}
			Serie(vetor, i+1);
			return p.size();
		}
	}

}

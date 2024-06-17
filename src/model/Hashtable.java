package model;
import model.No;

public class Hashtable<T> {
	private No nos[];
	
	public Hashtable(int num) {
		this.nos = new No[num];
	}
	public void add(int chave, T valor) throws Exception {
		No<T> novo = new No<>(chave, valor);
		
		if (nos[0] == null) {//se o vetor estiver vazio
			nos[0] = novo;
			System.out.println("Vetor[0] = " + novo.getChave() + ";" + novo.getValor());

		} else {//se o vetor possuir numeros, precisa encontrar a posicao
			if (nos[nos.length-1] == null) {//se a ultima posicao do vetor estiver vazia (se tiver espaco pra inserir)
				for (int i = 0; i < nos.length-1; i++) {//vai passar do primeiro ate o penultimo
					if (nos[i+1] != null) {//se a posicao atual e a proxima possuirem nos
						if (novo.getChave() > nos[i].getChave() && novo.getChave() < nos[i+1].getChave()) {
							//quando achar a posicao
							for (int j = nos.length-1; j > i+1; j--) {
								//move todos pra frente
								nos[j] = nos[j-1];
							}
							//o novo entra no lugar do No cuja chave que era maior que a dele
							nos[i+1] = novo;
							System.out.println("Vetor[" + (i+1) + "] = " + novo.getChave() + ";" + novo.getValor());
							System.out.println("Vetor[" + (i+2) + "] = " + nos[i+2].getChave() + ";" + nos[i+2].getValor());

							return;
						}
					} else {//se a proxima posicao nao tiver valor e o novo for maior que o atual
						nos[i+1] = novo;
						System.out.println("Vetor[" + (i+1) + "] = " + novo.getChave() + ";" + novo.getValor());

						return;
					}
				}
			} else {//se a ultima posicao estiver cheia (nao tiver espaco pra inserir)
				throw new Exception("Vetor cheio!");
			}
			
		}
	}
	public void busca(int chave) throws Exception {
		if (nos[0] == null)
			throw new Exception("Vetor vazio.");
		busca(chave, 0, nos.length-1);
	}
	private void busca(int chave, int inicio, int fim) throws Exception {
		if (inicio > fim)
			throw new Exception("Nao existe.");
		
		int meio = (inicio + fim) / 2;
		if (chave < nos[meio].getChave()) {
			busca(chave, inicio, meio-1);
		} else if (chave > nos[meio].getChave()) {
			busca(chave, meio+1, fim);
		} else {
			System.out.println(nos[meio].getValor());
		}
	}
}

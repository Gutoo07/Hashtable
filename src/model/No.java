package model;

public class No<T> {
	private int chave;
	private T valor;
	
	public No(int chave, T valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getChave() {
		return this.chave;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public T getValor() {
		return this.valor;
	}
}

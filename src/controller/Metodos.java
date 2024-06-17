package controller;
import model.Hashtable;

public class Metodos {
	public Metodos() {
		super();
	}
	public void teste() {
		Hashtable hash = new Hashtable(5);
		try {
			hash.add(2, 10);
			hash.add(4, 20);
			hash.add(3, 15);
			hash.add(1, 5);
			hash.busca(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

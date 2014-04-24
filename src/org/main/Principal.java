package org.main;

import org.observer.Telefone;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Telefone telefone = new Telefone();
		
		telefone.setTocar(true);
		telefone.notificarObservadores();
		
		telefone.setTocar(false);
		telefone.notificarObservadores();
		
		
		
	}

}

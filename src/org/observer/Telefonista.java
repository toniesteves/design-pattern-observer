package org.observer;

import org.iobserver.Observer;
import org.iobserver.Sujeito;

public class Telefonista implements Observer {

	private boolean tocar;
	private Sujeito telefone;

	public Telefonista(Sujeito telefone) {
		this.telefone = telefone;
		this.telefone.registrarObservador(this);

	}

	@Override
	public void atualizar(boolean tocar) {

		this.tocar = tocar;

		if (!this.tocar) {

			System.out.println("Telefone n???o est??? tocando...");
		} else {
			mostrar();
		}
	}

	private void mostrar() {
		System.out.println("Ring..Ring, telefone tocando...");
	}

}

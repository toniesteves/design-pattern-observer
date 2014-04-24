package org.observer;

import java.util.ArrayList;

import org.iobserver.Observer;
import org.iobserver.Sujeito;

public class Telefone implements Sujeito {

	private boolean tocar;
	private ArrayList<Observer> observadores;

	public Telefone() {

		observadores = new ArrayList<Observer>();

	}

	@Override
	public void registrarObservador(Observer observador) {

		this.observadores.add(observador);
	}

	@Override
	public void removerObservador(Observer observador) {

		int i = observadores.indexOf(observador);
		if (i > 0) {
			this.observadores.remove(i);
		}

	}

	@Override
	public void notificarObservadores() {

		for (int i = 0; i < observadores.size(); i++) {
			Observer observador = observadores.get(i);
			observador.atualizar(tocar);
		}

	}

	public boolean isTocar() {
		return tocar;
	}

	public void setTocar(boolean tocar) {
		this.tocar = tocar;
	}

	
}

package org.iobserver;

public interface Sujeito {
	
	public void registrarObservador(Observer observador);
	
	public void removerObservador(Observer observador);
	
	public void notificarObservadores();

}

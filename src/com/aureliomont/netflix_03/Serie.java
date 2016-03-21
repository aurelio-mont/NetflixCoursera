package com.aureliomont.netflix_03;


public class Serie extends ArticuloNetflix implements IVisualizable {

	private int noTemporadas;
	
	public Serie() {
		super();
		this.noTemporadas = 1;
	}

	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.noTemporadas = 1;
	}

	public Serie(String titulo, String genero, String creador, String duracion, int noTemporadas) {
		super(titulo, genero, creador, duracion);
		this.noTemporadas = noTemporadas;
	}
	
	public int getNoTemporadas() {
		return noTemporadas;
	}

	public void setNoTemporadas(int noTemporadas) {
		this.noTemporadas = noTemporadas;
	}

	@Override
	public String toString() {
		return super.toString() + ",\nNo. Temporadas: " + noTemporadas;
	}

}

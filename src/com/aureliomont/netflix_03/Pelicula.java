package com.aureliomont.netflix_03;


public class Pelicula extends ArticuloNetflix implements IVisualizable {
	
	private int anio;
	
	public Pelicula() {
		super();
		this.anio = 1990;
	}

	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.anio = 1990;
	}
	
	public Pelicula(String titulo, String genero, String creador, int anio, String duracion) {
		super(titulo, genero, creador, duracion);
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	@Override
	public String toString() {
		return super.toString() + ",\nAño: " + anio;
	}

}

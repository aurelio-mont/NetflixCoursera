package com.aureliomont.netflix_03;

public class ArticuloNetflix implements IVisualizable {
	
		private String titulo;
		private String genero;
		private String creador;
		private String duracion;
		private boolean visto = false;
		// Agregue este atributo para almacenar el tiempo en minutos/segundos que se visualizó el video. 
		private String tiempoVisto = "00h 00m";
		
		public ArticuloNetflix() {
			this.titulo = "Nueva";
			this.genero = "Sin Genero";
			this.creador = "Sin Creador";
			this.duracion = "00h 00m";
			this.visto = false;
			this.tiempoVisto = "00h 00m";
		}

		public ArticuloNetflix(String titulo, String creador) {
			this.titulo = titulo;
			this.genero = "Sin Genero";
			this.creador = creador;
			this.duracion = "00h 00m";
			this.visto = false;
			this.tiempoVisto = "00h 00m";
		}

		public ArticuloNetflix(String titulo, String genero, String creador, String duracion) {
			this.titulo = titulo;
			this.genero = genero;
			this.creador = creador;
			this.duracion = duracion;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCreador() {
			return creador;
		}

		public void setCreador(String creador) {
			this.creador = creador;
		}

		public String getDuracion() {
			return duracion;
		}

		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}
		
		@Override
		public String toString() {
			return "Título: " + titulo + ",\nGenero: " + genero + ",\nCreador: " + creador + ",\nDuracion: " + duracion + ",\nVisto: " + visto ;
		}
		
		@Override
		public void marcarVisto(String tiempoVisualizado) {
			// TODO Auto-generated method stub
			this.visto = true;
			this.tiempoVisto = "Visualizado hasta: " + tiempoVisualizado;
		}
		
		@Override
		public boolean esVisto() {
			// TODO Auto-generated method stub
			return this.visto;
		}

		@Override
		public String tiempoVisto() {
			// TODO Auto-generated method stub
			return this.tiempoVisto;
		}
}

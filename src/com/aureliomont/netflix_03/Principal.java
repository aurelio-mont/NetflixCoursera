package com.aureliomont.netflix_03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		
		peliculas.add(new Pelicula("Intensa-Mente","Pete Docter"));
		peliculas.add(new Pelicula("El Renacido","Cine dramático/Suspenso","Alejandro González Iñárritu",2016,"2h 36m"));
		peliculas.add(new Pelicula("Los miserables","Cine dramático/Cine romántico","Tom Hooper",2012,"2h 40m"));
		peliculas.add(new Pelicula("Arráncame la vida","Drama/Cine romántico","Roberto Sneider",2008,"1h 47m"));
		peliculas.add(new Pelicula());
		
		
		System.out.println("* Lista de todas las Películas ");
		
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.toString()+"\n");
		}
		
		series.add(new Serie("Sherlock", "Serie de televisión policíaca", "Sue Vertue", "1h 30m", 3));
		series.add(new Serie("Downton Abbey", "Julian Fellowes"));
		series.add(new Serie("Merlín", "Drama, Fantasía", "Julian Jones", "50m", 5));
		series.add(new Serie("Grey's Anatomy", "Drama médico", "Shonda Rhimes", "42m", 12));
		series.add(new Serie());
		
		System.out.println("\n* Lista de todas las Series ");
		
		for (Serie serie : series) {
			System.out.println(serie.toString()+"\n");
		}
		
		peliculas.get(1).marcarVisto("1h 55m 15s");
		peliculas.get(3).marcarVisto("0h 45m 03s");
		
		series.get(2).marcarVisto("42m 15s");
		series.get(4).marcarVisto("47m 00s");
		
		System.out.println("* Lista de las Películas que se visualizaron");
		
		for (Pelicula pelicula : peliculas) {
			if (pelicula.esVisto()) {
				System.out.println(pelicula.toString());
				System.out.println(" ---> " + pelicula.tiempoVisto() +"\n");
			}
		}
		
		System.out.println("\n* Lista de las Series que se visualizaron");
		for (Serie serie : series) {
			if (serie.esVisto()) {
				System.out.println(serie.toString());
				System.out.println(" ---> " + serie.tiempoVisto() +"\n");
			}
		}
		
		System.out.println("\n* Serie con mas temporadas ->\n" + serieMasTemporadas(series));
		System.out.println("\n* Pelicula Mas Reciente ->\n" + peliculaReciente(peliculas));
		
		System.out.println(guararPeliculas(peliculas));
		System.out.println(guararSeries(series));
		

		
	}
	
	
	public static String serieMasTemporadas(ArrayList<Serie> misSeries){
		int maximo = 0;
		int indice = 0;
		
		for (int i = 0; i < misSeries.size(); i++) {
			if (misSeries.get(i).getNoTemporadas() > maximo) {
				maximo = misSeries.get(i).getNoTemporadas();
				indice = i;
			}
		}
		return misSeries.get(indice).toString();
	}
	
	public static String peliculaReciente(ArrayList<Pelicula> misPeliculas){
		int maximo = 0;
		int indice = 0;
		
		for (int i = 0; i < misPeliculas.size(); i++) {
			if (misPeliculas.get(i).getAnio() > maximo) {
				maximo = misPeliculas.get(i).getAnio();
				indice = i;
			}
		}
		return misPeliculas.get(indice).toString();
	}
	
	public static String guararPeliculas(ArrayList<Pelicula> misPeliculas) {
		FileWriter archivo = null;
	 	String elemento;
	 	String mensage = "";
	 	String ruta = "/home/aurelio/Peliculas.txt";
		System.out.println("\n* Guardando colleccion de PELICULAS en disco......\n");
		
		try {
			archivo = new FileWriter(ruta);
			elemento = "LISTADO DE PELICULAS \n \n";
            archivo.write(elemento);
			for (int i = 0; i < misPeliculas.size(); i++) {
				if (i > 0) {
					archivo.write(System.getProperty("line.separator"));
					archivo.write(System.getProperty("line.separator"));
				}
			elemento = misPeliculas.get(i).toString();
            archivo.write(elemento);	
			}
		} catch (IOException e) {
			e.printStackTrace();
			mensage = "ERROR an acceder a la unidad de almacenamiento :)\n";
		}
		finally{
        	if (archivo!=null){
            	try {
                	archivo.close();
                	mensage = "\n* Se guardaron "+ misPeliculas.size() + " peliculas en "+ruta+"! :)\n";
            	} catch (IOException e) {
                	e.printStackTrace();
            	}
            	archivo = null;
        	}
    	}
		return mensage;
	}
	
	public static String guararSeries(ArrayList<Serie> misSeries) {
		FileWriter archivo = null;
	 	String elemento;
	 	String mensage = "";
	 	String ruta = "/home/aurelio/Series.txt";
		System.out.println("\n* Guardando colleccion de SERIES en disco......\n");
		
		try {
			archivo = new FileWriter(ruta);
			elemento = "LISTADO DE SERIES \n \n";
            archivo.write(elemento);
			for (int i = 0; i < misSeries.size(); i++) {
				if (i > 0) {
					archivo.write(System.getProperty("line.separator"));
					archivo.write(System.getProperty("line.separator"));
				}
			elemento = misSeries.get(i).toString();
            archivo.write(elemento);	
			}
		} catch (IOException e) {
			e.printStackTrace();
			mensage = "ERROR an acceder a la unidad de almacenamiento :)\n";
		}
		finally{
        	if (archivo!=null){
            	try {
                	archivo.close();
                	mensage = "\n* Se guardaron "+ misSeries.size() + " series en "+ruta+"! :)\n";
            	} catch (IOException e) {
                	e.printStackTrace();
            	}
            	archivo = null;
        	}
    	}
		return mensage;
	}

}

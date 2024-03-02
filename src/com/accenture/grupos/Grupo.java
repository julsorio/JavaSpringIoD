package com.accenture.grupos;

import java.util.List;

/**
 * Clase que representa un grupo musical
 * 
 * @author Andrea Ravagli Castillo
 */
public class Grupo {
	private String nombre;
	private int creacion;
	private String origen;
	private String genero;
	List<Componente> componentes;

	public Grupo() {
	}

	public Grupo(String nombre, int creacion, String origen, String genero, List<Componente> componentes) {
		this.nombre = nombre;
		this.creacion = creacion;
		this.origen = origen;
		this.genero = genero;
		this.componentes = componentes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreacion() {
		return creacion;
	}

	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	@Override
	public String toString() {
		return nombre + " - " + origen + " - " + creacion + " - " + genero;
	}
}

package fr.codevallee;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.List;

public class Pile<T> {
	
	private List<T> liste = new ArrayList<T>();
	
	private int taille;

	//Constructeurs par défaut
	public Pile() {
	}

	// Constructeur redéfinit
	public Pile(int taille) {
		this.taille = taille;
	}
	
	
	// les méthodes à tester
	public void push (T newItem){
		this.liste.add(newItem);
	}
	
	public void pop() {
		int position = this.liste.size() -1;
		this.liste.remove(position);
	}
	
	public void popall() {
		this.liste.clear();
	}

	public void peek(T item) {
		int position = this.liste.indexOf(item);
		push(item);
		this.liste.remove(position);
	}

	
	// Getters et Setters
	/**
	 * @return the liste
	 */
	public List<T> getListe() {
		return liste;
	}

	/**
	 * @param liste the liste to set
	 */
	public void setListe(List<T> liste) {
		this.liste = liste;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}
}

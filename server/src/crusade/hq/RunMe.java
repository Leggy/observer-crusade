package crusade.hq;

import observer.Obs;
import model.Model;

public class RunMe {

	private static Model model;

	private static Obs obs;

	public static void main(String[] args) {

		model = new Model();

		obs = new Obs();

		model.addObserver(obs);

		System.out.println("RUN: initialised");

		/*
		 * Changing id
		 */
		System.out.println("RUN: Changing ID");
		model.setID(model.getID() + 4);
		
		
		/*
		 * Adding new player String
		 */
		System.out.println("RUN: Adding new player String");
		model.addPlayer("Andrew");
		
		
		/*
		 * Changing id
		 */
		System.out.println("RUN: Changing ID");
		model.setID(model.getID() + 6);
		
		
		/*
		 * Adding new player String
		 */
		System.out.println("RUN: Adding new player String");
		model.addPlayer("Jordan");
		
		
		
		
		

	}

	public void print() {
		System.out.println("SVR: hhhehehe");
	}
}

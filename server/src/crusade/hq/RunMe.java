package crusade.hq;

import observer.Obs;
import model.Model;

/**
 * This class serves as the 'launcher' and tester for the Obs implementation of
 * the Observer framework.
 * 
 * @author Leggy
 * 
 */
public class RunMe {

	/*
	 * Declaration of required fields.
	 */
	private static Model model;
	private static Obs obs;

	public static void main(String[] args) {

		/*
		 * Here we instansiate our fields and set the model's observer to obs,
		 * an instance of the Obs (Observer implementation) class.
		 */
		model = new Model();
		obs = new Obs();
		model.addObserver(obs);

		// Notifying us that it has initialised
		System.out.println("RUN: initialised");
		System.out.println("");

		/*
		 * Here we change the ID, incrementing it by 4.
		 */
		System.out.println("RUN: Changing ID");
		model.setID(model.getID() + 4);

		/*
		 * Here we add a new player String to the model.
		 */
		System.out.println("RUN: Adding new player String");
		model.addPlayer("Andrew");

		/*
		 * Here we change the ID, incrementing it by 7.
		 */
		System.out.println("RUN: Changing ID");
		model.setID(model.getID() + 7);

		/*
		 * Here we add a new player String to the model.
		 */
		System.out.println("RUN: Adding new player String");
		model.addPlayer("Jordan");

	}
}

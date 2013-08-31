package observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import model.Model;

/**
 * This class in an implementation of Observer, specifically designed to watch
 * the Model class.
 * 
 * @author iamwinrar
 * 
 */
public class Obs implements Observer {

	@Override
	public void update(Observable observable, Object object) {
		System.out.println("OBS: Update called");

		/*
		 * Here we check if the observable parameter given is an instanceof
		 * Model, the thing we want to observe. If it is, we print to console,
		 * cast it to a model, and display some of the models data, the ID.
		 */
		if (observable instanceof Model) {
			System.out.println("OBS: Observable is an instanceof Model");
			Model m = (Model) observable;
			System.out.println("OBS: " + m.getID());

			/*
			 * From here on we are checking if the object parameter is an
			 * instance of any of the field types used in the Model class
			 * (Integer modelID, Set/Hashset players. When we find out what type
			 * the object is, we print that to console.
			 */
			if (object instanceof Integer) {
				System.out.println("OBS: Object is an instanceof Integer.");

			} else if (object instanceof Set) {
				System.out.println("OBS: Object is an instanceof Set.");

			} else if (object instanceof HashSet) {
				System.out.println("OBS: Object is an instanceof HashSet.");

			} else {
				System.out.println("OBS: Cannot identify bject.");
			}
		} else {
			System.out.println("OBS: Cannot identify observable.");
		}

		System.out.println("");

	}

}

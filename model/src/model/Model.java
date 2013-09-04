package model;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 * This class is an example model of something tht can be observed using the
 * Observable and Observer Frameworks.
 * 
 * @author Leggy, iamwinrar
 * 
 */
public class Model extends Observable {

	private Set<String> players;
	private Integer modelID;

	/**
	 * Creates a new model.
	 */
	public Model() {
		this.players = new HashSet<String>();
		this.modelID = 1;
	}

	/**
	 * Adds player.
	 * 
	 * @param p
	 *            Player to be added.
	 */
	public void addPlayer(String p) {
		if (p != null) {
			if(!players.contains(p)){
				players.add(p);
				
				System.out.println("CLI: Adding Player \"" + p + "\"");

				/*
				 * Here we toggle the changed field (using setChanged()), notify all
				 * observers that *something* has changed, passing them the
				 * *something*, and then clearing the changed field.
				 */
				setChanged();
				notifyObservers(players);
				clearChanged();
			}
		}
	}

	/**
	 * Sets id to that provided.
	 * 
	 * @param id
	 *            The new ID.
	 */
	public void setID(int id) {
		if (id > 0) {
			modelID = id;
			
			System.out.println("CLI: Setting ID = " + id);

			/*
			 * Here we toggle the changed field (using setChanged()), notify all
			 * observers that *something* has changed, passing them the
			 * *something*, and then clearing the changed field.
			 */
			setChanged();
			notifyObservers(modelID);
			clearChanged();
		}
	}

	/**
	 * Access method for the id.
	 * 
	 * @return Returns the modelID.
	 */
	public int getID() {
		return modelID;
	}

	/**
	 * Access method for the player Set.
	 * 
	 * @return Returns the player set.
	 */
	public Set<String> getPlayers() {
		return new HashSet<String>(this.players);
	}

}

package crusade.hq;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.net.BindException;

import com.esotericsoftware.kryonet.Server;

/*import deco2800.arcade.protocol.Protocol;
import deco2800.server.database.CreditStorage;
import deco2800.server.database.DatabaseException;
import deco2800.server.listener.CommunicationListener;
import deco2800.server.listener.ConnectionListener;
import deco2800.server.listener.CreditListener;
import deco2800.server.listener.GameListener;
import deco2800.arcade.packman.PackageServer;*/

/**
 * Implements the KryoNet server for arcade games which uses TCP and UDP
 * transport layer protocols.
 * 
 * @see http://code.google.com/p/kryonet/
 */
public class ArcadeServer {

	// Keep track of which users are connected
	private Set<String> connectedUsers = new HashSet<String>();

	// singleton pattern
	private static ArcadeServer instance;

	/**
	 * Retrieve the singleton instance of the server
	 * 
	 * @return the game server
	 */
	public static ArcadeServer instance() {
		if (instance == null) {
			instance = new ArcadeServer();
		}
		return instance;
	}

	/**
	 * Initializes and starts Server Binds Ports
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArcadeServer server = new ArcadeServer();
		server.start();
	}

	/**
	 * Create a new Arcade Server. This should generally not be called.
	 * 
	 * @see ArcadeServer.instance()
	 */
	public ArcadeServer() {
	}

	/**
	 * Start the server running
	 */
	public void start() {
		Server server = new Server();
		System.out.println("Server starting");
		server.start();
		try {
			server.bind(54555, 54777);
			System.out.println("Server bound");
		} catch (BindException b) {
			System.err.println("Error binding server: Address already in use");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//server.addListener(new ConnectionListener(connectedUsers));
		//server.addListener(new CommunicationListener(server));
	}
}

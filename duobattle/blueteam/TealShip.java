package duobattle.blueteam;

import battleship.core.Arena;
import battleship.core.Ship;

/*
 * Blue Team: Teal Ship
 * @author TODO - Add your name!
 */
public class TealShip extends Ship {

    /**
     * Constructor
     */
    public TealShip() {
        this.initializeName("Teal");
        this.initializeOwner("Your Name"); // TODO - Change this to your name!

        // TODO - Give your ship up to 10 points total for its hull, firepower, speed, and range
        this.initializeHull(1);
        this.initializeFirepower(1);
        this.initializeSpeed(1);
        this.initializeRange(1);
    }

    /**
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     */
    @Override
    protected void doTurn(Arena arena) {
        // TODO - Fill this in!
    }

}
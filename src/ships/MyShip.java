package ships;

import core.Arena;
import core.Ship;

/*
 * Custom Ship
 * @author Your Name
 */
public class MyShip extends Ship {

    public CustomShip() {
        this.initializeName("Custom Ship");
        this.initializeOwner("Your Name");
        this.initializeHull(1);
        this.initializeFirepower(1);
        this.initializeSpeed(1);
        this.initializeRange(1);
    }

    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    protected void doTurn(Arena arena) {
        // Fill in your strategy here
    }

}
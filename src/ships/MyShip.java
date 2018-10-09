/*
 * TODO - Add your name below!
 * Name:
 * Description: This is my very own Ship!
 */

package ships;

import core.*;

import java.util.List;

public class MyShip extends Ship {

    /**
     * This method is the constructor for MyShip.
     */
    public MyShip() {
        // TODO - Give your ship whatever attributes you'd like!
        this.initializeName("");
        this.initializeOwner("");
        this.initializeHull(0);
        this.initializeFirepower(0);
        this.initializeSpeed(0);
        this.initializeRange(0);
    }

    /**
     * Determines what actions the ship will take on a given turn
     * @param arena - the battlefield for the match
     */
    @Override
    protected void doTurn(Arena arena) {
        // TODO - Make your ship move in the arena!

        // Get a list of nearby ships
        List<Ship> nearby = this.getNearbyShips(arena);

        // Loop through the list of nearby ships
        for (Ship nearbyShip : nearby) {
            // Only attack ships that aren't on your team
            if (!this.isSameTeamAs(nearbyShip)) {
                // TODO - Get the enemy's coordinates and store them in a Coord object

                // TODO - Get the enemy's x and y coordinates and store them in variables

                // TODO - Fire at your enemy's location!
            }
        }
    }
}
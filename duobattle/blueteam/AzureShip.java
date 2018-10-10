package duobattle.blueteam;

import battleship.core.Arena;
import battleship.core.Coord;
import battleship.core.Direction;
import battleship.core.Ship;
import java.util.List;

/**
 * Blue Team: Azure Ship
 * This will be a basic patrol ship!
 *
 * @author TODO - Add your name!
 */
public class AzureShip extends Ship {
    /**
     * Constructor
     */
    public AzureShip() {
        /*
         * Let's build our constructor, the method that creates our ship.
         */

        // TODO - Our ship needs a name and an owner
        this.initializeName("");
        this.initializeOwner("");

        // TODO - Our ship's scores must add up to 10 at most. Let's give it some points!
        this.initializeHull(-1); // Let's make this 6
        this.initializeFirepower(-1); // Let's make this 1
        this.initializeSpeed(-1); // Let's make this 1
        this.initializeRange(-1); // Let's make this 2
    }

    /**
     * Determines what actions the ship will take on a given turn
     *
     * @param arena (Arena) the battlefield for the match
     */
    @Override
    protected void doTurn(Arena arena) {
        /*
         * Let's build a basic patrol ship.
         */

        // TODO - Let's make the ship move WEST on every turn

        // TODO - Next, let's obtain all nearby ships in the arena

        // TODO - Now, if there are nearby enemy ships, let's target them and fire at them
    }

}
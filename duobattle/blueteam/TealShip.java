package duobattle.blueteam;

import battleship.core.Arena;
import battleship.core.Coord;
import battleship.core.Direction;
import battleship.core.Ship;

import java.util.ArrayList;
import java.util.List;

/**
 * Blue Team: Teal Ship
 * This will be a fairly complex drone ship!
 *
 * @author TODO - Add your name!
 */
public class TealShip extends Ship {
    /**
     * Constructor
     */
    public TealShip() {
        /*
         * TODO - Let's build our TealShip just like our AzureShip
         *        We'll name this ship Teal and give it these points:
         *        Hull: 2
         *        Firepower: 2
         *        Speed: 3
         *        Range: 3
         */
    }

    /**
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     */
    @Override
    protected void doTurn(Arena arena) {
        /*
         * Let's design this ship's strategy.
         * You've been given an extra method to help you out (a "helper method"):
         *   getRandomDirection() - Returns a random Direction object
         *
         * We've provided some hints throughout this method. Let's fill in the blanks!
         */

        // TODO - Let's declare a List of Ships that we can keep updating.

        // Next, for the entire time the ship can travel, we need to scan for its enemies.
        for (int m = 0; m < this.getSpeed(); ++m) {
            // TODO - Let's update our List of all nearby ships in the arena.

            /*
             * TODO - Let's check if there are any nearby ships
             *        If there are, we'll choose a random one and fire at it ONLY IF it's an enemy
             */

            // TODO - After we've fired, let's make our ship move in a random direction
        }
    }

    private static Direction[] directions = {
        Direction.NORTH,
        Direction.EAST,
        Direction.SOUTH,
        Direction.WEST
    };

    private Direction getRandomDirection(Arena arena) {
        int index = arena.getRandom().nextInt(directions.length);
        return directions[index];
    }
}
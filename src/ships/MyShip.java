/*
 * TODO - Add your name below!
 * Name:
 * Description: This is my very own Ship object!
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
        // Make your ship move
        Coord location = this.getCoord();
        this.move(arena, Direction.WEST);

        // Get a list of nearby ships
        List<Ship> nearby = this.getNearbyShips(arena);

        // loop through the list of nearby ships
        for (int i = 0; i < nearby.size(); i++) {
            if (this.isSameTeamAs(nearby.get(i))) {
                // if same team, don't shoot
            } else {
                Ship enemy = nearby.get(i);
                Coord enemyLoc = enemy.getCoord();
                int x = enemyLoc.getX();
                int y = enemyLoc.getY();
                this.fire(arena, x, y);
            }
        }
    }

}
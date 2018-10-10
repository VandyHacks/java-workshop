package duobattle.redteam;

import battleship.core.Arena;
import battleship.core.Coord;
import battleship.core.Direction;
import battleship.core.Ship;

import java.util.List;

/*
 * Red Team: Crimson Ship
 * @author ESI, modified by the VandyHacks team
 */
public class CrimsonShip extends Ship {

    /**
     * Constructor
     */
    public CrimsonShip() {
        this.initializeName("Crimson");
        this.initializeOwner("The Red Team");
        this.initializeHull(6);
        this.initializeFirepower(1);
        this.initializeSpeed(1);
        this.initializeRange(2);
    }

    /**
     * Determines what actions the ship will take on a given turn
     *
     * @param arena (Arena) the battlefield for the match
     */
    @Override
    protected void doTurn(Arena arena) {
        this.move(arena, Direction.NORTH);
        List<Ship> nearby = this.getNearbyShips(arena);
        if (nearby.size() > 0) {
            Ship target = nearby.get(0);
            Coord coord = target.getCoord();
            this.fire(arena, coord.getX(), coord.getY());
        }
    }

}
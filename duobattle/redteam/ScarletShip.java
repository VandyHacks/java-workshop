package duobattle.redteam;
import battleship.core.*;
import java.util.List;

/*
 * Red Team: Scarlet Ship
 * @author Your Name
 */
public class ScarletShip extends Ship {
	
	public ScarletShip() {
		this.initializeName("Scarlet");
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
		this.move(arena, Direction.SOUTH);
        List<Ship> nearby = this.getNearbyShips(arena);
        if (nearby.size() > 0) {
            Ship target = nearby.get(0);
            Coord coord = target.getCoord();
            this.fire(arena, coord.getX(), coord.getY());
        }
	}
	
}
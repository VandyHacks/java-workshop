/*
 * TODO - Add your name below!
 * Name:
 * Description: This file runs a 2v2 Battleship game!
 */

import core.*;
import ships.*;

import java.util.LinkedList;
import java.util.List;

public class Main extends Game {
    // Lists of Ships representing our different teams
    private List<Ship> redTeam = new LinkedList<Ship>();
    private List<Ship> blueTeam = new LinkedList<Ship>();

    public static void main(String[] args) {

    }

    /**
     * This method returns what your objective for the game is
     * @return A description of your objective
     */
    @Override
    public String getObjective() {
        return "";
    }

    /**
     * This method initializes an Arena object for your game
     * @return An initialized Arena
     */
    @Override
    public Arena initializeArena() {
        // Instantiate a new Arena object that's 10x10
        Arena arena = new Arena(10, 10);

        // TODO - Instantiate (build) your ship here and set its team and color!
        // Ship ship1 = new [YourShipName]Ship.java
        // setShipTeam(ship1, "Team Name");
        // setShipColor(ship1, "#ffffff");

        // TODO - Spawn your ship in this arena with the spawnShip() method!
        // spawnShip(arena, [x coordinate], [y coordinate], ship1);

        /*
         * TODO - Instantiate a few more ships of your choosing.
         *        For each ship, you'll have to set its team, set its color, spawn it,
         *        and add it to either the redTeam or blueTeam.
         */
        Ship scarlet = new DroneShip();
        Ship crimson = new GunDroneShip();
        Ship azure = new HiveShip();
        Ship teal = new PatrolShip();

        // Add
        setShipTeam(scarlet, "Red Team");
        setShipColor(scarlet, "#ff291e");
        spawnShip(arena, 0, 5, scarlet);
        redTeam.add(scarlet);

        setShipTeam(crimson, "Red Team");
        setShipColor(crimson, "#dc143c");
        spawnShip(arena, 0, 6, crimson);
        redTeam.add(crimson);

        setShipTeam(azure, "Blue Team");
        setShipColor(azure, "#1c89ff");
        spawnShip(arena, 9, 5, azure);
        blueTeam.add(azure);

        setShipTeam(teal, "Blue Team");
        setShipColor(teal, "#149eba");
        spawnShip(arena, 9, 6, teal);
        blueTeam.add(teal);

        // Return an Arena with several ships spawned in it
        return arena;
    }

    @Override
    public boolean isCompleted() {
        return false;
    }

    @Override
    public String getResults() {
        return null;
    }

    @Override
    public void run() {

    }
}

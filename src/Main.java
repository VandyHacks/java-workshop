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
        return "Mission Objective: Win the 2v2 battle against the other team.";
    }

    /**
     * This method initializes an Arena object for your game
     * @return An initialized Arena
     */
    @Override
    public Arena initializeArena() {
        // Instantiate a new Arena object that's 10x10
        Arena arena = new Arena(10, 10);

        // TODO - Instantiate (build) your Custom ship here!

        /*
         * TODO - Instantiate a three more ships of your choosing
         *        You can use any of the classes in the ships/ folder
         */

        /*
         * TODO - Choose two ships to add to the Red Team.
         *        For each ship, you'll need to call setShipTeam(), setShipColor(),
         *        spawnShip(), and add the ship to the redTeam list.
         */

        /*
         * TODO - Choose two ships to add to the Blue Team.
         *        For each ship, you'll need to call setShipTeam(), setShipColor(),
         *        spawnShip(), and add the ship to the blueTeam list.
         */

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

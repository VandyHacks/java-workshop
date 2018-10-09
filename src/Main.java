/*
 * TODO - Add your name below!
 * Name:
 * Description: This file runs a 2v2 Battleship game!
 */

import core.*;
import ships.*;
import java.util.*;
import java.util.stream.*;

public class Main extends Game {
    // Lists of Ships representing our different teams
    private List<Ship> redTeam = new LinkedList<>();
    private List<Ship> blueTeam = new LinkedList<>();

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
        // TODO - Instantiate a new arena of any size

        // TODO - Instantiate (build) your Custom ship here!

        /*
         * TODO - Choose two ships to add to the Red Team
         *        Assign both ships a team with setShipTeam() and a color with setShipColor().
         *        You'll also need to spawn each ship in the Arena with spawnShip().
         *        Finally, add each ship to the redTeam list.
         */

        /*
         * TODO - Choose two ships to add to the Blue Team
         *        Assign both ships a team with setShipTeam() and a color with setShipColor().
         *        You'll also need to spawn each ship in the Arena with spawnShip().
         *        Finally, add each ship to the blueTeam list.
         */

        // TODO - Return your Arena!
    }

    /**
     * Count all the sunk ships on a team.
     * @param team - The team whose ships we're checking
     * @return The number of sunk ships on the given team
     */
    private int countSunkShips(List<Ship> team) {
        // TODO - Fill this in!
    }

    /**
     * Check if all the ships on a team are sunk.
     * @param team - The team whose ships we're checking
     * @return Whether or not all of the team's ships are sunk
     */
    private boolean isTeamSunk(List<Ship> team) {
        // TODO - Fill this in!
    }

    /**
     * Check if the game is completed - that is, if the Red Team or the Blue Team is all sunk.
     * @return Whether or not the game is completed.
     */
    @Override
    public boolean isCompleted() {
        // TODO - Fill this in!
    }

    /**
     * Get the results of this battle.
     *
     * @return A String of the battle results.
     */
    @Override
    public String getResults() {
        // Instantiate lists of ships
        List<Ship> sunkShips = new LinkedList<>(), allShips = new LinkedList<>();

        // Add all the ships from the battle to allShips and all sunken ships to sunkShips
        allShips.addAll(blueTeam);
        allShips.addAll(redTeam);
        sunkShips.addAll(allShips.stream().filter(Ship::isSunk).collect(Collectors.toList()));

        // Calculate each team's score (the number of enemy ships sunk)
        int redScore = countSunkShips(blueTeam), blueScore = countSunkShips(redTeam);

        // Build the result String
        StringBuilder result = new StringBuilder();

        if (redScore == blueScore) {
            result.append("Battle was a draw!");
        } else if (redScore > blueScore) {
            result.append("Red Team won!");
        } else {
            result.append("Blue Team won!");
        }

        result.append(String.format(" Ships Sunk: Red (%d) - Blue (%d)", redScore, blueScore));

        for (Ship ship : sunkShips) {
            String sunkShipInfo = "\n" + "- " + ship.getName() + " sunk by " + ship.getSunkBy()
                .getName() + ".";
            result.append(sunkShipInfo);
        }

        return result.toString();
    }

    /**
     * Runs a mission.
     */
    @Override
    public void run() {
        this.runMission(getArena());
    }
}

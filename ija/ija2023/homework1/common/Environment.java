/**
 * IJA 2024 - homework 1
 * Environemnt interface
 */

package ija.ija2023.homework1.common;

/**
 * Interface representing environment, in which robots move
 */
public interface Environment {

    /**
     * Adds robot to his position
     * @param robot robot to be added
     * @return true when position is inside environment and is empty
     */
    public boolean addRobot(Robot robot);

    /**
     * Checks whether given position is inside environment
     * @param pos position to be checked
     * @return true when position is inside environment
     */
    public boolean constainsPosition(Position pos);

    /**
     * Creates new obstacle at given position
     * @param row row of the obstacle
     * @param col column of the obstacle
     * @return true when position is in environment and is empty
     */
    public boolean createObstacleAt(int row, int col);

    /**
     * Checks whether given position contains obstacle
     * @param row row of the position
     * @param col column of the position
     * @return true when position is in environment and contains obstacle
     */
    public boolean obstacleAt(int row, int col);

    /**
     * Check whether given position contains obstacle
     * @param p position to be checked
     * @return true when position is in environment and contains obstacle
     */
    public boolean obstacleAt(Position p);

    /**
     * Checks whether given opsition contains robot
     * @param p position to be checked
     * @return true when positino is in environment and contains robot
     */
    public boolean robotAt(Position p);
}

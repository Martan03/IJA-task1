/**
 * IJA 2024 - homework 1
 * Robot class
 */

package ija.ija2023.homework1.common;

public interface Robot {
    Position pos = null;
    int angle = 0;

    /**
     * Gets rotation angle of the robot
     * @return rotation angle
     */
    public int angle();

    /**
     * Checks whether robot can move in current direction
     * @return true when next field exists and is empty
     */
    boolean canMove();

    /**
     * Gets position of the robot
     * @return current position of the robot in environment
     */
    Position getPosition();

    /**
     * Moves robot to next field in current direction
     * @return true when next field exists and is empty
     */
    boolean move();

    /**
     * Rotates robot by 45 degrees clockwise
     */
    void turn();
}

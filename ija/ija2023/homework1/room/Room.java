/**
 * IJA 2024 - homework 1
 * Room class
 */

package ija.ija2023.homework1.room;

import ija.ija2023.homework1.common.Environment;
import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Robot;

/**
 * Class representing room
 */
public class Room extends Object implements Environment {
    int rows;
    int cols;

    /**
     * Creates new Room
     * @param rows number of rows
     * @param cols number of columns
     */
    private Room(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    /**
     * Cretes new instance of class Room with given size
     * @param rows number of rows in environment
     * @param cols number of column in environment
     * @return created room
     * @throws IllegalArgumentException invalid parameters given
     */
    public static Room create(int rows, int cols) {
        if (rows <= 0 || cols <= 0)
            throw new IllegalArgumentException();

        return new Room(rows, cols);
    }

    @Override
    public boolean addRobot(Robot robot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRobot'");
    }

    @Override
    public boolean constainsPosition(Position pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'constainsPosition'");
    }

    @Override
    public boolean createObstacleAt(int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createObstacleAt'");
    }

    @Override
    public boolean obstacleAt(int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obstacleAt'");
    }

    @Override
    public boolean obstacleAt(Position p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obstacleAt'");
    }

    @Override
    public boolean robotAt(Position p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'robotAt'");
    }
}

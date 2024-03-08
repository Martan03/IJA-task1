/**
 * IJA 2024 - homework 1
 * Room class
 */

package ija.ija2023.homework1.room;

import ija.ija2023.homework1.common.Environment;
import ija.ija2023.homework1.common.Obstacle;
import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Robot;

/**
 * Class representing room
 */
public class Room extends Object implements Environment {
    int rows;
    int cols;
    Object[][] board;

    /**
     * Creates new Room
     * @param rows number of rows
     * @param cols number of columns
     */
    private Room(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new Object[rows][cols];
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
        Position pos = robot.getPosition();
        if (!isInside(pos) || !isEmpty(pos))
            return false;

        this.board[pos.getRow()][pos.getCol()] = robot;
        return true;
    }

    @Override
    public boolean constainsPosition(Position pos) {
        return isInside(pos) && this.board[pos.getRow()][pos.getCol()] != null;
    }

    @Override
    public boolean createObstacleAt(int row, int col) {
        Position pos = new Position(row, col);
        if (!isInside(pos) || !isEmpty(pos))
            return false;

        this.board[pos.getRow()][pos.getCol()] = new Obstacle(this, pos);
        return true;
    }

    @Override
    public boolean obstacleAt(int row, int col) {
        if (!isInside(row, col))
            return false;

        return this.board[row][col] instanceof Obstacle;
    }

    @Override
    public boolean obstacleAt(Position p) {
        if (!isInside(p))
            return false;

        return this.board[p.getRow()][p.getCol()] instanceof Obstacle;
    }

    @Override
    public boolean robotAt(Position p) {
        if (!isInside(p))
            return false;

        return this.board[p.getRow()][p.getCol()] instanceof ControlledRobot;
    }

    /**
     * Checks whether given position is inside of the room
     * @param row row to be checked
     * @param col column to be checked
     * @return true when position is in room
     */
    private boolean isInside(int row, int col) {
        return row >= 0 && row < this.rows && col >= 0 && col < this.cols;
    }

    /**
     * Checks whether given position is inside of the room
     * @param p position to be checked
     * @return true when position is in room
     */
    private boolean isInside(Position p) {
        return (p.getRow() >= 0 && p.getRow() < this.rows &&
                p.getCol() >= 0 && p.getCol() < this.cols);
    }

    /**
     * Checks whether position is empty
     * @param p position to be checked
     * @return true when empty
     */
    private boolean isEmpty(Position p) {
        return this.board[p.getRow()][p.getCol()] == null;
    }
}

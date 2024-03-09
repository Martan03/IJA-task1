/**
 * IJA 2024 - homework 1
 * Room class
 */

package ija.ija2023.homework1.room;

import java.util.ArrayList;

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

    ArrayList<Obstacle> obstacles;
    ArrayList<Robot> robots;

    /**
     * Creates new Room
     * @param rows number of rows
     * @param cols number of columns
     */
    private Room(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        this.obstacles = new ArrayList<>();
        this.robots = new ArrayList<>();
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
        if (!constainsPosition(pos) || !isEmpty(pos))
            return false;

        this.robots.add(robot);
        return true;
    }

    @Override
    public boolean constainsPosition(Position pos) {
        return (pos.getRow() >= 0 && pos.getRow() <= this.rows &&
                pos.getCol() >= 0 && pos.getCol() <= this.cols);
    }

    @Override
    public boolean createObstacleAt(int row, int col) {
        Position pos = new Position(row, col);
        if (!constainsPosition(pos) || !isEmpty(pos))
            return false;

        this.obstacles.add(new Obstacle(this, pos));
        return true;
    }

    @Override
    public boolean obstacleAt(int row, int col) {
        Position pos = new Position(row, col);
        if (!constainsPosition(pos))
            return false;

        for (Obstacle o : this.obstacles) {
            if (pos.equals(o.getPosition())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean obstacleAt(Position p) {
        if (!constainsPosition(p))
            return false;

        for (Obstacle o : this.obstacles) {
            if (p.equals(o.getPosition())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean robotAt(Position p) {
         if (!constainsPosition(p))
            return false;

        for (Robot r : this.robots) {
            if (p.equals(r.getPosition())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether position is empty
     * @param p position to be checked
     * @return true when empty
     */
    private boolean isEmpty(Position p) {
        return !obstacleAt(p) && !robotAt(p);
    }
}

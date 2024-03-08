/**
 * IJA 2024 - homework 1
 * ControlledRobot class
 */

package ija.ija2023.homework1.room;

import ija.ija2023.homework1.common.Environment;
import ija.ija2023.homework1.common.Position;
import ija.ija2023.homework1.common.Robot;

/**
 * Class representing controlled robot
 */
public class ControlledRobot extends Object implements Robot {
    Position pos;
    int angle = 0;

    /**
     * Creates new ControlledRobot
     */
    private ControlledRobot(Position pos) {
        this.pos = pos;
    }

    /**
     * Creates instance of class ControlledRobot and inserts it to environment
     * on given position
     * @param env environment to insert robot to
     * @param pos position where robot should be added
     * @return created robot, null on error
     */
    public static ControlledRobot create(Environment env, Position pos) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public int angle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'angle'");
    }

    @Override
    public boolean canMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canMove'");
    }

    @Override
    public Position getPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosition'");
    }

    @Override
    public boolean move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void turn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turn'");
    }
}

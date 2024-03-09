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
    Environment env;
    Position pos;
    int angle = 0;

    /**
     * Creates new ControlledRobot
     */
    private ControlledRobot(Environment env, Position pos) {
        this.env = env;
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
        ControlledRobot robot = new ControlledRobot(env, pos);
        if (!env.addRobot(robot)) {
            return null;
        }
        return robot;
    }

    @Override
    public int angle() {
        return this.angle;
    }

    @Override
    public boolean canMove() {
        Position pos = getNewPos();
        return (this.env.constainsPosition(pos) &&
                !this.env.obstacleAt(pos) &&
                !this.env.robotAt(pos));
    }

    @Override
    public Position getPosition() {
        return this.pos;
    }

    @Override
    public boolean move() {
        if (!canMove())
            return false;

        this.pos = getNewPos();
        return true;
    }

    @Override
    public void turn() {
        this.angle += 45;
        this.angle %= 360;
    }

    private Position getNewPos() {
        int x = 0;
        if (this.angle > 0 && this.angle < 180)
            x = 1;
        else if (this.angle > 180 && this.angle < 360)
            x = -1;

        int y = 0;
        if (this.angle > 90 && this.angle < 270)
            y = 1;
        else if ((this.angle > 270 && this.angle <= 360) ||
                 (this.angle >= 0 && this.angle < 90))
            y = -1;

        return new Position(this.pos.getRow() + y, this.pos.getCol() + x);
    }
}

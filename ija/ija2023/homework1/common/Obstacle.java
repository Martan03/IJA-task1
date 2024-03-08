/**
 * IJA 2024 - homework 1
 * Obstacle class
 */

package ija.ija2023.homework1.common;

/**
 * Class representing obstacle
 */
public class Obstacle extends Object {
    Environment env;
    Position pos;

    /**
     * Creates new obstacle in given environment and on given position
     * @param env environment
     * @param pos position
     */
    public Obstacle(Environment env, Position pos) {
        this.env = env;
        this.pos = pos;
    }

    /**
     * Gets position of the obstacle in environment
     * @return position of the obstacle
     */
    public Position getPosition() {
        return this.pos;
    }
}

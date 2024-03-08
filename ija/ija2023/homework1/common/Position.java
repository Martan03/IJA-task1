/**
 * IJA 2024 - homework 1
 * Position class
 */

package ija.ija2023.homework1.common;

/**
 * Class representing position in environment
 */
public class Position extends Object {
    int row;
    int col;

    /**
     * Creates new position
     * @param row row
     * @param col column
     */
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Gets column of the Position
     * @return column of the position
     */
    public int getCol() {
        return this.col;
    }

    /**
     * Gets row of the Position
     * @return row of the position
     */
    public int getRow() {
        return this.row;
    }

    @Override
    public boolean equals(Object o) {
        // TODO
        return false;
    }

    @Override
    public int hashCode() {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", this.row, this.col);
    }
}

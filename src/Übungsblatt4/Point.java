/*
 * 
 * @Point.java
 * 
 * Copyright (c) Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package Übungsblatt4;

/**
 * Two-dimensional point with non-negative integral coordinates x and y
 * 
 * @author lorenzro
 *
 */
public class Point {

    private int x;
    private int y;

    /**
     * Creates a new Point
     * 
     * @param x value of the x-coordinate     * 
     * @param y value of the y-coordinate
     * 
     * @throws IllegalArgumentException if a coordinate has a negative value
     * 
     */
    public Point(int x, int y) {
		setX(x);
		setY(y);
    }

    private static boolean checkNonNegative(int z) {
		return (z >= 0);
    }

    /**
     * Sets the value of the x-coordinate
     * 
     * @param x new value of the x-coordinate
     * 
     * @throws IllegalArgumentException if x has a negative value

     */
    public void setX(int x) {
		if (!checkNonNegative(x))
			throw new IllegalArgumentException("x-value must be non-negative");
		this.x = x;
    }

    /**
     * Sets the value of the y-coordinate
     * 
     * @param x new value of the y-coordinate
     * 
     * @throws IllegalArgumentException if y has a negative value
     * 
     */
    public void setY(int y) {
		if (!checkNonNegative(y))
			throw new IllegalArgumentException("y-value must be non-negative");
		this.y = y;
    }

    /**
     * Returns the value of the x-coordinate
     * 
     * @return value of the x-coordinate
     */
    public int getX() {
		return this.x;
    }

    /**
     * Returns the value of the y-coordinate
     * 
     * @return value of the y-coordinate
     */
    public int getY() {
		return this.y;
    }

    /**
     * Returns a String object representing the Point's coordinates
     * 
     * @return String representation of the values of the coordinates of this Point
     */
    @Override
    public String toString() {
		return "(" + getX() + "," + getY() + ")";
    }

    /**
     * Compares this Point to the specified object.
     * The result is true if and only if the argument is not null and is a Point object with the same coordinates as this Point
     * 
     * @return true if the objects are the same; false otherwise
     */
    @Override
    public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o.getClass().equals(this.getClass())))
			return false;
		Point a = (Point) o;
		return (a.getX() == this.getX() && a.getY() == this.getY());
    }

}

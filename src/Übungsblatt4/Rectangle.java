/*
 * 
 * @Rectangle.java
 * 
 * Copyright (c) Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package Übungsblatt4;

/**
 * Rectangle with length, width and position
 * 
 * @author lorenzro
 * 
 */
public class Rectangle extends GeometricObject {

    private int length;
    private int width;
    private static int count = 0;

    /**
     * Creates a new Rectangle with specified position, and width = length = 10
     * 
     * @param position the position of the Rectangle
     * 
     */
    public Rectangle(Point position) {
		super(position);
		setLength(10);
		setWidth(10);
		++count;
    }

    /**
     * Creates a new Rectangle with specified length, width and position
     * 
     * @param length   the length of the Rectangle
     * @param width    the width of the Rectangle
     * @param position the position of the Rectangle
     * 
     * @throws IllegalLengthException if length or width have a negative value
     * 
     */
    public Rectangle(int length, int width, Point position) {
		super(position);
		setLength(length);
		setWidth(width);
		++count;
    }

    private static boolean checkSideLength(int sideLength) {
		return (sideLength >= 0);
    }

    /**
     * Sets the value of the length
     * 
     * @param length new value of the length
     * 
     * @throws IllegalLengthException if length has a negative value
     * 
     */
    public void setLength(int length) {
		if (!checkSideLength(length))
			throw new IllegalLengthException("Value must be non-negative");
		this.length = length;
    }

    /**
     * Sets the value of the width
     * 
     * @param width new value of the width
     * 
     * @throws IllegalLengthException if width has a negative value
     * 
     */
    public void setWidth(int width) {
		if (!checkSideLength(width))
			throw new IllegalLengthException("Value must be non-negative");
		this.width = width;
    }

    /**
     * Returns the value of the length
     * 
     * @return value of the length
     */
    public int getLength() {
		return this.length;
    }

    /**
     * Returns the value of the width
     * 
     * @return value of the width
     */
    public int getWidth() {
		return this.width;
    }

    /**
     * Returns the number of created Rectangle objects
     * 
     * @return number of created Rectangle objects
     */
    public static int getCount() {
		return count;
    }

    /**
     * Returns the area of the Rectangle
     * 
     * @return area of the Rectangle
     */
    public double getArea() {
		return this.length * this.width;
    }

    /**
     * Returns a String object representing the Rectangle's length, width and
     * position
     * 
     * @return String representation of length, width and position of this Rectangle
     */
    @Override
    public String toString() {
		return "Rectangle (length = " + getLength() + ", width = " + getWidth() + ", position = " + getPosition() + ")";
    }

    /**
     * Compares this Rectangle to the specified object. The result is true if and
     * only if the argument is not null and is a Rectangle object with the same
     * length, width and position as this Rectangle
     * 
     * @return true if the objects are the same; false otherwise
     */
    @Override
    public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o.getClass().equals(this.getClass())))
			return false;
		Rectangle a = (Rectangle) o;
		return (a.getPosition().equals(this.getPosition()) && a.getLength() == this.getLength()
			&& a.getWidth() == this.getWidth());
    }

}

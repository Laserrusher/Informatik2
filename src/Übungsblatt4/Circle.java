/*
 * 
 * @Circle.java
 * 
 * Copyright (c) Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package Übungsblatt4;

/**
 * Circle with radius and position
 * 
 * @author lorenzro
 * 
 */
public class Circle extends GeometricObject {

    private int radius;
    private static int count = 0;

    /**
     * Creates a new Circle with specified position and radius 10
     * 
     * @param position the position of the circle
     * 
     */
    public Circle(Point position) {
		super(position);
		setRadius(10);
		++count;
    }

    /**
     * Creates a new Circle with specified radius and position
     * 
     * @param radius   the radius of the circle
     * @param position the position of the circle
     * 
     * @throws IllegalLengthException if the radius has a negative value
     * 
     */
    public Circle(int radius, Point position) {
		super(position);
		setRadius(radius);
		++count;
    }

    private static boolean checkRadius(int radius) {
		return (radius >= 0);
    }

    /**
     * Sets the value of the radius
     * 
     * @param radius new value of the radius
     * 
     * @throws IllegalLengthException if radius has a negative value
     * 
     */
    public void setRadius(int radius) {
		if (!checkRadius(radius))
			throw new IllegalLengthException("Value must be non-negative");
		this.radius = radius;
    }
	
    /**
     * Returns the value of the radius
     * 
     * @return value of the radius
     */
    public int getRadius() {
		return this.radius;
    }

    /**
     * Returns the number of created Circle objects
     * 
     * @return number of created Circle objects
     */
    public static int getCount() {
		return count;
    }

    /**
     * Returns the area of the Circle
     * 
     * @return area of the Circle
     */
    @Override
    public double getArea() {
		return Math.PI * this.radius * this.radius;
    }

    /**
     * Returns a String object representing the Circle's radius and position
     * 
     * @return String representation of radius and position of this Circle
     */
    @Override
    public String toString() {
		return "Circle (radius = " + getRadius() + ", position = " + getPosition() + ")";
    }

    /**
     * Compares this Circle to the specified object. The result is true if and only
     * if the argument is not null and is a Circle object with the same radius and
     * position as this Circle
     * 
     * @return true if the objects are the same; false otherwise
     */
    @Override
    public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o.getClass().equals(this.getClass())))
			return false;
		Circle a = (Circle) o;
		return (a.getPosition().equals(this.getPosition()) && a.getRadius() == this.getRadius());
    }

}

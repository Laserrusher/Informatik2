/*
 * 
 * @GeometricObject.java
 * 
 * Copyright (c) Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package Übungsblatt4;

/**
 * GeometricObject with position
 * 
 * @author lorenzro
 * 
 */
public abstract class GeometricObject {

    private Point position;
    private static int count = 0;

    /**
     * Creates a new GeometricObject with specified position
     * 
     * @param position the position of the GeometricObject
     * 
     */
    protected GeometricObject(Point position) {
		setPosition(position);
		count++;
    }

    /**
     * Sets the position
     * 
     * @param position the new position
     * 
     */
    public void setPosition(Point position) {
		this.position = position;
    }

    /**
     * Returns the position
     * 
     * @return the position
     */
    public Point getPosition() {
		return this.position;
    }

    /**
     * Returns the number of created GeometricObject objects
     * 
     * @return number of created GeometricObject objects
     */
    public static int getCount() {
		return count;
    }

    /**
     * Returns the area of the GeometricObject
     * 
     * @return area of the GeometricObject
     */
    public abstract double getArea();

}

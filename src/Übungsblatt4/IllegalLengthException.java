/*
 * 
 * @IllegalLengthException.java
 * 
 * Copyright (c) Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package Übungsblatt4;

/**
 * Indicates that an illegal value has been passed as a length
 * 
 * @author lorenzro
 *
 */
 @SuppressWarnings("serial")
public class IllegalLengthException extends IllegalArgumentException {

    /**
     * Constructs an IllegalLengthException with the specified detailed message
     * 
     * @param message the detailed message
     * 
     */
    public IllegalLengthException(String message) {
        super(message);
    }

}

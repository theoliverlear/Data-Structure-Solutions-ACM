package com.example;

public class ColorNotSupportedException extends RuntimeException {
    //============================-Constants-=================================
    public static final String DEFAULT_MESSAGE = "Color not supported. " +
                                                "Please try a different" +
                                                " color.";
    //===========================-Constructors-===============================
    public ColorNotSupportedException() {
        super(DEFAULT_MESSAGE);
    }
    public ColorNotSupportedException(String message) {
        super(message);
    }
}

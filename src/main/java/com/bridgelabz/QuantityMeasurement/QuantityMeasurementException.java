package com.bridgelabz.QuantityMeasurement;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        WRONG_UNIT
    }
    ExceptionType type;
    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

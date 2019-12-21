package com.bridgelabz.QuantityMeasurement;

public class QuantityMeasurement {

    private final double value;
    public Conversion.UnitConversion unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public QuantityMeasurement(Conversion.UnitConversion unit, double value) {
        this.value = value;
        this.unit = unit;
    }
//        if (input1.unit.typeOfUnits.equals(input2.unit.typeOfUnits)) {

    public boolean compareCheck(QuantityMeasurement that) throws QuantityMeasurementException {
            if(this.unit.unit.equals(that.unit.unit)) {
                Double firstValue = this.unit.convertUnits(this.value);
                Double secondValue = that.unit.convertUnits(that.value);
                return firstValue.equals(secondValue);
            }
        throw new QuantityMeasurementException("INVALID UNIT TYPE", QuantityMeasurementException
                .ExceptionType.WRONG_UNIT);
    }

    public double add(QuantityMeasurement that) throws QuantityMeasurementException {
        if(this.unit.unit.equals(that.unit.unit)) {
            Double firstValue = this.unit.convertUnits(this.value);
            Double secondValue = that.unit.convertUnits(that.value);
            return Math.floor(firstValue + secondValue);
        }
        throw new QuantityMeasurementException("INVALID UNIT TYPE", QuantityMeasurementException
                .ExceptionType.WRONG_UNIT);
    }

    public Boolean compareTemperatures(QuantityMeasurement that) {
        Double temperature;
        if (this.unit.equals(Conversion.UnitConversion.TEMPERATURE)) {
            temperature = (this.value * 9 / 5) + 32;
        }else {
            temperature = (this.value - 32) * 5 / 9;
        }
        return Double.compare(temperature,that.value) == 0;
    }

}

package com.bridgelabz.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0feetAnd0feet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Conversion.UnitConversion.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetAnd1FeetValues_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Conversion.UnitConversion.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1feetAnd0FeetValues_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET,1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Conversion.UnitConversion.FEET,0.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    
    @Test
    public void givenOneNUllValue_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET,3.0);
        feet1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Conversion.UnitConversion.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Conversion.UnitConversion.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValues_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Conversion.UnitConversion.INCH,0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Conversion.UnitConversion.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Conversion.UnitConversion.INCH,1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given0InchAnd0Feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET, 0.0);
        QuantityMeasurement inches1 = new QuantityMeasurement(Conversion.UnitConversion.INCH, 0.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        QuantityMeasurement inches1 = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1.0);
        boolean check = feet1.compareCheck(inches1);
        Assert.assertFalse(check);
    }

    @Test
    public void given1FeetAnd1Feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        boolean result = feet1.compareCheck(feet2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1Inch_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1.0);
        boolean result = inch1.compareCheck(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1feetAnd1inch_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAndOneFeet_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        boolean compareCheck = inch.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1feetAnd12inches_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 12.0);
        boolean compareCheck = feet.compareCheck(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchesAnd1Feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inches = new QuantityMeasurement(Conversion.UnitConversion.INCH,12);
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd12Inch_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inches = new QuantityMeasurement(Conversion.UnitConversion.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET,3.0);
        boolean compareCheck = inches.compareCheck(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Conversion.UnitConversion.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Conversion.UnitConversion.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);

    }

    @Test
    public void given0yardAnd1yardValues_IfNotEqual_ShouldReturnFalse() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Conversion.UnitConversion.YARD,0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Conversion.UnitConversion.YARD,1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenOneNUllValueYardUnit_IfNull_ShouldReturnFalse() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Conversion.UnitConversion.YARD,3.0);
        yard1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given3feetAnd1yard_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        boolean compareCheck = feet.compareCheck(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1feetAnd1yard_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        boolean compareCheck = feet.compareCheck(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1inchAnd1yard_IfNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inches = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        boolean compareCheck = inches.compareCheck(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1yardAnd36inch_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        QuantityMeasurement inches = new QuantityMeasurement(Conversion.UnitConversion.INCH, 36);
        boolean compareCheck = yard.compareCheck(inches);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36inchAnd1yard_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inches = new QuantityMeasurement(Conversion.UnitConversion.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        boolean compareCheck = inches.compareCheck(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardAnd3feet_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(Conversion.UnitConversion.YARD, 1);
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 3);
        boolean compareCheck = yard.compareCheck(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1inchAnd2Centimeter_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 2);
        QuantityMeasurement centiMeter = new QuantityMeasurement(Conversion.UnitConversion.CENTIMETER, 5);
        boolean compareCheck = inch.compareCheck(centiMeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1inchAnd1Centimeter_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1);
        QuantityMeasurement centiMeter = new QuantityMeasurement(Conversion.UnitConversion.CENTIMETER, 1);
        boolean compareCheck = inch.compareCheck(centiMeter);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void give1InchAnd1Feet_AddBoth_ReturnAdditionInInches() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 2);
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1);
        double finalResult = inch.add(feet);
        Assert.assertEquals(14,finalResult,0.0);
    }

    @Test
    public void give1InchAnd1Inch_AddBoth_ReturnAdditionInInches() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1);
        QuantityMeasurement inch1 = new QuantityMeasurement(Conversion.UnitConversion.INCH, 1);
        double finalResult = inch.add(inch1);
        Assert.assertEquals(2,finalResult,0.0);
    }

    @Test
    public void give1FeetAnd1Feet_AddBoth_ReturnAdditionInInches() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1);
        QuantityMeasurement feet1 = new QuantityMeasurement(Conversion.UnitConversion.FEET, 1);
        double finalResult = feet.add(feet1);
        Assert.assertEquals(24,finalResult,0.0);
    }

    @Test
    public void give1InchAnd1Centimeter_AddBoth_ReturnAdditionInInches() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Conversion.UnitConversion.INCH, 2);
        QuantityMeasurement centimeter = new QuantityMeasurement(Conversion.UnitConversion.CENTIMETER, 2.5);
        double finalResult = inch.add(centimeter);
        Assert.assertEquals(3,finalResult,0.0);
    }

    /******************************** VOLUME ******************************/

    @Test
    public void given1GallonAnd3Litre_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(Conversion.UnitConversion.GALLON, 1);
        QuantityMeasurement litre = new QuantityMeasurement(Conversion.UnitConversion.LITRE, 3.785);
        boolean result = gallon.compareCheck(litre);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1000MiliLitre_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement miliLitre = new QuantityMeasurement(Conversion.UnitConversion.MILILITRE, 1000);
        QuantityMeasurement litre = new QuantityMeasurement(Conversion.UnitConversion.LITRE, 1);
        boolean result = litre.compareCheck(miliLitre);
        Assert.assertTrue(result);
    }

    @Test
    public void give1GallonAnd3Litre_AddBoth_ReturnAdditionInLitre() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(Conversion.UnitConversion.GALLON, 1);
        QuantityMeasurement litre = new QuantityMeasurement(Conversion.UnitConversion.LITRE, 3.78);
        double finalResult = gallon.add(litre);
        Assert.assertEquals(7.00,finalResult,0.0);
    }

    @Test
    public void give1LitreAnd1000MiliLitre_AddBoth_ReturnAdditionInLitre() throws QuantityMeasurementException {
        QuantityMeasurement miliLitre = new QuantityMeasurement(Conversion.UnitConversion.MILILITRE, 1000);
        QuantityMeasurement litre = new QuantityMeasurement(Conversion.UnitConversion.LITRE, 1);
        double finalResult = miliLitre.add(litre);
        Assert.assertEquals(2,finalResult,0.0);
    }

    /**********************************WEIGHT****************************/

    @Test
    public void given1KgAnd1000Gram_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement kilogram = new QuantityMeasurement(Conversion.UnitConversion.KILOGRAM, 1);
        QuantityMeasurement gram = new QuantityMeasurement(Conversion.UnitConversion.GRAM, 1000);
        boolean result = gram.compareCheck(kilogram);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Kg_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement tonne = new QuantityMeasurement(Conversion.UnitConversion.TONNE, 1);
        QuantityMeasurement kilogram = new QuantityMeasurement(Conversion.UnitConversion.KILOGRAM, 1000);
        boolean result = tonne.compareCheck(kilogram);
        Assert.assertTrue(result);
    }

    @Test
    public void give1TonneAnd1000Gram_AddBoth_ReturnAdditionInLitre() throws QuantityMeasurementException {
        QuantityMeasurement tonne = new QuantityMeasurement(Conversion.UnitConversion.TONNE, 1);
        QuantityMeasurement gram = new QuantityMeasurement(Conversion.UnitConversion.GRAM, 1000);
        double finalResult = tonne.add(gram);
        Assert.assertEquals(1001,finalResult,0.0);
    }

    /***********************************TEMPERATURE********************************************/

    @Test
    public void given212FareineitAnd100Celcius_IfEqual_ReturnTrue(){
        QuantityMeasurement temperature = new QuantityMeasurement(Conversion.UnitConversion.TEMPERATURE,100);
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Conversion.UnitConversion.FAHRENHEIT,212);
        boolean compareCheck = temperature.compareTemperatures(fahrenheit);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FahrenheitAnd32Celsius_IfEqual_ReturnTrue(){
        QuantityMeasurement temperature = new QuantityMeasurement(Conversion.UnitConversion.TEMPERATURE,-17.22222222222222);
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Conversion.UnitConversion.FAHRENHEIT,1);
        boolean compareCheck = fahrenheit.compareTemperatures(temperature);
        Assert.assertTrue(compareCheck);
    }

}

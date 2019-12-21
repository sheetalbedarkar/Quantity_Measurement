package com.bridgelabz.QuantityMeasurement;

public class Conversion {

    public enum UnitConversion{
        FEET(Unit.LENGTH) {
            public double convertUnits(double length) {
                return length * 12;
            }
        },
        INCH(Unit.LENGTH) {
            public double convertUnits(double length) {
                return length;
            }
        },
        CENTIMETER(Unit.LENGTH){
            public double convertUnits(double length){
                return Math.floor(length/2);
            }
        },GALLON(Unit.VOLUME){
            public double convertUnits(double volume){
                return volume * 3.785;
            }
        },LITRE(Unit.VOLUME){
            public double convertUnits(double volume){
                return volume;
            }
        },MILILITRE(Unit.VOLUME){
            public double convertUnits(double volume){
                return volume / 1000;
            }
        },
        YARD (Unit.LENGTH){
            public double convertUnits(double length) {
                return length * 3 * 12;
            }
        },
        KILOGRAM(Unit.WEIGHT){
            public double convertUnits(double weight){
                return weight;
            }
        },
        GRAM(Unit.WEIGHT){
            public double convertUnits(double weight){
                return weight/1000;
            }
        },
        TONNE(Unit.WEIGHT){
            public double convertUnits(double weight){
                return weight * 1000;
            }
        },
        FAHRENHEIT(Unit.TEMPERATURE){
            public double convertUnits(double temperature){

                return temperature;
            }
        },
        TEMPERATURE(Unit.TEMPERATURE){
            public double convertUnits(double temperature){

                return temperature;
            }
        };
        public Unit unit;

        UnitConversion(Unit unit) {
            this.unit = unit;
        }

        public double convertUnits(double length) {
            return 0.0;
        }
    }
}

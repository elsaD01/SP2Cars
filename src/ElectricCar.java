public class ElectricCar extends ACar {

    /**6.    Klasse ElectricCar. Denne klasse nedarver fra ACar. Den skal tilføje metoderne:

     a.    getBatteryCapacityKWh(); // returns the battery capacity in kilowatt hours

     b.    getMaxRangeKm(); // returns the maximum range in kilometres.

     c.    getWhPrKm(); // returns the power consumption in watt hours per driven kilometre.

     Lav attributer til battery capacity og max range, som initialiseres i konstruktøren.
     Beregn watt-timer per kilometer ud fra disse to attributter.*/

    int getBatteryCapacityKWh;
    int getMaxRangeKm;

    int getWhPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int getBatteryCapacityKWh, int getMaxRangeKm) {

        super(registrationNumber, make, model, numberOfDoors);

        this.getBatteryCapacityKWh = getBatteryCapacityKWh;

        this.getMaxRangeKm = getMaxRangeKm;

        this.getWhPrKm = getBatteryCapacityKWh * 1000 / getMaxRangeKm;
    }



    public int getBatteryCapacityKWh() {
        return getBatteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return getMaxRangeKm;
    }

    public int getWhPrKm() {
        return getWhPrKm;
    }


    public int getRegistrationFee() {
        return 0;
    }

    public String toString() {
        return "ElectricCar: " + " getBatteryCapacityKWh: " + getBatteryCapacityKWh +
        ", getMaxRangeKm: " + getMaxRangeKm + ", getWhPrKm: " + getWhPrKm + super.toString();
    }
}

abstract class AFuelCar extends ACar {

    /**3.    Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:

     a.    abstract String getFuelType(); // should return “Gasoline” or “Diesel”

     b.    int kmPrLitre(); // should return how many kilometres the car can drive on 1 litre of fuel

     Lav en attribut til at gemme kilometer per liter og initialisér den i konstruktøren.
    */

    private int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int kmPrLitre(){
        return kmPrLitre;

    }

    @Override
    public String toString() {
        return ", GasolineCar: " + " kmPrLitre: " + kmPrLitre + super.toString() +
                "\n\n";
    }
}


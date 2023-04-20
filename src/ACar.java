abstract class ACar implements Car {

    /**2. Abstrakt klasse ACar.
     *    Skal implementere Car interfacet og alle metoderne i dette, undtagen getRegistrationFee().
     *    Lav klasse attributter til at holde styr på registreringsnummer (nummerplade), mærke, model og antal døre.
     *    (Husk at bruge engelske navne til alt).
     *    Overvej hvilke attributter det giver mening at lave final.
     */

    private String registrationNumber;

    private String make;

    private String model;

    private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;

    }

    public String getModel(){
        return model;

    }
    public int getNumberOfDoors(){
        return numberOfDoors;

    }

    @Override
    public String toString() {
        return ", registrationNumber: " + registrationNumber + '\n' +
                " Type: " + make + '\n'+
                " Model: " + model + '\n' +
                " NumberOfDoors: " + numberOfDoors;
    }

}

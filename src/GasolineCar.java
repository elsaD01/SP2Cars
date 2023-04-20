 public class GasolineCar extends AFuelCar{

    /**4. Klasse GasolineCar. Denne klasse nedarver fra FuelCar og skal implementere
          de to abstrakte metoder getFuelType() og getRegistrationFee().
          Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.*/

        private String registrationFee;

        public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
            super(registrationNumber, make, model, numberOfDoors,kmPrLitre);
        }

     public String getFuelType()
     {
         return "Gasoline";
     }

     public int getRegistrationFee()
     {
         if ((20 <= kmPrLitre()) && (kmPrLitre() <= 50))
         {
             return 330;
         }
         else if ((15 <= kmPrLitre()) && (kmPrLitre() <= 20))
         {
             return 1050;
         }
         else if ((10 <= kmPrLitre()) && (kmPrLitre() <= 15))
         {
             return 2340;
         }
         else if ((5 <= kmPrLitre()) && (kmPrLitre() <= 10))
         {
             return 5500;
         }
         else if (kmPrLitre() < 5)
         {
             return 10470;
         }
         return 0;
     }

     @Override
     public String toString() {
         return "\n\n" + super.toString();
     }
 }





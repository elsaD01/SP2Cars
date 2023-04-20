public class DieselCar extends AFuelCar{

    /**Klasse DieselCar. Denne klasse nedarver også fra FuelCar
     og skal også implementere de to abstrakte metoder getFuelType() og getRegistrationFee().
     Herudover skal der være en metode, hasParticleFilter(),
     der fortæller om bilen har et partikelfilter monteret.
     Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.*/

    boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public String getFuelType()
    {
        return "Diesel";
    }

    public int getRegistrationFee()

    {
        int totalFee = 0;

        if (hasParticleFilter)
        {
            totalFee += 1000;
        }

        if ((20 <= kmPrLitre()) && (kmPrLitre() <= 50))
        {
            totalFee = 130;
            return totalFee;
        } else if ((15 <= kmPrLitre()) && (kmPrLitre() <= 20))
        {
            totalFee = 1390;
            return totalFee;
        } else if ((10 <= kmPrLitre()) && (kmPrLitre() <= 15))
        {
            totalFee = 1850;
            return totalFee;
        } else if ((5 <= kmPrLitre()) && (kmPrLitre() <= 10))
        {
            totalFee = 2770;
            return totalFee;
        } else if (kmPrLitre() < 5)
        {
            totalFee = 15260;
            return totalFee;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return "DieselCar: " + " hasParticleFilter: " + hasParticleFilter + super.toString();
    }
}

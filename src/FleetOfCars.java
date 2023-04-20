import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car){

        fleet.add(car);

    }

    @Override
    public String toString() {
        return "" + fleet; //"FleetOfCars"
    }

    public int getTotalRegistrationFeeForFleet(){

        int sum = 0;

        for(int i = 0; i < fleet.size(); i++)
            sum += fleet.get(i).getRegistrationFee();

        return sum;
    }

}

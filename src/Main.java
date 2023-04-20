public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();


Car Gasoline = new GasolineCar(" CP 65 498 ", "Volvo", "S40", 5,50);

Car Diesel = new DieselCar("AL 44 264 ",  "Mazda", "CX4",5, 50, true);

Car Electric = new ElectricCar(" TI 34 596 " , "Tesla", "X", 5, 20, 80);

        fleetOfCars.addCar(Gasoline);
        fleetOfCars.addCar(Diesel);
        fleetOfCars.addCar(Electric);

        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());

        System.out.println(fleetOfCars);


    }
}
public class OLA {
    public Car bookCar(int numberOfPassenger, int numberOfKms){
        if(numberOfPassenger<=3){

            return new Sedan(numberOfPassenger,numberOfKms);
        }
        else{

            return new HatchBack(numberOfPassenger,numberOfKms);
        }
    }

    public int calculateBill(Car car){
        if(car instanceof Sedan){
            Sedan sedan = (Sedan) car;
            return ((Sedan) car).farePerKm*car.numberOfKms;
        }
        else{
            HatchBack hatchBack = (HatchBack) car;
            return ((HatchBack) car).farePerKm*car.numberOfKms;
        }
    }

}

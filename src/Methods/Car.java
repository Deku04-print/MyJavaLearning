package Methods;

public class Car extends Vehicle{




    private final int speed_limit=200;

    @Override
    public void accelerate() {
    //this method will work to accelerate the vehicle which will extends this method
    }

    @Override
    public void decelerate() {

    }

    public int getSpeed_limit() {
        return speed_limit;
    }




}

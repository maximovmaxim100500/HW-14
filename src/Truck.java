public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transport) {
        super.check(transport);
        ServiceStation.checkTrailer();
    }
}

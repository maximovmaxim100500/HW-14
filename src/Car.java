public class Car extends Bicycle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        ServiceStation.checkEngine();
    }
}


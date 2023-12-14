public interface PossibilitiesServiceStation {
    default void check(Transport transport){
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            ServiceStation.updateTyre();
        }
    }
}

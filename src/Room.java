public class Room {

    private double size;
    private double temperature;
    private boolean airConditioner;

    public Room(double size, double temperature, boolean airConditioner) {
        this.size = size;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public Room() {
    }


    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public double getSize() {
        return size;
    }

    public void setRoom(double room) {
        this.size = size;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    boolean testTemperaturyRoom(Room room) {
        final int TEMP_MIN = 15;
        final int wzkazniTemp = 6;

        boolean testTemperatury = true;
        //--room.temperature;                           Wersja 1
        room.temperature -= (wzkazniTemp/room.size) ;  /* Wersja rozszerzona */

        if (room.temperature < TEMP_MIN) {
            room.temperature = TEMP_MIN;
            testTemperatury = false;
        }
        if (!room.airConditioner) {
            testTemperatury = false;
        }
        return testTemperatury;
    }

}

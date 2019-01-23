public class Room {

    private double size;
    private double temperature;
    private boolean airConditioner;

    public Room(double size, double temperature, boolean airConditioner) {
        this.size = size;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
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
    boolean testTemperaturyRoom() {
        final int TEMP_MIN = 15;
        final int wzkazniTemp = 6;

        //--room.temperature;                   Wersja 1
        temperature -= (wzkazniTemp/size) ;  /* Wersja rozszerzona */

        if (temperature < TEMP_MIN || !airConditioner ) {
            if (temperature< TEMP_MIN) {temperature = TEMP_MIN;};
            return false;
        }
        return true;
    }
}

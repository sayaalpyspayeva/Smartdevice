public abstract class Gadget {
    public void turnOn() {
        System.out.println("The device is turned on.");
    }

    public void turnOff() {
        System.out.println("The device is turned off.");
    }

    public void connectToInternet() {
        System.out.println("The device is connected to the internet.");
    }

    public abstract void receiveNotification(String message);
    public abstract void batteryStatus();

    public void connectToDevice(Gadget anotherDevice) {
        System.out.println("Device is connected to another device.");
        // Implementation to communicate with the connected device
    }
}

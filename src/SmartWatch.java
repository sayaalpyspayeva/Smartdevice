public class SmartWatch extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("Smartwatch received notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("Smartwatch battery is at 75%.");
    }

    public void trackHeartRate() {
        System.out.println("Tracking heart rate.");
    }

    public void showTime() {
        System.out.println("Displaying current time on Smartwatch.");
    }
}

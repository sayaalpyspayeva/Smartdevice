public class SmartPhone extends Gadget {
    private SmartWatch connectedWatch;  // Add a field for the connected watch

    @Override
    public void receiveNotification(String message) {
        System.out.println("Smartphone received notification: " + message);

        // If there is a connected watch, forward the notification
        if (connectedWatch != null) {
            connectedWatch.receiveNotification(message);
        }
    }

    @Override
    public void batteryStatus() {
        System.out.println("Smartphone battery is at 80%.");
    }

    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);

        // Notify the connected watch about the SMS
        if (connectedWatch != null) {
            connectedWatch.receiveNotification("SMS from smartphone: " + message);
        }
    }

    // Method to connect the phone to a watch
    public void connectToWatch(SmartWatch watch) {
        this.connectedWatch = watch;
    }
}

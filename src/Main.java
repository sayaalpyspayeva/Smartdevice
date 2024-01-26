public class Main {
    public static void main(String[] args) {
        // Create instances of smart devices
        SmartPhone smartphone = new SmartPhone();
        SmartWatch smartwatch = new SmartWatch();
        SmartTV smartTV = new SmartTV();

        // Connect the phone to the watch
        smartphone.connectToWatch(smartwatch);

        // Send an SMS from the phone, and it should also notify the connected watch
        smartphone.sendSMS("Hello from smartphone!");

        // Turn on and connect devices to the internet
        smartphone.turnOn();
        smartphone.connectToInternet();

        smartwatch.turnOn();
        smartwatch.connectToInternet();

        smartTV.turnOn();
        smartTV.connectToInternet();

        // Use specific functionalities of each device
        smartphone.makeCall("87772836762");
        smartphone.sendSMS("Hello!");

        smartwatch.trackHeartRate();
        smartwatch.showTime();

        smartTV.streamVideo("https://moodle.astanait.edu.kz/mod/assign/view.php?id=113887");
        smartTV.changeChannel(5);

        // Inter-device communication
        smartphone.connectToDevice(smartTV);
        smartwatch.connectToDevice(smartphone);

        // Turn off devices
        smartphone.turnOff();
        smartwatch.turnOff();
        smartTV.turnOff();
    }
}
package SingleLevelInheritance;
class Device {
    String deviceId;
    String status;
     
	// create constructor 
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // display result
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;
    // create constructor 
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
	// display result
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class DeviceDetails {
    public static void main(String[] args) {
        Device device = new Device("D12345", "Active");
        device.displayStatus();
        Thermostat thermostat = new Thermostat("T67890", "Active", 22);
        thermostat.displayStatus();
    }
}

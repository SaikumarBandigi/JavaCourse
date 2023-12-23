package solidprinciples.dip;


interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Implementation for turning on the light bulb
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        // Implementation for turning off the light bulb
        System.out.println("Light bulb turned off");
    }
}

public class Switch {
    Switchable device;
    boolean isOn;  // Declaration and initialization of isOn

    Switch(Switchable device) {
        this.device = device;
        this.isOn = false;  // Initialize isOn to false by default
    }

    void operate() {
        if (device != null) {
            if (isOn) {
                device.turnOff();
                isOn = false;
            } else {
                device.turnOn();
                isOn = true;
            }
        }
    }

    public static void main(String[] args) {

        LightBulb lightBulb = new LightBulb();
        Switch aSwitch = new Switch(lightBulb);
        aSwitch.operate();

    }
}

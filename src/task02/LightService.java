package task02;

import java.util.Scanner;

public class LightService {

    public void switchOnOff(Light light, Scanner scanner) {
        System.out.println("Switching on ? ('true'/'false')");
        light.setOn(Boolean.parseBoolean(scanner.nextLine()));
    }

    public void brightness(Light light, Scanner scanner) {
        System.out.println("Input the brightness level: ('0'/'100')");
        light.setBrightness(Integer.parseInt(scanner.nextLine()));
    }

    public void printOnOffStatus(Light light) {
        System.out.println("The light is " + (light.isOn() ? "on" : "off"));
    }
}

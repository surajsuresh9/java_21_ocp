package java_21.enum_type;

public enum TrafficLight  {
    RED("Stop"), AMBER("Wait"), GREEN("Go");

    final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}


class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight[] lights = TrafficLight.values();
        for (TrafficLight light : lights) {
            System.out.println("Light: " + light.toString() + " Action: " + light.getAction());
        }
    }
}
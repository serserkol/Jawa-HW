package house;

public class Robot extends Creature {

    private static int robotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    private String description;

    private int version;

    public Robot(String name, String description, int version) {
        super(name);
        this.description = description;
        this.version = version;
        robotCount++;
    }

    public Robot(String name, String description) {
        super(name);
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        robotCount++;
    }

    public static void printTotalRobotCount(){
//        System.out.println(this.name); impossible
        System.out.println("Total robot number = " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(getName() + ", description: " + description + ", version: " + version);
        System.out.println("Total robot number = " + robotCount);
    }


    @Override
    public void sayHello() {
        printCurrentRobotInfo();
    }
}
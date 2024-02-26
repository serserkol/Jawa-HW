package house;

public class Dog extends Animal {

    public Dog(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Gav! I'm dog. My name is " + super.getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) {
            bark();
        } else {
            super.play(another);
        }
    }


}

package solidprinciples.intsp;

// Interface defining actions related to flying
interface FlyingCreature {
    void fly();
}

// Interface defining actions related to swimming
interface SwimmingCreature {
    void swim();
}

// Class representing a bird that can fly
class Bird implements FlyingCreature {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Class representing a fish that can swim
class Fish implements SwimmingCreature {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Class representing a toy bird that can fly but not swim
class ToyBird implements FlyingCreature {
    @Override
    public void fly() {
        System.out.println("Toy bird is flying");
    }
}

// Class representing a toy fish that can swim but not fly
class ToyFish implements SwimmingCreature {
    @Override
    public void swim() {
        System.out.println("Toy fish is swimming");
    }
}

// Client code using the interfaces
public class InterfaceSegregationExample {
    public static void main(String[] args) {

        FlyingCreature bird = new Bird();
        SwimmingCreature fish = new Fish();
        FlyingCreature toyBird = new ToyBird();
        SwimmingCreature toyFish = new ToyFish();

        bird.fly();
        fish.swim();
        toyBird.fly();
        toyFish.swim();

    }
}

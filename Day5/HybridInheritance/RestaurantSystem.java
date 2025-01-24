package HybridInheritance;
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
	// create constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
	// create constructor	
    Chef(String name, int id) {
        super(name, id);
    }
    // display result
    public void performDuties() {
        System.out.println(name +" With Id "+ id + " is cooking meals.");
    }
}

class Waiter extends Person implements Worker {
	// create constructor	
    Waiter(String name, int id) {
        super(name, id);
    }
    // display result  
    public void performDuties() {
        System.out.println(name + " With Id "+ id + " is serving food to customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ankit", 101);
        Waiter waiter = new Waiter("Sakshi", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

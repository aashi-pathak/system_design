package strategydesignpattern;

/*
    Here Vehicle class has hasEngine method and driveObj object in common for all its children.
    Therefor we add constructor injection in Vehicle class.
*/

class Vehicle {
    Drive driveObj;

    public Vehicle(Drive driveObj) {
        this.driveObj = driveObj;
    }
    public boolean hasEngine() {
        return false;
    }
}

class Sport extends Vehicle {
    public Sport() {
        super(new SpecialDrive());
    }
}

class Passenger extends Vehicle {
    public Passenger() {
        super(new NormalDrive());
    }
}


/*
    drive class and interface
 */
interface Drive {
    void drive();
}

class NormalDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}

class SpecialDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}



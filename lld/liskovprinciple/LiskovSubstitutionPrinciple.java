/*
    Keep generic methods in interface/ parent class
*/

interface Vehicle {
    bool hasEngine();
}

class Cycle extends Vehicle {
    @Override
    public bool hasEngine() {
        return false;
    }
}

class Car extends Vehicle {
    @Override
    public bool hasEngine() {
        return true;
    }
}
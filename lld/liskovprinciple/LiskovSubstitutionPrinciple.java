/*
    Keep generic methods in interface/ parent class
*/

interface Vehicle {
    boolean hasEngine();
}

class Cycle implements Vehicle {
    @Override
    public boolean hasEngine() {
        return false;
    }
}

class Car implements Vehicle {
    @Override
    public boolean hasEngine() {
        return true;
    }
}
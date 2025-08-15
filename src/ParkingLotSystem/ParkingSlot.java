package ParkingLotSystem;

public class ParkingSlot {
    int slotId;
    boolean occupiedStatus;
    Vehicle vehicle;

    ParkingSlot(int slotId, boolean occupiedStatus){
        this.slotId = slotId;
        this.occupiedStatus = occupiedStatus;
    }

    boolean isOccupiedStatus(){
        return occupiedStatus;
    }

    void assignVehicle(Vehicle v){
        this.vehicle = v;
        this.occupiedStatus = true;
    }

    void removeVehicle(){
        this.vehicle = null;
        this.occupiedStatus = false;
    }
}

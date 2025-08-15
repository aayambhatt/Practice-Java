package ParkingLotSystem;

import java.util.ArrayList;

public class ParkingLot {
    ArrayList<ParkingSlot> slots;

    ParkingLot(int totaSlots){
        slots = new ArrayList<>();

        for(int i = 1 ; i<=totaSlots ; i++){
            slots.add(new ParkingSlot(i, false));
        }

    }

    void parkVehicle(Vehicle vehicle){

        for(ParkingSlot slot : slots){
            if(!slot.occupiedStatus){
                slot.assignVehicle(vehicle);
                System.out.println("Vehicle is parked in slot: " + slot.slotId);
                return;
            }
        }
    }

    void unparkVehicle(int slotId) {
        for (ParkingSlot slot : slots) {
            if (slot.slotId == slotId) {
                if (slot.occupiedStatus) {
                    slot.removeVehicle();
                    System.out.println("Vehicle removed from slot: " + slot.slotId);
                } else {
                    System.out.println("Slot " + slot.slotId + " is already empty");
                }
                return; // Exit after handling this slot
            }
        }
        System.out.println("Slot id not found");
    }

}

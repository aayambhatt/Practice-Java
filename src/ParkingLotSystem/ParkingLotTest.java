package ParkingLotSystem;

public class ParkingLotTest {
    public static void main(String[] args) {
        // 1. Create a ParkingLot with 3 slots
        ParkingLot lot = new ParkingLot(3);

        // 2. Create Vehicle objects
        Vehicle v1 = new Vehicle("KA01AB1234");
        Vehicle v2 = new Vehicle("KA02CD5678");
        Vehicle v3 = new Vehicle("KA03EF9999");
        Vehicle v4 = new Vehicle("KA04GH4321"); // Extra car to test full lot

        // 3. Park vehicles
        lot.parkVehicle(v1); // should park in slot 1
        lot.parkVehicle(v2); // should park in slot 2
        lot.parkVehicle(v3); // should park in slot 3
        lot.parkVehicle(v4); // should say "No slots available"

        // 4. Unpark a vehicle
        lot.unparkVehicle(2); // should remove vehicle from slot 2

        // 5. Try unparking same slot again
        lot.unparkVehicle(2); // should say "Slot is already empty"

        // 6. Try unparking invalid slot
        lot.unparkVehicle(10); // should say "Slot id not found"


    }
}

package Collections;

import java.util.HashMap;

public class PetCounter {
    public static void main(String[] args) {
        // Step 1: Create a list of pets
        String[] petList = {"dog", "cat", "cat", "dog", "rabbit", "cat", "hamster"};

        // Step 2: Create a HashMap to store counts
        HashMap<String, Integer> petCount = new HashMap<>();

        // Step 3: Loop through the list
        for (String pet : petList) {
            if (petCount.containsKey(pet)) {
                // If already counted, add 1
                petCount.put(pet, petCount.get(pet) + 1);
            } else {
                // First time seeing this pet
                petCount.put(pet, 1);
            }
        }

        // Step 4: Print result
        System.out.println(petCount);
    }
}

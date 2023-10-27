package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Define the product of all ages as 36 and create a HashSet to store age combinations.
        int product = 36;
        Set<AgeCombination> ageSet = new HashSet<>();

        // Generate all possible combinations of ages for three children.
        for (int age1 = 1; age1 <= product; age1++) {
            for (int age2 = age1; age2 <= product; age2++) {
                for (int age3 = age2; age3 <= product; age3++) {
                    // Check if the product of ages equals the product of ages.
                    if (age1 * age2 * age3 == product) {
                        AgeCombination ageCombination = new AgeCombination(age1, age2, age3);
                        ageSet.add(ageCombination);
                    }
                }
            }
        }

        // Iterate through all age combinations to find pairs with the same sum and one older child.
        for (AgeCombination ages1 : ageSet) {
            for (AgeCombination ages2 : ageSet) {
                if (!ages1.equals(ages2) && ages1.hasSameSum(ages2) && ages1.hasOneOlderChild()) {
                    // If conditions are met, print the age combination immediately.
                    System.out.println("Ages for children are: " + ages1);
                }
            }
        }
    }
}
package org.example;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class AgeCombination {

    public final int age1;
    public final int age2;
    public final int age3;
    public final int sum;

    public AgeCombination(int age1, int age2, int age3) {
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
        this.sum = age1 + age2 + age3;
    }

    public boolean hasSameSum(AgeCombination other) {
        return this.sum == other.sum;
    }

    public boolean hasOneOlderChild() {
        List<Integer> ages = Stream.of(age1, age2, age3).sorted().toList();

        return !ages.get(2).equals(ages.get(1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgeCombination that)) return false;
        return age1 == that.age1 && age2 == that.age2 && age3 == that.age3 && sum == that.sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age1, age2, age3, sum);
    }

    @Override
    public String toString() {
        return age1 + ", " + age2 + ", " + age3;
    }

}


package homework_solution.lesson12.task1;

import homework_solution.lesson12.task1.model.Generatable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class House implements Generatable {
    List<Flat> flats = new ArrayList<>();

    @Override
    public House generate() {
        for (int i = 0; i < 3; i++) {
            flats.add(new Flat().generate());
        }
        return this;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(flats, house.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flats);
    }
}

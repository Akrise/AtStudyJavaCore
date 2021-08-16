package homework_solution.lesson12.task1;

import homework_solution.lesson12.task1.model.Generatable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flat implements Generatable {
    private List<Room> rooms = new ArrayList<>();

    @Override
    public Flat generate() {
        rooms.add(new Room().generate());
        rooms.add(new Room().generate());
        return this;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return Objects.equals(rooms, flat.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms);
    }
}

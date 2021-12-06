package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person, LocalTime time) {
        if (person.getTicket().entryTime().isAfter(time)) {
            throw new IllegalArgumentException("Invalid entry time!");
        } else {
            persons.add(person);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}

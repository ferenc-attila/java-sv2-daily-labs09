package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime) {
        if (actualTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("Invalid entry time!");
        } else {
            persons.add(person);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}

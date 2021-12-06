package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();
    Person personOne = new Person(new Ticket("GNR", LocalDateTime.parse("2021-06-15T21:00"), 12_000));
    Person personTwo = new Person(new FrontOfStageTicket("GNR", LocalDateTime.parse("2021-06-15T21:00"), 15_000, "asfjd"));

    @Test
    void addPersonValidTimeTest() {
        concert.addPerson(personOne, LocalTime.parse("20:01"));
        concert.addPerson(personTwo, LocalTime.parse("19:01"));
        assertEquals(2, concert.getPersons().size());
    }

    @Test
    void addPersonInvalidTimeTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> concert.addPerson(personOne, LocalTime.parse("19:59")));
        assertEquals("Invalid entry time!", iae.getMessage());
    }
}
package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void initTest() {
        Person personOne = new Person(new Ticket("GNR", LocalDateTime.parse("2020-05-14T15:30"), 15_000));
        Person personTwo = new Person(new FrontOfStageTicket("GNR", LocalDateTime.parse("2020-05-14T15:30"), 20_000, "kjdfshkjs"));
        assertEquals("GNR", personOne.getTicket().getNameOfBand());
        assertEquals("kjdfshkjs", ((FrontOfStageTicket) personTwo.getTicket()).getExtraCode());
    }
}
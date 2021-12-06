package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    @Test
    void initTest() {
        Ticket ticket = new Ticket("GNR", LocalDateTime.parse("2021-05-08T21:00"), 18_000);

        assertEquals("GNR", ticket.getNameOfBand());
        assertEquals(LocalDateTime.of(2021, 5, 8, 21, 0), ticket.getStartTime());
        assertEquals(18_000, ticket.getPrice());
        assertEquals(LocalTime.parse("20:00"), ticket.entryTime());
    }
}
package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrontOfStageTicketTest {

    @Test
    void initTest() {
        FrontOfStageTicket ticket = new FrontOfStageTicket("GNR", LocalDateTime.parse("2021-05-08T21:00"), 18_000, "kljhsackjh");
        Ticket anotherTicket = new FrontOfStageTicket("GNR", LocalDateTime.parse("2021-05-18T21:00"), 18_000, "lksdfjg");

        assertEquals("GNR", ticket.getNameOfBand());
        assertEquals(LocalDateTime.of(2021, 5, 8, 21, 0), ticket.getStartTime());
        assertEquals(18_000, anotherTicket.getPrice());
        assertEquals("lksdfjg", ((FrontOfStageTicket) anotherTicket).getExtraCode());
        assertEquals(LocalTime.parse("19:00"), ticket.entryTime());
        assertEquals(LocalTime.parse("19:00"), anotherTicket.entryTime());
    }
}
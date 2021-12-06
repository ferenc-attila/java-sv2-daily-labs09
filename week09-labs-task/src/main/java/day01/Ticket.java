package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String nameOfBand;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String nameOfBand, LocalDateTime startTime, int price) {
        this.nameOfBand = nameOfBand;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.minusHours(1).toLocalTime();
    }

    public String getNameOfBand() {
        return nameOfBand;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}

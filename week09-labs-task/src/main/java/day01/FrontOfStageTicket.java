package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {

    private String nameOfBand;
    private LocalDateTime startTime;
    private int price;
    private String extraCode;

    public FrontOfStageTicket(String nameOfBand, LocalDateTime startTime, int price, String extraCode) {
        super(nameOfBand, startTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
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

    public String getExtraCode() {
        return extraCode;
    }
}

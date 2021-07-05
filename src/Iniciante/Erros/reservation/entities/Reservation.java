package Iniciante.Erros.reservation.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checin;
    private Date checkout;

    private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(int roomNumber, Date checin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checin = checin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChecin() {
        return checin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long duration=checkout.getTime()-checin.getTime();
        return TimeUnit.DAYS.convert(duration,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checin, Date checkout){
        this.checin=checin;
        this.checkout=checkout;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation:");
        sb.append(" roomNumber: ").append(roomNumber);
        sb.append(", check-in: ").append(sdf.format(checin));
        sb.append(", check-out: ").append(sdf.format(checkout));
        sb.append(" "+duration()).append(" nights");
        return sb.toString();
    }
}

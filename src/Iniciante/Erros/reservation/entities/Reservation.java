package Iniciante.Erros.reservation.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getcheckIn() {
        return checkIn;
    }

    public Date getcheckOut() {
        return checkOut;
    }

    public long duration(){
        long duration=checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(duration,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut){
//        Date now= new Date();
//        if (checkIn.before(now) || checkOut.before(now)){
//            System.out.println("Error in reservation: Check-out date must be after check-in date");
//        }
        this.checkIn=checkIn;
        this.checkOut=checkOut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation:");
        sb.append(" roomNumber: ").append(roomNumber);
        sb.append(", check-in: ").append(sdf.format(checkIn));
        sb.append(", check-out: ").append(sdf.format(checkOut));
        sb.append(" "+duration()).append(" nights");
        return sb.toString();
    }
}

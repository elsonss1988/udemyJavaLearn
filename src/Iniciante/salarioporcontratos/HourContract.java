package Iniciante.salarioporcontratos;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer Hours;


    public HourContract() {
    }


    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        Hours = hours;
    }


    public Double totalValue(){
        return 0.0;
    }
}

package Iniciante.logs.entities;

import java.util.Date;
import java.util.Objects;

public class Logs {
    private String name;
    private Date moment;

    public Logs(){}

    public Logs(String name, Date moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logs logs = (Logs) o;
        return Objects.equals(name, logs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

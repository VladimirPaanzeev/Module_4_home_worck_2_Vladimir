package com.palanzeev.module_4_home_worck_2_vladimir;

import java.io.Serializable;

public class Ticket implements Serializable {
    private int id;
    private String departurePoint, departureDate, arrivalPoint, arrivalDate;
    private Float coastTicket;

    public Ticket(int id, String departurePoint, String departureDate,
                  String arrivalPoint, String arrivalDate, Float coastTicket) {
        this.id = id;
        this.departurePoint = departurePoint;
        this.departureDate = departureDate;
        this.arrivalPoint = arrivalPoint;
        this.arrivalDate = arrivalDate;
        this.coastTicket = coastTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Float getCoastTicket() {
        return coastTicket;
    }

    public void setCoastTicket(Float coastTicket) {
        this.coastTicket = coastTicket;
    }

    @Override
    public String toString() {
        return "Железнодорожный билет\n" +
                "Пассажир  " + id + "\n"+
                "Место отправления: '" + departurePoint  +"\n"+
                "Дата и время отправления: " + departureDate  + "\n"+
                "Место прибытия: " + arrivalPoint  + "\n"+
                "Дата и время прибытия: " + arrivalDate +  "\n"+
                "Стоимость билета = " + coastTicket + " монет";
    }
}


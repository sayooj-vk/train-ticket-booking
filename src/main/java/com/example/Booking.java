package com.example.trainticketbooking;

public class Booking {

    private String passengerName;
    private int age;
    private String contact;

    private int trainNumber;
    private String trainName;

    private String source;
    private String destination;

    private String departureTime;
    private String arrivalTime;

    private int seatNumber;
    private String status;


    public Booking(
            String passengerName,
            int age,
            String contact,
            int trainNumber,
            String trainName,
            String source,
            String destination,
            String departureTime,
            String arrivalTime,
            int seatNumber,
            String status) {

        this.passengerName = passengerName;
        this.age = age;
        this.contact = contact;

        this.trainNumber = trainNumber;
        this.trainName = trainName;

        this.source = source;
        this.destination = destination;

        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

        this.seatNumber = seatNumber;
        this.status = status;
    }


    public String getPassengerName() {
        return passengerName;
    }


    public int getAge() {
        return age;
    }


    public String getContact() {
        return contact;
    }


    public int getTrainNumber() {
        return trainNumber;
    }


    public String getTrainName() {
        return trainName;
    }


    public String getSource() {
        return source;
    }


    public String getDestination() {
        return destination;
    }


    public String getDepartureTime() {
        return departureTime;
    }


    public String getArrivalTime() {
        return arrivalTime;
    }


    public int getSeatNumber() {
        return seatNumber;
    }


    public String getStatus() {
        return status;
    }


    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
package com.example.trainticketbooking;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private int number;
    private String name;
    private String source;
    private String destination;
    private int availableSeats;

    private String departureTime;
    private String arrivalTime;

    private List<String> stations = new ArrayList<>();


    public Train(
            int number,
            String name,
            String source,
            String destination,
            int availableSeats,
            String departureTime,
            String arrivalTime) {

        this.number = number;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;

        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }


    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }


    public String getSource() {
        return source;
    }


    public String getDestination() {
        return destination;
    }


    public int getAvailableSeats() {
        return availableSeats;
    }


    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }


    public String getDepartureTime() {
        return departureTime;
    }


    public String getArrivalTime() {
        return arrivalTime;
    }


    public List<String> getStations() {
        return stations;
    }


    public void addStation(String station) {
        stations.add(station);
    }
}
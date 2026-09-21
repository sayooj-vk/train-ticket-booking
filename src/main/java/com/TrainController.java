package com.example.trainticketbooking;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/trains")
@CrossOrigin
public class TrainController {

    private List<Train> trains = new ArrayList<>();

    private List<Booking> bookings = new ArrayList<>();

    private Map<Integer, Set<Integer>> bookedSeats =
            new HashMap<>();

    private Map<Integer, Queue<Booking>> waitingLists =
            new HashMap<>();


    // =========================================================
    // CONSTRUCTOR
    // =========================================================

    public TrainController() {

        List<String> forwardRoute = Arrays.asList(
                "Kasaragod",
                "Kannur",
                "Kozhikode",
                "Tirur",
                "Palakkad",
                "Thrissur",
                "Kochi",
                "Kottayam",
                "Alappuzha",
                "Chengannur",
                "Kollam",
                "Thiruvananthapuram"
        );


        List<String> reverseRoute = Arrays.asList(
                "Thiruvananthapuram",
                "Kollam",
                "Chengannur",
                "Alappuzha",
                "Kottayam",
                "Kochi",
                "Thrissur",
                "Palakkad",
                "Tirur",
                "Kozhikode",
                "Kannur",
                "Kasaragod"
        );


        // =====================================================
        // FORWARD TRAINS
        // =====================================================

        addTrain(
                101,
                "Kerala Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "05:00 AM",
                "06:00 PM",
                forwardRoute
        );

        addTrain(
                102,
                "Malabar Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "06:00 AM",
                "07:00 PM",
                forwardRoute
        );

        addTrain(
                103,
                "Coastal Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "07:00 AM",
                "08:00 PM",
                forwardRoute
        );

        addTrain(
                104,
                "North Kerala Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "08:00 AM",
                "09:00 PM",
                forwardRoute
        );

        addTrain(
                105,
                "Malabar Superfast",
                "Kasaragod",
                "Thiruvananthapuram",
                "09:00 AM",
                "10:00 PM",
                forwardRoute
        );

        addTrain(
                106,
                "Kerala Superfast",
                "Kasaragod",
                "Thiruvananthapuram",
                "10:00 AM",
                "11:00 PM",
                forwardRoute
        );

        addTrain(
                107,
                "South Kerala Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "11:00 AM",
                "12:00 PM",
                forwardRoute
        );

        addTrain(
                108,
                "Kerala Coastal Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "12:00 PM",
                "01:00 PM",
                forwardRoute
        );

        addTrain(
                109,
                "Kerala South Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "01:00 PM",
                "02:00 PM",
                forwardRoute
        );

        addTrain(
                110,
                "Malabar South Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "02:00 PM",
                "03:00 PM",
                forwardRoute
        );

        addTrain(
                111,
                "Kerala Day Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "03:00 PM",
                "04:00 PM",
                forwardRoute
        );

        addTrain(
                112,
                "Kerala Morning Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "04:00 PM",
                "05:00 PM",
                forwardRoute
        );

        addTrain(
                113,
                "Kerala Star Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "05:00 PM",
                "06:00 PM",
                forwardRoute
        );

        addTrain(
                114,
                "Kerala Night Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "06:00 PM",
                "07:00 PM",
                forwardRoute
        );

        addTrain(
                115,
                "Kerala Grand Express",
                "Kasaragod",
                "Thiruvananthapuram",
                "07:00 PM",
                "08:00 PM",
                forwardRoute
        );


        // =====================================================
        // REVERSE TRAINS
        // =====================================================

        addTrain(
                116,
                "Thiruvananthapuram Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "05:00 AM",
                "06:00 PM",
                reverseRoute
        );

        addTrain(
                117,
                "South North Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "06:00 AM",
                "07:00 PM",
                reverseRoute
        );

        addTrain(
                118,
                "Kerala North Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "07:00 AM",
                "08:00 PM",
                reverseRoute
        );

        addTrain(
                119,
                "Southern Malabar Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "08:00 AM",
                "09:00 PM",
                reverseRoute
        );

        addTrain(
                120,
                "Backwater Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "09:00 AM",
                "10:00 PM",
                reverseRoute
        );

        addTrain(
                121,
                "Travancore Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "10:00 AM",
                "11:00 PM",
                reverseRoute
        );

        addTrain(
                122,
                "Kerala Reverse Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "11:00 AM",
                "12:00 PM",
                reverseRoute
        );

        addTrain(
                123,
                "Coastal North Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "12:00 PM",
                "01:00 PM",
                reverseRoute
        );

        addTrain(
                124,
                "Malabar Return Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "01:00 PM",
                "02:00 PM",
                reverseRoute
        );

        addTrain(
                125,
                "North Kerala Return Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "02:00 PM",
                "03:00 PM",
                reverseRoute
        );

        addTrain(
                126,
                "Kerala Return Express",
                "Thiruvananthapuram",
                "Kasaragod",
                "03:00 PM",
                "04:00 PM",
                reverseRoute
        );

        addTrain(
                127,
                "Malabar Return Superfast",
                "Thiruvananthapuram",
                "Kasaragod",
                "04:00 PM",
                "05:00 PM",
                reverseRoute
        );

        addTrain(
                128,
                "South North Superfast",
                "Thiruvananthapuram",
                "Kasaragod",
                "05:00 PM",
                "06:00 PM",
                reverseRoute
        );

        addTrain(
                129,
                "Kerala North Superfast",
                "Thiruvananthapuram",
                "Kasaragod",
                "06:00 PM",
                "07:00 PM",
                reverseRoute
        );

        addTrain(
                130,
                "Kerala Grand Return",
                "Thiruvananthapuram",
                "Kasaragod",
                "07:00 PM",
                "08:00 PM",
                reverseRoute
        );


        // =====================================================
        // TRAIN 101 SPECIAL SEAT SETUP
        // =====================================================

        trains.get(0).setAvailableSeats(2);

        for (int i = 3; i <= 20; i++) {

            bookedSeats.get(101).add(i);
        }
    }


    // =========================================================
    // ADD TRAIN
    // =========================================================

    private void addTrain(
            int number,
            String name,
            String source,
            String destination,
            String departureTime,
            String arrivalTime,
            List<String> stations) {

        Train train = new Train(
                number,
                name,
                source,
                destination,
                20,
                departureTime,
                arrivalTime
        );


        for (String station : stations) {

            train.addStation(station);
        }


        trains.add(train);


        bookedSeats.put(
                number,
                new HashSet<>()
        );


        waitingLists.put(
                number,
                new LinkedList<>()
        );
    }


    // =========================================================
    // GET ALL TRAINS
    // =========================================================

    @GetMapping
    public List<Train> getAllTrains() {

        return trains;
    }


    // =========================================================
    // SEARCH TRAINS
    // =========================================================

    @GetMapping("/search")
    public List<Train> searchTrains(
            @RequestParam String source,
            @RequestParam String destination) {

        List<Train> result =
                new ArrayList<>();


        for (Train train : trains) {

            List<String> stations =
                    train.getStations();


            int sourceIndex = -1;

            int destinationIndex = -1;


            for (int i = 0;
                 i < stations.size();
                 i++) {

                if (stations.get(i)
                        .equalsIgnoreCase(source)) {

                    sourceIndex = i;
                }


                if (stations.get(i)
                        .equalsIgnoreCase(destination)) {

                    destinationIndex = i;
                }
            }


            if (sourceIndex != -1
                    && destinationIndex != -1
                    && sourceIndex < destinationIndex) {

                result.add(train);
            }
        }


        return result;
    }


    // =========================================================
    // GET BOOKED SEATS
    // =========================================================

    @GetMapping("/seats")
    public List<Integer> getBookedSeats(
            @RequestParam int trainNumber) {

        Set<Integer> seats =
                bookedSeats.get(trainNumber);


        if (seats == null) {

            return new ArrayList<>();
        }


        return new ArrayList<>(seats);
    }


    // =========================================================
    // BOOK TICKET
    // =========================================================

    @PostMapping("/book")
    public String bookTicket(
            @RequestParam String trainName,
            @RequestParam String passengerName,
            @RequestParam int age,
            @RequestParam String contact,
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam int seatNumber) {


        Train selectedTrain = null;


        // Find train
        for (Train train : trains) {

            if (train.getName()
                    .equalsIgnoreCase(trainName)) {

                selectedTrain = train;

                break;
            }
        }


        if (selectedTrain == null) {

            return "Train not found.";
        }


        // Check route
        List<String> stations =
                selectedTrain.getStations();


        int sourceIndex = -1;

        int destinationIndex = -1;


        for (int i = 0;
             i < stations.size();
             i++) {

            if (stations.get(i)
                    .equalsIgnoreCase(source)) {

                sourceIndex = i;
            }


            if (stations.get(i)
                    .equalsIgnoreCase(destination)) {

                destinationIndex = i;
            }
        }


        if (sourceIndex == -1
                || destinationIndex == -1
                || sourceIndex >= destinationIndex) {

            return "Invalid route for this train.";
        }


        // =====================================================
        // WAITING LIST
        // =====================================================

        if (selectedTrain.getAvailableSeats() <= 0) {

            Booking waitingBooking =
                    new Booking(
                            passengerName,
                            age,
                            contact,
                            selectedTrain.getNumber(),
                            selectedTrain.getName(),
                            source,
                            destination,
                            selectedTrain.getDepartureTime(),
                            selectedTrain.getArrivalTime(),
                            0,
                            "WAITING"
                    );


            Queue<Booking> queue =
                    waitingLists.get(
                            selectedTrain.getNumber()
                    );


            queue.add(waitingBooking);


            bookings.add(waitingBooking);


            return "No seats available. Passenger added to waiting list.";
        }


        // =====================================================
        // NORMAL BOOKING
        // =====================================================

        if (seatNumber < 1
                || seatNumber > 20) {

            return "Please select a valid seat.";
        }


        Set<Integer> seats =
                bookedSeats.get(
                        selectedTrain.getNumber()
                );


        if (seats.contains(seatNumber)) {

            return "Seat already booked. Please select another seat.";
        }


        seats.add(seatNumber);


        selectedTrain.setAvailableSeats(
                selectedTrain.getAvailableSeats() - 1
        );


        Booking booking =
                new Booking(
                        passengerName,
                        age,
                        contact,
                        selectedTrain.getNumber(),
                        selectedTrain.getName(),
                        source,
                        destination,
                        selectedTrain.getDepartureTime(),
                        selectedTrain.getArrivalTime(),
                        seatNumber,
                        "CONFIRMED"
                );


        bookings.add(booking);


        return "Ticket booked successfully.";
    }


    // =========================================================
    // CANCEL TICKET
    // =========================================================

    @PostMapping("/cancel")
    public String cancelTicket(
            @RequestParam int trainNumber,
            @RequestParam String passengerName) {


        Booking cancelledBooking = null;


        for (Booking booking : bookings) {

            if (booking.getTrainNumber()
                    == trainNumber

                    && booking.getPassengerName()
                    .equalsIgnoreCase(passengerName)

                    && booking.getStatus()
                    .equals("CONFIRMED")) {

                cancelledBooking = booking;

                break;
            }
        }


        if (cancelledBooking == null) {

            return "Confirmed ticket not found.";
        }


        cancelledBooking.setStatus(
                "CANCELLED"
        );


        int cancelledSeat =
                cancelledBooking.getSeatNumber();


        Set<Integer> seats =
                bookedSeats.get(trainNumber);


        seats.remove(cancelledSeat);


        Queue<Booking> queue =
                waitingLists.get(trainNumber);


        // =====================================================
        // MOVE WAITING PASSENGER TO CONFIRMED
        // =====================================================

        if (queue != null
                && !queue.isEmpty()) {

            Booking waitingBooking =
                    queue.poll();


            waitingBooking.setSeatNumber(
                    cancelledSeat
            );


            waitingBooking.setStatus(
                    "CONFIRMED"
            );


            seats.add(cancelledSeat);


            return "Ticket cancelled successfully. Waiting passenger moved to CONFIRMED.";
        }


        // No waiting passenger
        Train train = null;


        for (Train t : trains) {

            if (t.getNumber()
                    == trainNumber) {

                train = t;

                break;
            }
        }


        if (train != null) {

            train.setAvailableSeats(
                    train.getAvailableSeats() + 1
            );
        }


        return "Ticket cancelled successfully.";
    }


    // =========================================================
    // VIEW ALL BOOKINGS
    // =========================================================

    @GetMapping("/bookings")
    public List<Booking> getBookings() {

        return bookings;
    }


    // =========================================================
    // CLEAR BOOKINGS
    // =========================================================

    @GetMapping("/clearBookings")
    public String clearBookings() {

        // Clear all booking records
        bookings.clear();


        // Reset all trains
        for (Train train : trains) {

            bookedSeats
                    .get(train.getNumber())
                    .clear();


            waitingLists
                    .get(train.getNumber())
                    .clear();


            train.setAvailableSeats(20);
        }


        // Keep Kerala Express (101)
        // with only 2 available seats
        trains.get(0).setAvailableSeats(2);


        // Seats 3 to 20 remain unavailable
        for (int i = 3; i <= 20; i++) {

            bookedSeats
                    .get(101)
                    .add(i);
        }


        return "Bookings cleared.";
    }

}
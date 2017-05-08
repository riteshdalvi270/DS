package ticketfly;

import java.util.*;

/**
 * Seat pick Algorithm
 * Created by ritesh on 5/1/17.
 */
public class SeatPickAlgorithm {

    public static void main(String args[]) {

        final Scanner scanner = new Scanner(System.in);

        String seatNumber = scanner.next();

        final Map<String,List<Seat>> seats = new HashMap<>();

        populateSeats(seats);

        seatPickAlgorithm(seats,seatNumber);

        getAvailableTickets(seats);
    }

    private static void populateSeats(final Map<String,List<Seat>> seats) {

        for(int i = 65; i<=90; i++) {

            final List<Seat> seatNumber = new ArrayList<>();

            for(int j=1;j<=10;j++) {

                seatNumber.add(new Seat(j,false));
            }

            seats.put(String.valueOf((char) i),seatNumber);
        }
    }

    private static List<String> getAvailableTickets(final Map<String,List<Seat>> seats) {

        final List<String> availableTickets = new ArrayList<>();

        for(Map.Entry<String,List<Seat>> entrySet : seats.entrySet()) {

            String letter = entrySet.getKey();
            List<Seat> seatNumber = entrySet.getValue();

            for(final Seat seat : seatNumber) {

                if(!seat.taken) {
                    final String available = letter + ":" + seat.number;

                    availableTickets.add(available);
                }
            }
        }

        return availableTickets;
    }

    private static void seatPickAlgorithm(final Map<String,List<Seat>> seats, String seatNumber) {

        String seat[] = seatNumber.split(":");

        String letter = seat[0];
        String number = seat[1];

        final List<Seat> values = seats.get(letter);

        for(Seat st :  values) {

            if(String.valueOf(st.number) == number) {

                if(!st.taken) {
                    st.taken = true;
                }else {
                    System.out.println("Already booked");
                }

                break;
            }
        }
    }

    static class Seat {
        int number;
        boolean taken;

        Seat(final int number, final boolean taken) {
            this.number = number;
            this.taken = taken;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public boolean isTaken() {
            return taken;
        }

        public void setTaken(boolean taken) {
            this.taken = taken;
        }
    }
}

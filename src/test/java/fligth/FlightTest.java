package fligth;

import es.ull.flights.Flight;
import es.ull.passengers.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    private Flight vuelo = new Flight( "NT3333" ,72);

    private Passenger pasajero1 = new Passenger("111111O", "Lucas", "ES");
    private Passenger pasajero2 = new Passenger("222222Y", "Erik", "GB");
    private Passenger pasajero3 = new Passenger("333333R", "Lidia", "US");



    @Test
    void testgetFlightNumber() {
        assertEquals(vuelo.getFlightNumber(), "NT3333");
    }

}
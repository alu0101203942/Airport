package passengers;

import es.ull.flights.Flight;
import es.ull.passengers.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    private Flight vuelo = new Flight( "NT3333" ,72);

    private Passenger pasajero1 = new Passenger("111111O", "Lucas", "ES");
    private Passenger pasajero2 = new Passenger("222222Y", "Erik", "GB");
    private Passenger pasajero3 = new Passenger("333333R", "Lidia", "US");
    private Passenger pasajero4 = new Passenger("444444X", "Lidia", "US");

    @Test
    void testgetIdentifier() {
        assertEquals(pasajero1.getIdentifier(), "111111O");
    }

    @Test
    void testgetName() {
        assertEquals(pasajero2.getName(), "Erik");
    }

    @Test
    void testgetCountryCode() {
        assertEquals(pasajero3.getCountryCode(), "US");
    }

}
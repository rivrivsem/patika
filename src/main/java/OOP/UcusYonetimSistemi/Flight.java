package OOP.UcusYonetimSistemi;

import java.util.Date;

public class Flight {
    private int id;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    private Pilot pilot;
    private Pilot coPilot;

    public Flight(int id, Airport departureAirport, Airport arrivalAirport, Date departureTime, Date arrivalTime, Pilot pilot, Pilot coPilot) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.pilot = pilot;
        this.coPilot = coPilot;
    }
}

package OOP.UcusYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Airline {
        private int id;
        private String name;
        private List<Aircraft> aircrafts;
        private List<Flight> flights;

        public Airline(int id, String name) {
            this.id = id;
            this.name = name;
            this.aircrafts = new ArrayList<Aircraft>();
            this.flights = new ArrayList<Flight>();
        }

    }



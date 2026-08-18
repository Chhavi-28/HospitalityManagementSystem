/*package gui;
import dao.HotelDAO;
import entity.Hotel;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.setHotelName("Taj Hotel");
        hotel.setLocation("Mumbai");
        hotel.setAmenities("WiFi, Pool, Gym");

        HotelDAO dao = new HotelDAO();
        dao.addHotel(hotel);
        dao.viewHotels();
        dao.updateHotel(1, "Delhi");
        dao.deleteHotel(1);
    }
}
package gui;

import dao.RoomDAO;
import entity.Room;

public class Main {

    public static void main(String[] args) {

        Room room = new Room();

        room.setHotelId(2);      // Hotel table me existing ID
        room.setRoomNumber("101");
        room.setRoomType("Deluxe");
        room.setPrice(3500);
        room.setStatus("Available");

        RoomDAO dao = new RoomDAO();
        dao.addRoom(room);

        RoomDAO dao = new RoomDAO();
        dao.viewRooms();
        dao.updateRoom(2, "Booked");
        dao.deleteRoom(2);
    }
}*/
/*package gui;

import dao.GuestDAO;
import entity.Guest;

public class Main {

    public static void main(String[] args) {

        /*Guest guest = new Guest();

        guest.setGuestName("Chhavi");
        guest.setEmail("chhavi@gmail.com");
        guest.setPhone("9876543210");

        GuestDAO dao = new GuestDAO();
        //dao.addGuest(guest);
        dao.viewGuests();

    }
}**/
package gui;

import java.sql.Date;

import dao.ReservationDAO;
import entity.Reservation;

public class Main {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        reservation.setGuestId(1);   
        reservation.setRoomId(3);    

        reservation.setCheckIn(Date.valueOf("2026-08-10"));
        reservation.setCheckOut(Date.valueOf("2026-08-15"));

        ReservationDAO dao = new ReservationDAO();
        dao.addReservation(reservation);
    }
}
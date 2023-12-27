package MyObjects;

import java.io.Serializable;

public class Customer implements Serializable {

    String name;
    String surname;
    String id;
    String roomID;
    String checkIn;
    String checkOut;

    public Customer() {
        this.name = null;
        this.surname = null;
        this.id = null;
        this.roomID = null;
        this.checkIn = null;
        this.checkOut = null;
    }

    public Customer(String name, String surname, String id, String roomID, String checkIn, String checkOut) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.roomID = roomID;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

}
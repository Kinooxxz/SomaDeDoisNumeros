package Vetores.quartos.entities;

import java.util.Scanner;

public class Room {

    private String nameStudent;
    private String email;
    private int room;


     /////////////////////////////////////////

    public Room(String nameStudent, String email, int room) {
        this.nameStudent = nameStudent;
        this.email = email;
        this.room = room;
    }

    public Room() {
    }

    ///////////////////////////////////////////

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom(){
        return room;
    }

    public void setRoom(int room){
        this.room = room;
    }

    //////////////////////////////////////////

}

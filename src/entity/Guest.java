package entity;

public class Guest {

    private int guestId;
    private String guestName;
    private String email;
    private String phone;

    public Guest() {
    }

    public Guest(int guestId, String guestName, String email, String phone) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.email = email;
        this.phone = phone;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

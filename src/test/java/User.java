public class User {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String state;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        int stateCode = Math.toIntExact(phoneNumber / 10000000);
        if (stateCode == 917) {
            state = "NY";
            return state;
        } else {
            return state;
        }
    }
}

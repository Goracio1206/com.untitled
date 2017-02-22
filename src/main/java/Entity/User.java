package Entity;

/**
 * Created by Admin on 2/22/2017.
 */
public class User {
    private String fName;
    private String lName;
    private Address userAddress;
    private String password;
    private String eMail;
    private String role;

    public User() {
    }

    public User(String fName, String lName, Address userAddress, String password, String eMail, String role) {
        this.fName = fName;
        this.lName = lName;
        this.userAddress = userAddress;
        this.password = password;
        this.eMail = eMail;
        this.role = role;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

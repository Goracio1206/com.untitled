package Entity;

/**
 * Created by Admin on 3/21/2017.
 */
public class UserN {
    private int id;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;
    private String email;

    public UserN(){}
    public UserN(int id, String userName, String password, String email){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}

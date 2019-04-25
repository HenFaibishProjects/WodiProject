package Login;

import javax.persistence.*;

@Entity
@Table(name = "UserPassword")
public class UserPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String eMailAddress;
    private String password;

    public UserPassword(String loginname, String password) {
        this.eMailAddress = loginname;
        this.password = password;
    }

    public UserPassword() {

    }

    public int getId() {
        return id;
    }

    public String getEMailAddress() {
        return eMailAddress;
    }

    public void setEMailAddress(String loginname) {
        this.eMailAddress = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
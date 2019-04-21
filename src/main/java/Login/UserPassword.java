package Login;

import javax.persistence.*;

@Entity
@Table(name = "UserPassword")
public class UserPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String loginname;
    private String password;

    public UserPassword(String loginname, String password) {
        this.loginname = loginname;
        this.password = password;
    }

    public UserPassword() {

    }

    public int getId() {
        return id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
package hr;

import Login.UserPassword;

import javax.persistence.*;

@Entity
@Table(name = "user")
       public class UserWido {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userID")
        private int id;
        private String firstname;
        private String lastname;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "id")
        private UserPassword userPassword;
        private String gender;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "aid")
        private Address address;


        public UserWido(String firstname, String lastname, String gender, Address address, UserPassword userPassword ){
            this.firstname = firstname;
            this.lastname = lastname;
            this.gender = gender;
            this.address = address;
            this.userPassword =  userPassword;
        }


        public UserWido(){

        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }


        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public String getFirstname()
        {
            return firstname;
        }
        public void setFirstname(String firstname)
        {
            this.firstname = firstname;
        }
        public String getLastname()
        {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

    public UserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(UserPassword userPassword) {
        this.userPassword = userPassword;
    }
}



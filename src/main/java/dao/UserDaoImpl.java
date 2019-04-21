package dao;

import Connections.HibernateStructInfo;
import Login.UserPassword;
import hr.Address;
import hr.UserWido;

import java.sql.SQLException;

public class UserDaoImpl extends HibernateStructInfo implements UserDao {

    public  UserDaoImpl() {
    }

    @Override
    public void addUser(String loginname, String password,String firstname, String lastname, String gender, String address1, String address2, String city, int zipCode, String region, String country) {
        UserPassword userPassword = new UserPassword(loginname,password);
        Address address = new Address(address1,address2,city,zipCode,region,"Israel");
        UserWido user = new UserWido(firstname,lastname,gender,address,userPassword);
        beginTranscation();
        super.saveOrUpdate(user);
    }

    @Override
    public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void ModifyPasswordEmployee(String password) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void ModifyNameEmployee(String name) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void ModifyPhoneEmployee(String phone) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void ModifyEmailEmployee(String email) throws ClassNotFoundException, SQLException {

    }
}

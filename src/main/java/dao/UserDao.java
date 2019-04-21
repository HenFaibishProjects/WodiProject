package dao;

import java.sql.SQLException;


public interface UserDao {

        void addUser(String loginname, String password,String firstname, String lastname, String gender,
                  String address1, String address2, String city, int zipCode, String region, String country);

         void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException;

         void ModifyPasswordEmployee(String password) throws ClassNotFoundException, SQLException ;

         void ModifyNameEmployee(String name) throws ClassNotFoundException, SQLException ;

         void ModifyPhoneEmployee(String phone) throws ClassNotFoundException, SQLException;

         void ModifyEmailEmployee(String email) throws ClassNotFoundException, SQLException;










    }

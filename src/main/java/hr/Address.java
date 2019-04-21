package hr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "address")
public class Address  {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int aid;
    public String address1;
    public String address2;
    public String city;
    public int zipCode;
    public String region;
    public String country;

    public Address() {

    }



    public Address(String address1, String address2, String city, int zipCode, String region, String country) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zipCode = zipCode;
        this.region = region;
        this.country = country;
    }


    public int getAid() {
        return aid;
    }

    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }






}
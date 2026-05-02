package com.vittorio.ecommerce;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class User {
    private String          name;
    private String          surname;
    private Date            date;
    private Role            role;
    private List<String>    listPhone;
    private List<Address>   listSpedition;
    private List<Address>   listBilling;
    private List<Address>   listAddresses;

    public User(String name, String surname, Date date, Role role) {
        setName     (name);
        setSurname  (surname);
        setDate     (date);
        setRole     (role);
        this.listPhone      = new ArrayList<String>();
        this.listSpedition  = new ArrayList<Address>();
        this.listBilling    = new ArrayList<Address>();
        this.listAddresses  = new ArrayList<Address>();
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getDate() {
        return this.date;
    }

    public RoleType getRole() {
        return this.role.getRoleType();
    }

    public List<String> getListPhone() {
        return this.listPhone;
    }
    
    public List<Address> getListShipping() {
        return this.listSpedition;
    }
    
    public List<Address> getListBilling() {
        return this.listBilling;
    }
    
    public List<Address> getListAddresses() {
        return this.listAddresses;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // add
    public void addPhoneNumber(String number) {
        this.listPhone.add(number);
    }

    public void addAddress(Address address, AddressType addressType) {
        switch(addressType){
            case shipping:
                addAddressShipping(address);
                break;
            case billing:
                addAddressBilling(address);
                break;
            default:
                System.out.println("address not entered correctly...");
                break;
        }
    }
    
    protected void addAddressShipping(Address address) {
        this.listSpedition.add(address);
        this.listAddresses.add(address);
    }
    
    protected void addAddressBilling(Address address) {
        this.listBilling.add(address);
        this.listAddresses.add(address);
    }

    // remove
    public void removePhoneNumber(String number) {
        this.listPhone.remove(number);
    }

    public void removeAddress(Address address, AddressType addressType) {
        switch(addressType) {
            case shipping:
                removeAddressShipping(address);
                break;
            case billing:
                removeAddressBilling(address);
                break;
            default:
                System.out.println("address does not exist or address is not yours...");
                break;
        }
    }

    protected void removeAddressShipping(Address address) {
        this.listSpedition.remove(address);
        this.listAddresses.remove(address);
    }
    
    protected void removeAddressBilling(Address address) {
        this.listBilling.remove(address);
        this.listAddresses.remove(address);
    }
}

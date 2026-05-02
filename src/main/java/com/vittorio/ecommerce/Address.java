package com.vittorio.ecommerce;

public class Address {
    private String  via;
    private int     civic;
    private int     cap;
    private String  city;

    public Address(String via, int civic, int cap, String city) {
        setVia(via);
        setCivic(civic);
        setCap(cap);
        setCity(city);
    }

    // getter
    public String getVia() {
        return this.via;
    }
    
    public int getCivic() {
        return this.civic;
    }
    
    public int getCap() {
        return this.cap;
    }
    
    public String getCity() {
        return this.city;
    }

    // setter
    public void setVia(String via) {
        this.via = via;
    }
    
    public void setCivic(int civic) {
        this.civic = civic;
    }
    
    public void setCap(int cap) {
        this.cap = cap;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
}

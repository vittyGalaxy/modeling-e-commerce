package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AddressTest {
    // getter test
    @Test
    void getViaTest() {
        String via = "Via Roma";
        Address address = new Address(via, 300, 12345, "Vittoria");
        String resultActually = address.getVia();
        String resultExpected = via;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void getCivicTest() {
        int civic = 300;
        Address address = new Address("Via Roma", civic, 12345, "Vittoria");
        int resultActually = address.getCivic();
        int resultExpected = civic;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void getCapTest() {
        int cap = 12345;
        Address address = new Address("Via Roma", 300, cap, "Vittoria");
        int resultActually = address.getCap();
        int resultExpected = cap;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void getCityTest() {
        String city = "Vittoria";
        Address address = new Address("Via Roma", 300, 12345, city);
        String resultActually = address.getCity();
        String resultExpected = city;
        assertThat(resultActually).isEqualTo(resultExpected);
    }

    // setter test
    @Test
    void setViaTest() {
        String via = "Via Milano";
        Address address = new Address("Via Roma", 300, 12345, "Vittoria");
        address.setVia(via);
        String resultActually = address.getVia();
        String resultExpected = via;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void setCivicTest() {
        int civic = 500;
        Address address = new Address("Via Roma", 300, 12345, "Vittoria");
        address.setCivic(civic);
        int resultActually = address.getCivic();
        int resultExpected = civic;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void setCapTest() {
        int cap = 98765;
        Address address = new Address("Via Roma", 300, 12345, "Vittoria");
        address.setCap(cap);
        int resultActually = address.getCap();
        int resultExpected = cap;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
    
    @Test
    void setCityTest() {
        String city = "Comiso";
        Address address = new Address("Via Roma", 300, 12345, "Vittoria");
        address.setCity(city);
        String resultActually = address.getCity();
        String resultExpected = city;
        assertThat(resultActually).isEqualTo(resultExpected);
    }
}

package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ProductTest {
    @Test
    void userNameSurnameRoleCorrectly() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        Role r = new Role(RoleType.client);
        User u = new User("Vittorio", "Tiozzo", date, r);
        Product p = new Product("Computer", 199.99, u);
        assertThat(p.getName()).isEqualTo("Computer");
        assertThat(p.getPrice()).isEqualTo(199.99);
    }

    @Test
    void setterNameSurnameRoleTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        Product p = new Product("Computer", 199.99, new User("Vittorio", "Tiozzo", date, new Role(RoleType.client)));
        p.setName("Name");
        assertThat(p.getName()).isEqualTo("Name");
        p.setPrice(399.99);
        assertThat(p.getPrice()).isEqualTo(399.99);
    }
}

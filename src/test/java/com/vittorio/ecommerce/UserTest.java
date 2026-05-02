package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    @Test
    void userNameSurnameRoleCorrectly() {
        User u = new User("Vittorio", "Tiozzo", "01-05-2004",new Role(RoleType.client));
        assertThat(u.getName()).isEqualTo("Vittorio");
        assertThat(u.getSurname()).isEqualTo("Tiozzo");
        assertThat(u.getDate()).isEqualTo("01-05-2004");
        assertThat(u.getRole()).isEqualTo(RoleType.client);
    }

    @Test
    void setterNameSurnameRoleTest() {
        User u = new User("Vittorio", "Tiozzo", new Role(RoleType.client));
        u.setRole(new Role(RoleType.catalogManager));
        assertThat(u.getRole()).isEqualTo(RoleType.catalogManager);
        u.setName("Name");
        assertThat(u.getName()).isEqualTo("Name");
        u.setSurname("Surname");
        assertThat(u.getSurname()).isEqualTo("Surname");
        u.setDate("02-08-2005");
        assertThat(u.getDate()).isEqualTo("02-08-2005");
        List<String> lp = new List<String>();   
        lp.add("3333333333");
        lp.add("2222222222");
        u.setSurname(lp);
        assertThat(u.getSurname()).isEqualTo(u.getListPhone());
    }
}

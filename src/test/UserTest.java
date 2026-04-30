package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    @Test
    void userNameSurnameRoleCorrectly() {
        User u = new User("Vittorio", "Tiozzo", RoleType.client);
        assertThat(u.getName()).isEqualTo("Vittorio");
        assertThat(u.getSurname()).isEqualTo("Tiozzo");
        assertThat(u.getRoleType()).isEqualTo(RoleType.client);
    }

    @Test
    void setterNameSurnameRoleTest() {
        User u = new User("Vittorio", "Tiozzo", RoleType.client);
        u.setRoleType(RoleType.catalogManager);
        assertThat(u.getRoleType()).isEqualTo(RoleType.catalogManager);
        u.setName("Name");
        assertThat(u.getName()).isEqualTo("Name");
        u.setSurname("Surname");
        assertThat(u.getSurname()).isEqualTo("Surname");
    }
}

package com.vittorio.ecommerce;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RoleTest {
    @Test
    void roleAssignmentCorrectly() {
        Role r = new Role(RoleType.client);
        assertThat(r.getRoleType()).isEqualTo(RoleType.client);
    }

    @Test
    void setterRoleTest() {
        Role r = new Role(RoleType.client);
        r.setRoleType(RoleType.catalogManager);
        assertThat(r.getRoleType()).isEqualTo(RoleType.catalogManager);
    }
}

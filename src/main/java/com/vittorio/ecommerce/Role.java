package com.vittorio.ecommerce;

public class Role {
    private RoleType roleType;

    public Role (RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return this.roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
public class User {
    private String name;
    private String surname;
    private Role role;

    public User(String name, String surname, Role role){
        setName(name);
        setSurname(surname);
        setRole(role);
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Role getRole() {
        return this.Role;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

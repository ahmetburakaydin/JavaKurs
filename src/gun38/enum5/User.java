package gun38.enum5;

public class User {
    String name;
    Role role;
    Statu statu;

    public User() {
    }

    public User(String name,Role role,Statu statu) {
        this.name = name;
        this.role = role;
        this.statu = statu;

    }

    @Override
    public String toString() {
        return "name='" + name +
                ", statu=" + statu +
                ", role=" + role ;
    }
}

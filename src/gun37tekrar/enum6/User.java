package gun37tekrar.enum6;

public class User {
    Name name;

    public User(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                '}';
    }
}

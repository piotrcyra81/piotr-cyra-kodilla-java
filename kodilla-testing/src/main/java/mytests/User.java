package mytests;

public class User {

    private String name;
    private String sex;

    //konstruktor jawny, zawsze jest tworzony na podstawie nazwy klasy, a więc nazwa konstruktora jest taka jak klasy.

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

}
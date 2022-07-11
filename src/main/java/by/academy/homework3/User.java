package by.academy.homework3;

public class User {

    private String name;
    private double money;
    private String dateOfBirch;
    private String phone;
    private String email;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getDateOfBirch() {
        return dateOfBirch;
    }

    public void setDateOfBirch(String dateOfBirch) {
        this.dateOfBirch = dateOfBirch;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}

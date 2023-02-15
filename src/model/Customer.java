package atmApp.model;

public class Customer {
    private String name;
    private String iban;
    private String pinCode;
    private int money;

    public Customer(String name, String iban, String pinCode, int money) {
        this.name = name;
        this.iban = iban;
        this.pinCode = pinCode;
        this.money = money;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public String setIban(String iban) {
        return this.iban = iban;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

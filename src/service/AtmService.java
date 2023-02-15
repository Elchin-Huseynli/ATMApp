package atmApp.service;

import atmApp.model.Customer;
import static atmApp.util.InputUtil.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtmService {
    public static Map<String, Customer> dataLoad() {
        Map<String, Customer> data = new HashMap<>();
        for (Customer customer : customersLoad()) {
            data.put(customer.getIban(), customer);
        }

        return data;
    }

    public static List<Customer> customersLoad() {
        Customer customer = new Customer("Elchin", "AZ7828", "7828", 5605);
        Customer customer2 = new Customer("Nihat", "AZ3478", "2345", 5604);

        return List.of(customer, customer2);
    }

    public static int[] money() {
        int[] money = {500,200,100,50,20,10,5,1};
        return money;
    }

    public static void enterAtm() {
        Map<String, Customer> map = dataLoad();
        for (int i = 0; i < 3; i++) {
            String iban = inputTypeString("Enter the iban: ");
            String pinCode = inputTypeString("Enter the pin: ");

            Customer customer = map.get(iban);
            if (customer.getPinCode().equals(pinCode)) {
                System.out.println("\nWelcome, " + customer.getName() + "\nBalance: " + customer.getMoney());
                atmService(customer);
            }
            else {
                System.out.println("\nWrong!");
            }
        }
    }

    public static void atmService(Customer customer) {
        int enterMoney = inputTypeInt("Enter the money: ");
        int balance = customer.getMoney();
        if (enterMoney <= balance) {
            int newBalance = balance - enterMoney;
            while (enterMoney >= 1) {
                for (int i = 0; i < money().length; i++) {
                    int count = enterMoney / money()[i];
                    if (count >= 1) {
                        System.out.println("Money: " + money()[i] + " --> Count: " + count);
                        enterMoney -= count * money()[i];
                    }
                }
                System.out.println("\nThanks!");
            }
            customer.setMoney(newBalance);
        }
        else {
            System.out.println("\nWrong!");
        }
    }
}

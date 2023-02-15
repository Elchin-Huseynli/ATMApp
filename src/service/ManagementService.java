package atmApp.service;

import static atmApp.util.MenuUtil.*;
import static atmApp.service.AtmService.enterAtm;

public class ManagementService {
    public static void get() {
        while (true) {
            int option = entry();
            switch (option) {
                case 1:
                    enterAtm();
                    break;
                case 2:
                    System.exit(-1);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

package atmApp.service;

import atmApp.enums.ExceptionsEnum;
import atmApp.exceptions.InvalidOptionException;
import atmApp.exceptions.InvalidParameterException;
import atmApp.exceptions.NotFoundCustomerException;

import java.util.InputMismatchException;

import static atmApp.util.MenuUtil.*;
import static atmApp.service.AtmService.enterAtm;

public class ManagementService {
    public static void get() {
        while (true) {
            try {
                int option = entry();
                switch (option) {
                    case 1:
                        enterAtm();
                        break;
                    case 2:
                        System.exit(-1);
                    default:
                        throw new InvalidOptionException();
                }
            }
            catch (InvalidParameterException e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println(ExceptionsEnum.MUST_BE_INT_VALUE);
            }
            catch (NotFoundCustomerException e) {
                System.out.println(e.getMessage());
            }
            catch (NullPointerException e) {
                System.out.println(ExceptionsEnum.INVALID_PARAMETER);
            }
        }
    }
}

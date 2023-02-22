package atmApp.exceptions;

import atmApp.enums.ExceptionsEnum;

public class NotFoundCustomerException extends Exception {
    public NotFoundCustomerException() {
        super(ExceptionsEnum.NOT_FOUND_CUSTOMER.name());
    }
}

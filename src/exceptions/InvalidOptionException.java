package atmApp.exceptions;

import atmApp.enums.ExceptionsEnum;

public class InvalidOptionException extends Exception{
    public InvalidOptionException() {
        super(ExceptionsEnum.INVALID_OPTION.name());
    }
}

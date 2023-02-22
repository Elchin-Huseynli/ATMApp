package atmApp.exceptions;

import atmApp.enums.ExceptionsEnum;

public class InvalidParameterException extends Exception{
    public InvalidParameterException() {
        super(ExceptionsEnum.INVALID_PARAMETER.name());
    }
}

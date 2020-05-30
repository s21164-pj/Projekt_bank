import javax.validation.*;
import java.util.Set;

public class AccountNumberValidation {

    private final Validator validator;

    public AccountNumberValidation() {
        ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
        validator = validationFactory.getValidator();

    }

//    public void showSimpleValidation() {
//        Account account = new Account(1, 23, "Daniel", "sd", 3234, "asd", "123", "saed", "as", 1123, true);
//        Set<ConstraintViolation<Account>> validationErrors = validator.validate(account);
//        for (ConstraintViolation<Account> validationError : validationErrors) {
//            System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
//        }

    }
}




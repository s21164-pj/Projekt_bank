import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//z tą walidacją cośnie do końca wyszło

        Account account = new Account(1, 23, "Daniel", "sd", 3234, "asd", "123", "saed", "as", 1123, true);
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(account);


    }


}



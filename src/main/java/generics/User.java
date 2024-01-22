package generics;

import java.time.LocalDate;
import lombok.Data;
import lombok.Value;

@Data
public class User
{
	Long id;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	Boolean active;
}

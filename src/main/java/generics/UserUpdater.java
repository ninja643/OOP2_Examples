package generics;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserUpdater
{
	public void updateUser(User user, User updatedValues)
	{
		updateField(updatedValues.getId(), user::setId, v -> v > 0);
		updateField(updatedValues.getFirstName(), user::setFirstName, this::checkString);
		updateField(updatedValues.getActive(), user::setActive, v -> true);
	}

	private <T> void updateField(T updatedValue, Consumer<T> setter, Predicate<T> checker)
	{
		if (updatedValue != null && checker.test(updatedValue))
		{
			setter.accept(updatedValue);
		}
	}

	private boolean checkString(final String value)
	{
		String uppercaseValue = value.toUpperCase(Locale.ROOT);
		return uppercaseValue.contains("ABC");
	}
}

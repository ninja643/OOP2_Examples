package exceptions;

public class ComputationException extends Exception
{
	public ComputationException(final String message)
	{
		super(message);
	}

	public ComputationException(final String message, final Throwable cause)
	{
		super(message, cause);
	}
}

package demo;

public class NumberException extends Exception {
	
	String msg;
	
	public NumberException()
	{
		msg= "Number is less than or greater than 10";
	}

	
	public NumberException(String p)
	{
		msg=p;
	}
	
	
	public String tostring()
	{
		return msg;
	}
}
package net.roseindia;

public class Spring3HelloWorld 
{
	String message;
	public Spring3HelloWorld()
	{
	message="Hello to Spring Franework(Default Message)";	
	}
	public Spring3HelloWorld(String arg)
	{
	message=arg;	
	}
	public String sayHello()
	{
	  return message;
    }
}

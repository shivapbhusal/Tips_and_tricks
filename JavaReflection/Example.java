// An example to demonstrate the use of Java Reflection 
import java.lang.reflect.Method; 
import java.lang.reflect.InvocationTargetException; 

public class Example {

	public static void main(String [] args)
	{

		try{
			Method methodGetHello=Example.class.getMethod("getHello"); 
			Method methodprintHello=Example.class.getMethod("printHello", String.class);
			String str=(String)methodGetHello.invoke(new Example()); 
			methodprintHello.invoke(new Example(),str); 
		} 
		catch (NoSuchMethodException e)
		{
			e.printStackTrace(); 
		} catch (InvocationTargetException e){
			e.printStackTrace(); 
		} catch (IllegalAccessException e){
			e.printStackTrace(); 
		}

	}

	public String getHello()
	{
		return "Hello World!"; 
	}

	public void printHello(String str)
	{
		System.out.println(str); 
	}
}


/* Load file 

*/
import java.lang.reflect.Constructor; 
import java.lang.reflect.Method; 

public class ExecuteHidden extends ClassLoader
{
	public static void main(String[] args)
	{
		ClassLoader classLoader=ExecuteHidden.class.getClassLoader(); 

		try {
			Class aClass=classLoader.loadClass("HiddenCode"); 
			System.out.println(aClass.getName());

			Constructor constructor=aClass.getConstructor(); 
			Object myClassObject=constructor.newInstance(); 

			Method method=aClass.getMethod("printHello"); 
			method.invoke(myClassObject);  
			
		}catch (ClassNotFoundException e)
		{
			e.printStackTrace(); 
		}catch (Exception e){
			e.printStackTrace(); 
		}

	}
}

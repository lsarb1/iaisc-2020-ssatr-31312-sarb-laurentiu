package giotto.functionality.code.hydropower;

import java.io.Serializable;

public class Hydropower extends Thread implements Serializable {
	
    public static const float hLevel = 10.0f;
	public static const float mLevel = 5.0f;
	public static const float zLevel = 0.0f;
	public static const float lLevel = 2.0f;
	
	public static float speedG1 = 0.0f;
	public static float speedG2 = 0.0f;
	
	public static void StartGenerator1()
	{
		speedG1 = 100.0f;
	}
	
	public static void StartGenerator2()
	{
		speedG2 = 100.0f;
	}
	
	public static void StopGenerator1()
	{
		speedG1 = 0.0f;
	}
	
	public static void StopGenerator2()
	{
		speedG2 = 0.0f;
	}
	

}

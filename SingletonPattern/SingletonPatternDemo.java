public class SingletonPatternDemo
{
	public static void main(String ...s)
	{
		SingleObject object=SingleObject.getInstance();
		object.show();
	}
}
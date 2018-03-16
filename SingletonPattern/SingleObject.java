public class SingleObject
{
	private static SingleObject instance=null;
private SingleObject(){}
//get only available object
public static SingleObject getInstance()
{
	if(instance==null)
	{
		instance=new SingleObject();
		return instance;
	}
	return instance;
}
	public void show()
	{
		System.out.println("hello world!!!!!!");
	}
}
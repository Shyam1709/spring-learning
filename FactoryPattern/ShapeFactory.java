public class ShapeFactory
{
public static Shape getShape(String shapetype)
{
		
	if(shapetype==null)
	{
		System.out.println(shapetype);
		return null;
	}
	else if(shapetype.equalsIgnoreCase("CIRCLE"))
	{
		
		return new Circle();
	}else 	if(shapetype.equalsIgnoreCase("RECTANGLE"))
	{
		return new Rectangle();
	}else 	if(shapetype.equalsIgnoreCase("SQUARE"))
	{
		return new Square();
	}else{
		System.out.println(shapetype);
		
	}

return null;
	}	
}
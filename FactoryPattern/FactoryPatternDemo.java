public class FactoryPatternDemo
{
public static void main(String...s11)
{
	Shape s=ShapeFactory.getShape("square");
	Shape s1=ShapeFactory.getShape("circle");
	Shape s2=ShapeFactory.getShape("RECTangle");
	s.draw();
	s1.draw();
	s2.draw();
}	
}
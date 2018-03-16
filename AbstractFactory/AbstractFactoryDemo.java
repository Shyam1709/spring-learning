public class AbstractFactoryDemo 
{
	public static void main(String ...s)
	{
		//get shape factory
		AbstractFactory shape1=FactoryProducer.getFactory("shape");
		//get obj of circle shape
		//Circle c=shape1.getShape("circle");/we can not catch in Circle because method getShape returns Shape
		//c.draw();
		//or catch in parent of circle shape
		Shape sh=shape1.getShape("circle");
		sh.draw();
//get obj of rect shape
Shape sh1=shape1.getShape("rectangle");
sh1.draw();
//get obj of square shape
Shape sh2=shape1.getShape("square");
sh2.draw();		
//get Color factory
AbstractFactory  shape2=FactoryProducer.getFactory("color");
//get Obj of color red
Color clr=shape2.getColor("reD");
clr.fill();
//get Obj of color blue
Color clr1=shape2.getColor("blue");
clr1.fill();
//get Obj of color green
Color clr2=shape2.getColor("green");
clr2.fill();
	}
}
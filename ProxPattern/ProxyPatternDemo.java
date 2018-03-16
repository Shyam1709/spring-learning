class ProxyPatternDemo
{
	public static void main(String ...s)
	{
Image ig=new ProxyImage("test_10mb.jpg");
//image will be loaded from the disk
ig.display();
System.out.println(" ");
//image will not be loaded from disk
ig.display();		
	}
}
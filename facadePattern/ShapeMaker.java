class ShapeMaker
{
	private Rectangle rectangle;
	private Square square;
	private Circle circle;
	public ShapeMaker()
	{
		rectangle=new Rectangle();
		square=new Square();
		circle=new Circle();
	}
	public void drawCircle(){
		
	circle.draw();}
	public void drawSquare(){
	square.draw();}
	public void drawRectangle(){
	rectangle.draw();}
}
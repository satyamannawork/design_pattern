package old.creational.adstractfactory;

public class NormalShapeFactory extends AbstractShape{

	
	@Override
	public Shape getShape(String name) {
		// TODO Auto-generated method stub
		Shape shape = null ; 
		if(name.equalsIgnoreCase("circle")){
			shape  = new NormalCircle();
		}
		else if (name.equalsIgnoreCase("rectangle")){
			shape  = new NormalRectangle();
		}
		return  shape ; 
	}
}

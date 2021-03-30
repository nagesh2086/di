package solid;

import java.util.ArrayList;
import java.util.List;

public class SumCalculatorOutputter {

	private AreaCalculator ac;
	public SumCalculatorOutputter(AreaCalculator ac) {
		this.ac = ac;
	}
	public static void main(String[] args) {
		List<ManageShape>list = new ArrayList<ManageShape>();
		list.add( new Circle(5));
		list.add(new Square(10));
		AreaCalculator ac = new AreaCalculator(list);
		SumCalculatorOutputter areaSumOut = new SumCalculatorOutputter(ac);
		areaSumOut.toHTML();
		areaSumOut.toJSON();
		
		List<ManageShape>volummeShapes = new ArrayList<ManageShape>();
		volummeShapes.add( new Cuboid(15));
		VolummeCalculator vc = new VolummeCalculator(volummeShapes);
		SumCalculatorOutputter volummeAreaOut = new SumCalculatorOutputter(vc);
		volummeAreaOut.toHTML();
		volummeAreaOut.toJSON();
	}

	private void toJSON(){
		System.out.println("JSON: " + this.ac.sum());
	}
	
	private void toHTML(){
		System.out.println("HTML: " + this.ac.sum());
	}
}

package solid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AreaCalculator {

	private List<ManageShape>list;

	public AreaCalculator(List<ManageShape>list) {
		this.list = list;
	}

	public static void main(String[] args) {
		List<ManageShape>list = new ArrayList<ManageShape>();
		list.add( new Circle(5));
		list.add(new Square(10));
		AreaCalculator ac = new AreaCalculator(list);
		System.out.println(ac.sum());
	}

	protected double sum() {
		double sumOfArea = 0;
		for (Iterator<ManageShape> iterator = list.iterator(); iterator.hasNext();) {
			ManageShape shape = iterator.next();
			sumOfArea += shape.calculate();
		}
		return sumOfArea;
	}

}

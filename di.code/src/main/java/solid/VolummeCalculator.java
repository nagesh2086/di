package solid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VolummeCalculator extends AreaCalculator {

	private List<ManageShape>list;

	public VolummeCalculator(List<ManageShape>list) {
		super(list);
		this.list = list;
	}

	public static void main(String[] args) {
		List<ManageShape>list = new ArrayList<ManageShape>();
		list.add( new Cuboid(15));
		VolummeCalculator vc = new VolummeCalculator(list);
		System.out.println(vc.sum());
	}

	protected double sum() {
		double sumOfVolumme = 0;
		for (Iterator<ManageShape> iterator = list.iterator(); iterator.hasNext();) {
			ManageShape shape = iterator.next();
			sumOfVolumme += shape.calculate();
		}
		return sumOfVolumme;
	}

}
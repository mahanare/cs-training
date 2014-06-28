package in.careerscale.training.swetha;

public class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double l) {
		width = height = depth = l;
	}

	public double volume() {
		return width * height * depth;
	}
}


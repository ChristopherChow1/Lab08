
public class Shape {
	public enum shape {
		THIMBLE, BOOT, RACECAR
	}
	Shape shape;

	public Shape(Shape shape) {
		this.shape = shape;
	}

	public String toString() {
		return String.format("Game piece: %s", shape.toString());
	}
}

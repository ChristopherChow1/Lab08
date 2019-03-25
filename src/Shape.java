
public class Shape {
	public enum shape {
		THIMBLE, BOOT, RACECAR
	}
	Shape shape;

	public Shape(Shape shape) {
		this.shape = shape;
	}
	/*
	public void piece() {

		switch (shape) {
		case THIMBLE:
			String pieceShape = "THIMBLE";
			break;
		}
	}
	*/
	public String toString() {
		return String.format("Game piece: %s", shape.toString());
	}
}

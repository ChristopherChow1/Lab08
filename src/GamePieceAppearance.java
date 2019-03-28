
public class GamePieceAppearance {
	private Color color;
	private Shape shape;
	GamePieceAppearance(Color color, Shape shape){
		this.color = color;
		this.shape = shape;
	}
	public Shape getShape() {
		return shape;
	}
	public Color getColor() {
		return color;
	}
}

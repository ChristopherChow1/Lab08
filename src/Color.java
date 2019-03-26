
public class Color {
	
	public enum color {
		
		RED (255,0,0),
		GREEN (0,255,0),
		BLUE (0,0,255),
		YELLOW(255,255,0),
		CYAN(0,255,255),
		MAGENTA(255,0,255);
		private final int r; // The R in RGB
		private final int g; // The G in RGB
		private final int b; //The B in RGB
		color (int r, int g, int b){
			this.r = r;
			this.g = g;
			this.b = b;
		}
		public int getR() {
			return r;
		}
		public int getG() {
			return g;
		}
		public int getB() {
			return b;
		}
	}
	
	
}

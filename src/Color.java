
public class Color {
	
	public enum color {
		
		red (255,0,0),
		green (0,255,0),
		blue (0,0,255),
		yellow(255,255,0),
		cyan(0,255,255),
		magenta(255,0,255);
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

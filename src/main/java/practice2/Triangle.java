package practice2;

public class Triangle {
	private final int width;
	
	public Triangle(int width) {
		if (width < 1) {
			throw new IllegalArgumentException("width must be >= 1");
		}
		
		this.width = width;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= this.width; ++i) {
			for (int j = 0; j < i; ++j) {
				sb.append("[*]");
			}
			
			sb.append("\n");
		}
		
		return sb.toString();
	}
}

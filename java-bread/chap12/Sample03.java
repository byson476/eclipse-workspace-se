package chap12;

public class Sample03 {
	public static void main(String[] args) {
		FLOWER flower = FLOWER.ROSE;
		System.out.printf("%s", flower.getName());
	}
}

enum FLOWER{
	SUNFLOWER("SunFlower"), ROSE("Rose");
	private final String name;
	private FLOWER(String flowerName) {
		this.name = flowerName;
	}
	public String getName() {
		return name;
	}
}
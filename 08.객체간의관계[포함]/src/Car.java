public class Car {
    private int no;
    private String model;
    private Engine engine;

    public Car(){
    }

    public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}

	public void print(){
		System.out.print(this.no + "\t" + this.model + "\t");
		this.engine.print();
    }

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

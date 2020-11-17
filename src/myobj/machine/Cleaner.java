package myobj.machine;

public class Cleaner implements Electronics{
	
	Generator src;
	String name;
	int power;
	
	public Cleaner(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public void setConnect(Generator src) {
		// TODO Auto-generated method stub
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		src.consum(power);
		return "방이 10만큼 깨끗해졌습니다.";
	}

	@Override
	public Generator getConnectedGenerator() {
		// TODO Auto-generated method stub
		return null;
	}
}

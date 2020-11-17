package myobj.machine;

public class MicroWave implements Electronics {

	Generator src;
	
	String name;
	int power;
	int used_power;
	
	public MicroWave(String name, int power) {
		this.name = name;
		this.power = power;
		
	}
	
	@Override
	public void setConnect(Generator src) {
		// TODO Auto-generated method stub
		this.src=src;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Generator getConnectedGenerator() {
		// TODO Auto-generated method stub
		return null;

	}
	
	public void cook() {

	}

}

//Your Name          :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :4

public class CargoShip extends Ship {
	@Override
	public boolean engineSwitch() {
		if(this.engineOn) {
			engineOn = false;
			System.out.print("CargoShip Engine Turned Off!\n");
		}else {
			engineOn = true;
			System.out.print("CargoShip Engine Turned On!\n");
		}
		return engineOn;
		
	}
}

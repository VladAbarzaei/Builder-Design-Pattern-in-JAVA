

public class DeluxeBurgerBuilder implements BurgerBuilder {

	private Burger burger;

	public DeluxeBurgerBuilder() {

		this.burger = new Burger();
	}

	@Override
	public void buildBurgerBun() {
		// TODO Auto-generated method stub
		burger.setBurgerBun("Chifla seminte");
	}

	@Override
	public void buildBurgerMeat() {
		// TODO Auto-generated method stub
		burger.setBurgerMeat("Vita wagyu");
	}

	@Override
	public void buildBurgerCheese() {
		// TODO Auto-generated method stub
		burger.setBurgeCheese("Branza cu mucegai");
	}

	@Override
	public void buildBurgerSauce() {
		// TODO Auto-generated method stub
		burger.setBurgerSauce("Sos trufe");
	}

	@Override
	public void buildBurgerVeggies() {
		// TODO Auto-generated method stub
		burger.setBurgerVeggies("Ceapa Caramelizata");
	}

	@Override
	public void buildBurgerGreens() {
		// TODO Auto-generated method stub
		burger.setBurgerGreens("Salate Iceberg");
	}

	@Override
	public void buildBurgerOthers() {
		// TODO Auto-generated method stub
		burger.setBurgerOthers("Caviar");
	}

	public Burger getBurger() {
		return this.burger;
	}
}

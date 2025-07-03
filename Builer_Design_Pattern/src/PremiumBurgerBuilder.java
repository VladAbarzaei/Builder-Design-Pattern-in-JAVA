
public class PremiumBurgerBuilder implements BurgerBuilder{
	private Burger burger;

	public PremiumBurgerBuilder() {

		this.burger = new Burger();
	}

	@Override
	public void buildBurgerBun() {
		// TODO Auto-generated method stub
		burger.setBurgerBun("semi-chifla integrala");
	}

	@Override
	public void buildBurgerMeat() {
		// TODO Auto-generated method stub
		burger.setBurgerMeat("Porc dulce");
	}

	@Override
	public void buildBurgerCheese() {
		// TODO Auto-generated method stub
		burger.setBurgeCheese("Gouda");
	}

	@Override
	public void buildBurgerSauce() {
		// TODO Auto-generated method stub
		burger.setBurgerSauce("Maioneza cu usturoi");
	}

	@Override
	public void buildBurgerVeggies() {
		// TODO Auto-generated method stub
		burger.setBurgerVeggies("Rosii galbene");
	}

	@Override
	public void buildBurgerGreens() {
		// TODO Auto-generated method stub
		burger.setBurgerGreens("Baby spanac");
	}

	@Override
	public void buildBurgerOthers() {
		// TODO Auto-generated method stub
		burger.setBurgerOthers("Tofu");
	}

	public Burger getBurger() {
		return this.burger;
	}
}

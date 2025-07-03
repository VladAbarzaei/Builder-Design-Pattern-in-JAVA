

public class StandardBurgerBuilder implements BurgerBuilder {

	private Burger burger;

	public StandardBurgerBuilder() {  // initializeaza noul burger

		this.burger = new Burger();
	}

	@Override
	public void buildBurgerBun() {
		// TODO Auto-generated method stub
		burger.setBurgerBun("Chifla normala");  // seteaza elementele burgerului cu stringul dat folosind 
												// metodele set din BurgerPlan
	}

	@Override
	public void buildBurgerMeat() {
		// TODO Auto-generated method stub
		burger.setBurgerMeat("Pui");
	}

	@Override
	public void buildBurgerCheese() {
		// TODO Auto-generated method stub
		burger.setBurgeCheese("Cheddar");
	}

	@Override
	public void buildBurgerSauce() {
		// TODO Auto-generated method stub
		burger.setBurgerSauce("Sos Barbeque");
	}

	@Override
	public void buildBurgerVeggies() {
		// TODO Auto-generated method stub
		burger.setBurgerVeggies("Ceapa rosie");
	}

	@Override
	public void buildBurgerGreens() {
		// TODO Auto-generated method stub
		burger.setBurgerGreens("Salate Coleslaw");
	}

	@Override
	public void buildBurgerOthers() {
		// TODO Auto-generated method stub
		burger.setBurgerOthers("Guacamole");
	}

	public Burger getBurger() {
		return this.burger;  //returneaza burgerul cu elementele setate mai sus
	}
}

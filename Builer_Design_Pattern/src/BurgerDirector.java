

public class BurgerDirector {

	private BurgerBuilder burgerBuilder;					//instantiem burgerul ce urmeaza a fi creat

	public void setBuilder(BurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;					//initializam acest burger
	}

	public Burger makeBurger() {							// se creaza/asambleaza burgerul 
		burgerBuilder.buildBurgerBun();
		burgerBuilder.buildBurgerMeat();
		burgerBuilder.buildBurgerCheese();
		burgerBuilder.buildBurgerGreens();
		burgerBuilder.buildBurgerSauce();
		burgerBuilder.buildBurgerVeggies();
		burgerBuilder.buildBurgerOthers();
		return burgerBuilder.getBurger();

	}

}

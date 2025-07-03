

public class TestBurgerBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BurgerDirector burgerDirector = new BurgerDirector();
		burgerDirector.setBuilder(new StandardBurgerBuilder());
		buildBurger(burgerDirector);

		burgerDirector.setBuilder(new PremiumBurgerBuilder());
		buildBurger(burgerDirector);
		
		Burger test = new Burger();
		test.setBurgerBun(null);
		System.out.println(test.print());
	}

	private static void buildBurger(BurgerDirector burgerDirector) {
		Burger burger = burgerDirector.makeBurger();
		System.out.println(burger.print());
	}
}



public interface BurgerPlan {

	public void setBurgerBun(String chifla); //metode set pentru a modifica elementele burgherului

	public void setBurgerMeat(String carne);

	public void setBurgerSauce(String sos);

	public void setBurgeCheese(String branza);

	public void setBurgerVeggies(String legume);

	public void setBurgerGreens(String verdeata);

	public void setBurgerOthers(String diverse);
	
	public String print();  // functia de afisare

}
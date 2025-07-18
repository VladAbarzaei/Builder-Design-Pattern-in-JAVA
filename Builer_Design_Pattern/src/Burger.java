

public class Burger implements BurgerPlan {

	private String burgerBun = "fara chifla";         // initializarea componentelor burgerului
	private String burgerMeat = "fara carne";
	private String burgerSauce = "fara sos";
	private String burgerCheese = "fara branza";
	private String burgerVeggies = "fara legume";
	private String burgerGreens = "fara verdeata";
	private String burgerOthers = "fara diverse";

	@Override
	public void setBurgerBun(String chifla) {
		// TODO Auto-generated method stub
		if(chifla == null) {                        // daca elementul primeste o valoare nula sa returneze
			return;									// tot valoarea cu care a fost initializata
		}
		this.burgerBun = chifla;					// obiectului i se asigneaza stringul dat in functie
	}

	public String getBurgerBun() {
		return burgerBun;
	}

	@Override
	public void setBurgerMeat(String carne) {
		// TODO Auto-generated method stub
		if(carne == null) {
			return;
		}
		this.burgerMeat = carne;
	}

	public String getBurgerMeat() {
		return burgerMeat;
	}

	@Override
	public void setBurgerSauce(String sos) {
		// TODO Auto-generated method stub
		if(sos == null) {
			return;
		}
		this.burgerSauce = sos;
	}

	public String getBurgerSauce() {
		return burgerSauce;
	}

	@Override
	public void setBurgeCheese(String branza) {
		// TODO Auto-generated method stub
		if(branza == null) {
			return;
		}
		this.burgerCheese = branza;
	}

	public String getBurgerCheese() {
		return burgerCheese;
	}

	@Override
	public void setBurgerVeggies(String legume) {
		// TODO Auto-generated method stub
		if(legume == null) {
			return;
		}
		this.burgerVeggies = legume;
	}

	public String getBurgerVeggies() {
		return burgerVeggies;
	}

	@Override
	public void setBurgerGreens(String verdeata) {
		// TODO Auto-generated method stub
		if(verdeata == null) {
			return;
		}
		this.burgerGreens = verdeata;
	}

	public String getBurgerGreens() {
		return burgerGreens;
	}

	@Override
	public void setBurgerOthers(String diverse) {
		// TODO Auto-generated method stub
		if(diverse == null) {
			return;
		}
		this.burgerOthers = diverse;
	}

	public String getBurgerOthers() {
		return burgerOthers;
	}

	public String print() {
		return "Burgerul este gata! " + "\n" + " - Chifla: " + burgerBun + "\n" + " - Carne: " + burgerMeat
				+ "\n" + " - Cheese: " + burgerCheese + "\n" + " - Legume: " + burgerVeggies + "\n" + " - Sauce: "
				+ burgerSauce + "\n" + " - Verdeturi: " + burgerGreens + "\n" + " - Altele: " + burgerOthers;
        
		// afisarea burgerului selectat de client
	}
}
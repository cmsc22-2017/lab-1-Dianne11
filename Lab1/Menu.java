interface IDeliMenu{}

class Soup implements IDeliMenu{
	
	DeliInfo info;
	boolean isVegetarian;
	
	Soup(DeliInfo info, boolean isVegetarian) {
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements IDeliMenu {
	
	DeliInfo info;
	boolean isVegetarian;
	String dressing;
	
	Salad(DeliInfo info, boolean isVegetarian, String dressing) {
		this.info = info;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;		
	}
}

class Sandwich implements IDeliMenu {
	
	DeliInfo info;
	String bread;
	String fillings;
	
	Sandwich(DeliInfo info, String bread, String fillings) {
		this.info = info;
		this.bread = bread;
		this.fillings = fillings;		
	}
}

class DeliInfo {
	
	String name;
	int price;
	
	DeliInfo(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class ExamplesMenu {
	
	DeliInfo soup1 = new DeliInfo("Carrot soup", 20);
	DeliInfo soup2 = new DeliInfo("Chicken Vegetable Soup", 25);
	DeliInfo salad1 = new DeliInfo("Ham salad", 37);
	DeliInfo salad2 = new DeliInfo("Coleslaw", 41);
	DeliInfo sandwich1 = new DeliInfo("Cheeseburger", 50);
	DeliInfo sandwich2 = new DeliInfo("Peanut butter and jelly sandwich", 50);
	
	IDeliMenu a = new Soup(soup1, true);
	IDeliMenu b = new Soup(soup2, false);
	IDeliMenu c = new Salad(salad1, false, "Italian dressing");
	IDeliMenu d = new Salad(salad2, true, "Blue cheese dressing");
	IDeliMenu e = new Sandwich(sandwich1, "bun", "ham and cheese");
	IDeliMenu f = new Sandwich(sandwich2, "white bread", "peanut butter and jelly");
	
}
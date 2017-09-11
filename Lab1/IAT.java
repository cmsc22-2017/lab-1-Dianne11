
interface IAT {}

class Unknown implements IAT {
	
	Unknown() {}
}

class Person implements IAT {
	
	String name;
	IAT mom;
	IAT dad;
	
	Person(String name, IAT mom, IAT dad) {
		
		this.name = name;
		this.mom = mom;
		this.dad = dad;
	}
}

class ExamplesIAT {
	
	Unknown unknown = new Unknown();
	
	IAT mom = new Person("Polie", unknown, unknown);
	IAT dad = new Person("Anie", unknown, unknown);
	IAT mom2 = new Person("Rosario", unknown, unknown);
	IAT dad2 = new Person("Franciso", unknown, unknown);
	IAT mom3 = new Person("Flor", mom, dad);
	IAT dad3 = new Person("Ariel", mom2, dad2);
	IAT me = new Person("Dianne", mom3, dad3);
	
}


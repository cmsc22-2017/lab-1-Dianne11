
class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Address{
	
	String city;
	String state;
	
	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
}

class ExamplesPerson {
	
	Address timAdd = new Address("Warwick", "RI");
	Address patAdd = new Address("Boston", "MA");
	Address kimAdd = new Address("Boston", "MA");
	Address danAdd = new Address("Nashua", "NH");
	
	
	Person tim = new Person("Tim", 20, "M", timAdd);
	Person pat = new Person("Pat", 19, "F", patAdd);
	Person kim = new Person("Kim", 17, "F", kimAdd);
	Person dan = new Person("Dan", 22, "M", danAdd);
}
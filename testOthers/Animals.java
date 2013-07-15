package testOthers;

import java.sql.SQLException;

class Animals {
	public void eat() throws SQLException {
		// throws an Exception
	}
}

class Dog2 extends Animals  
{
	public void eat() { /* no Exceptions */
	}

	public static void main(String[] args) {
		Animals a = new Dog2();
		Dog2 d = new Dog2();
		d.eat(); // ok
		a.eat(); // compiler error -
					// unreported exception
	}
}
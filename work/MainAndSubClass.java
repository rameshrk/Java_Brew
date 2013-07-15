package work;

import one.PublicClass;

public class MainAndSubClass extends PublicClass {
	PublicClass publicClass = new PublicClass();

	// DefaultClass

	private void mainClassPublicMethod() {
		main(null);
		publicClassPublicMethod();
//		defaultClassPublicMethod();
	}

}

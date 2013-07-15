package work;

import one.PublicClass;

public class MainClass {
	PublicClass  publicClass = new PublicClass();
//	DefaultClass
	
	private void mainClassPublicMethod() {
		publicClass.main(null);
		publicClass.publicClassPublicMethod();
//		publicClass.defaultClassPublicMethod();
	} 

	
	
	public static void main(String[] args) {
		PublicClass.main(null);
	}
}

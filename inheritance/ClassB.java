package inheritance;

public class ClassB extends ClassA {
	int nonStaticCommon = 2;
	static int staticCommon = 20;

	int nonStaticUncommonClassB = 4;
	static int staticUncommonClassB = 40;
	
	void commonInstanceMethod() {
		System.out.println("Instance Method in B");
	}

	void printNonStaticVariableCommonVariableThroughInstanceMethod() {
		System.out.println(nonStaticCommon);
	}

	void printStaticVariableCommonVariableThroughInstanceMethod() {
		System.out.println(staticCommon);
	}

//	static void printNonStaticVariableCommonVariableThroughStaticMethod() {
//		System.out.println(nonStaticA);
//	}

	static void printStaticVariableCommonVariableThroughStaticMethod() {
		System.out.println(staticCommon);
	}
	
	static void staticCommonMethod() {
		System.out.println("Static Method in B");
	}

	void printVariableSubMethod() {
		System.out.println(nonStaticCommon);
	}

	void add()
	
	{
		System.out.println (nonStaticCommon+staticCommon);
	}
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.commonInstanceMethod();
		classA.printNonStaticVariableCommonVariableThroughInstanceMethod();
		classA.printStaticVariableCommonVariableThroughInstanceMethod();
		classA.printStaticVariableCommonVariableThroughStaticMethod();
		classA.staticCommonMethod();
		classA.add();
		System.out.println(classA.nonStaticCommon);
		System.out.println(classA.staticCommon);
		System.out.println(classA.nonStaticUncommonClassA);
		System.out.println(classA.staticUncommonClassA);
//		System.out.println(classA.nonStaticUncommonClassB);
//		System.out.println(classA.staticUncommonClassB);
		
		System.out.println();

		classA = new ClassB();
		classA.commonInstanceMethod();
		classA.printNonStaticVariableCommonVariableThroughInstanceMethod();
		classA.printStaticVariableCommonVariableThroughInstanceMethod();
		classA.printStaticVariableCommonVariableThroughStaticMethod();
		classA.staticCommonMethod();
		classA.add();
		System.out.println(classA.nonStaticCommon);
		System.out.println(classA.staticCommon);
		System.out.println(classA.nonStaticUncommonClassA);
		System.out.println(classA.staticUncommonClassA);
//		System.out.println(classA.nonStaticUncommonClassB);
//		System.out.println(classA.staticUncommonClassB);
		System.out.println();

		ClassB classB = new ClassB();
		classB.commonInstanceMethod();
		classB.printNonStaticVariableCommonVariableThroughInstanceMethod();
		classB.printStaticVariableCommonVariableThroughInstanceMethod();
		classB.printStaticVariableCommonVariableThroughStaticMethod();
		classB.staticCommonMethod();
		classB.add();
		System.out.println(classB.nonStaticCommon);
		System.out.println(classB.staticCommon);
		System.out.println(classB.nonStaticUncommonClassA);
		System.out.println(classB.staticUncommonClassA);
		System.out.println(classB.nonStaticUncommonClassB);
		System.out.println(classB.staticUncommonClassB);
		staticCommonMethod();		
		classB.printVariableSubMethod();
	}
}

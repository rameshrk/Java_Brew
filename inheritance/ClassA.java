package inheritance;

public class ClassA {
	int nonStaticCommon = 1;
	static int staticCommon = 10;

	int nonStaticUncommonClassA = 3;
	static int staticUncommonClassA = 30;

	
	void commonInstanceMethod() {
		System.out.println("Instance Method in A");
	}

	void printNonStaticVariableCommonVariableThroughInstanceMethod() {
		System.out.println(nonStaticCommon);
	}

	void printStaticVariableCommonVariableThroughInstanceMethod() {
		System.out.println(staticCommon);
	}

//	static void printNonStaticVariableCommonVariableThroughStaticMethod() {
//		System.out.println(this.nonStaticA);
//	}

	static void printStaticVariableCommonVariableThroughStaticMethod() {
		System.out.println(staticCommon);
	}
	
	static void staticCommonMethod() {
		System.out.println("Static Method in A");
	}
	
	void printVariableSuperMethod() {
		System.out.println(nonStaticCommon);
	}
	
	void add()
	
	{
		System.out.println (nonStaticCommon+staticCommon);
	}
	
}

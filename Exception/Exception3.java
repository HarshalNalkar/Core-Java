
class A
{
	void m(){
		System.out.println("Class A");
	}
}
class B extends A
{
	void m() {
		System.out.println("class B");
	}
}
class C extends A
{
	void m(){
		System.out.println("class c");
	}
}
class Exception3
{
	public static void main(String[] args) 
	{
		B bb = new B();	
		A a = new B();
		try{
			B b = (B) a;
			bb.m();
			C c =(C) a;
			System.out.println(c);
		}
		catch(ClassCastException e)
		{
			System.out.println("ClassCastException handled");
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}
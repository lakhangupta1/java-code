class A
{
	void show()
	{
		System.out.println("1");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("2");
	}
}
class MethodOverriding2
{
	public static void main(String[] args)
	{
		A ob1=new A();
		ob1.show();

		B ob2=new B();
		ob2.show();

		A ob3=new B();
		ob3.show();
		ob3.show();		//	not possible
	}
}
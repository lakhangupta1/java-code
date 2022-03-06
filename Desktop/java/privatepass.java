class A
{
	private int aa=10;
	 void show()      //if private void show()   then not posiible to access in inheritances ...
	{
		System.out.println("hi");
	}
}
class B extends A
{

}
class privatepass
{
	public static void main(String[] args)
	{
		B ob=new B();
		//System.out.println(ob.aa);
		ob.show();
	}
}

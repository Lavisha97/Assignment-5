class Animal
{
	char color = 'B', breed = 'P';
   public void speak()
   {
		System.out.println("Animal");
   }
}

class Dog extends Animal
{
   public void speak()
   {
		System.out.println("Dog");
   }
}

class Cat extends Animal
{
	public void speak()
	{
		System.out.println("Cat");
	}
}
class Overriding
{
	public static void main( String args [])
	   {
			Animal obj = new Animal();
			Dog obj1 = new Dog();
			Cat obj2 = new Cat();
			obj.speak();
			obj1.speak();
			obj2.speak();
	   }
}
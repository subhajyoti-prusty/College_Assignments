### Index:  

* [12. Object Oriented Programming](#object-oriented-programming)   
   + [1. Encapsulation](#encapsulation)  
   + [2. Inheritance](#inheritance)  
   + [3. Abstraction](#abstraction)  
   + [4. Polymorphism](#polymorphism)  
   + [5. Interface](#interface)  
   + [6. Coupling & Cohesion](#coupling-and-cohesion)  
* [13. Generics](#13-generics)  
   + [1. Generic Class](#generic-class)  
   + [2. Generic Method](#generic-method)  
   + [3. Overriding toString](#tostring-overriding)  
   + [4. Overriding equals](#equals-overriding)  
   + [5. Map Interface](#map-interface)  
   + [6. Set Interface](#set-interface)
   + [7. List Interface](#list-interface)  
   + [8. Queue Interface](#queue-interface-fifo)  
   + [9. Stream API](#stream-api)
<hr> 

# 12. Object Oriented Programming   

## Encapsulation:

* Hiding "sensitive" information/data from outside access.
* It's a process of wrapping information/data into a single piece.
* Two Rules :
  1. Declare class attributes/variables as private.
  2. Use GET & SET methods to access &  update the private attributes/variables.
* Example: [TestEncapsulation.java](https://github.com/subhajyoti-prusty/College_Assignments/blob/f3929e63c89fcb67f0ddb3de364f9c2e928e841a/SEM_4/CSW/Class%20Lecture/12%20Object%20Oriented%20Programming/1_Encapsulation/TestEncapsulation.java)
```ruby
class Person
{
	private int Age;
	private String Name;
	
	// We will employ get and set methods to use the class objects
	public String getName()
	{
		return Name;
	}
	
	public int getAge()
	{
		return Age;
	}
	
	public void setAge(int Age)
	{
		this.Age = Age;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
}

public class TestEncapsulation
{
	public static void main(String args[])
	{
		Person obj = new Person();
		obj.setName("Mark");
		obj.setAge(30);
		System.out.println("Name is: " + obj.getName());
		System.out.println("Age is: " + obj.getAge());
	}
}
```
* | Advantages                                                                                                | Disadvantages                                      |
  | --------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
  | Code becomes more flexible. The programmer can change one part of the code without affecting other parts. | It can lead to complex code, if not used properly. |
  | Attributes can be made read-only or write-only according to the programmer's choice.                      | May limit the flexibility of implementation.       |
  | Increases security of data.                                                                               | It makes the code more difficult to understand.    |

  ## Inheritance:

* It's a mechanism in which one object acquires all parent object's properties and behaviors (attributes and methods).
* You can build a new class upon an existing class which will pose all the properties of the parent class.
* Syntax: class SubClassName extends SuperClassName{
              //methods
          }
* Example: [Inheritance.java](https://github.com/subhajyoti-prusty/College_Assignments/tree/f3929e63c89fcb67f0ddb3de364f9c2e928e841a/SEM_4/CSW/Class%20Lecture/12%20Object%20Oriented%20Programming/2_Inheritance)
* 3 Types:
  1. Single Inheritance [class A] <-- [class B]
```ruby
     class Employee
{
	int Salary = 40000;
    void eat(){
        System.out.println("Employee is eating");
    }
}
class programmer extends Employee
{
	int Bonus = 10000;
    void bark(){
        System.out.println( "Programmer is Barking" );
    }
	public static void main(String[] args)
	{
		programmer obj = new programmer();
		System.out.println(obj.Salary);
		System.out.println(obj.Bonus);
        obj.eat();
        obj.bark();
	}
}
```
  2. Multilevel Inheritance [class A] <-- [class B] <-- [class C]
```ruby
class Employee
{
	int Salary = 40000;
    void eat(){
        System.out.println("Employee is eating");
    }
}
class programmer extends Employee
{
    int Bonus = 10000;
    void bark(){
        System.out.println( "Programmer is Barking" );
    } 
}
class puppy extends programmer
{
	int Fees = 1000000;
    void cry(){
        System.out.println( "Programmer is Crying" );
    }
	public static void main(String[] args)
	{
		puppy obj = new puppy();
		System.out.println(obj.Salary);
		System.out.println(obj.Bonus);
        obj.eat();
        obj.bark();
        obj.cry();
	}
}
```
  4. Heirarchial Inheritance [class C] --> [class A] <-- [class B]
```ruby
class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("meowing...");
    }
}

class TestInheritance3
{
    public static void main(String args[])
    {
        Cat c = new Cat();
        Dog d = new Dog();
        c.meow();
        c.eat();
        d.bark();
        d.eat();
    }
}
```
* | Advantages                                                                              | Disadvantages                                                                             |
  | --------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
  | It makes the code reusable as the superclass remains the same for all subclasss.        | Inheritance makes it difficult to make changes to superclass without affecting the subclass. |
  | Helps to implement, extend, and maintain abstraction & runtime polymorphism.            | Multiple inheritance, etc make a code very complicated                                    |
  | It creates a class hierarchy which is more useful when dealing with real-world objects. |                                                                                           |

## Abstraction:

* It's the process in which we only show essential details/functionality to the user.
* The non-essential things are hidden from the user.
* Two ways to achieve Abstraction:
  1. Abstract class -> (o - 100%)
  2. Interface -> (100%)
* An abstract class must be declared with an abstract keyword:
  > abstract class A{ //code }
  >
* Example: [Abstraction.java](https://github.com/subhajyoti-prusty/College_Assignments/blob/f3929e63c89fcb67f0ddb3de364f9c2e928e841a/SEM_4/CSW/Class%20Lecture/12%20Object%20Oriented%20Programming/3_Abstraction/Abstraction.java)
   ```ruby
   abstract class Bike
   {
       abstract void run();
   }
   
   class Yamaha extends Bike
   {
       void run()
       {
           System.out.println("running safely");
       }
   }
   
   public class Abstraction
   {
   	public static void main(String args[])
       {
           Bike b = new Yamaha();
           b.run();
       }
   }
   ```
* Example: [TestAbstraction1.java](https://github.com/subhajyoti-prusty/College_Assignments/blob/f3929e63c89fcb67f0ddb3de364f9c2e928e841a/SEM_4/CSW/Class%20Lecture/12%20Object%20Oriented%20Programming/3_Abstraction/TestAbstraction1.java)
  ```ruby
     abstract class Shape {
      abstract void draw();
  }
  
  class Rectangle extends Shape {
      void draw() {
          System.out.println("drawing rectangle");
      }
  }
  
  class Circle1 extends Shape {
      void draw() {
          System.out.println("drawing circle");
      }
  }
  
  class TestAbstraction1 {
      public static void main(String args[]) {
          Shape s = new Circle1();
          s.draw();
      }
  }
  ```
* | Advantages                                                          | Disadvantages                                                                              |
  | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
  | It protects the implementation of the program from users.           | Overuse of abstraction makes the code less optimal because of unnecessary layers of code. |
  | It provides flexibility as we can change the way we implement code. | It may limit the flexibility of implementation.                                            |
  | It makes code easier for debugging.                                 | It makes the code more difficult to understand.                                            |

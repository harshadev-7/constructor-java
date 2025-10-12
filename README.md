# Java Constructors
In Java, constructors play an important role in object creation. 
A constructor is a special block of code that is called when an object is created. 
Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes.
This process happens automatically when we use the "new" keyword to create an object.
## Characteristics of Constructors:
1. Same Name as the Class: A constructor has the same name as the class in which it is defined.
2. No Return Type: Constructors do not have any return type, not even void. The main purpose of a constructor is to initialize the object, not to return a value.
3. Automatically Called on Object Creation: When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
4. Used to Set Initial Values for Object Attributes: Constructors are primarily used to set the initial state or values of an object’s attributes when it is created.
### Constructor vs Method in Java
The below table demonstrates the key difference between Java Constructor and Java Methods.
![image alt](https://github.com/harshadev-7/constructor-java/blob/05c262cfa5084b5d33e50e78ce5996072764d528/Screenshot_20251012_120129_Brave.jpg)

Now let us come up with the syntax for the constructor being invoked at the time of object or instance creation.
![image alt](https://github.com/harshadev-7/constructor-java/blob/16e33fc2173427f897eb520903d8ac5920d11c38/Screenshot_20251012_120936_Brave.jpg)

The first line of a constructor is a call to super() or this(), (a call to a constructor of a super-class or an overloaded constructor), if you don't type in the call to super in your constructor the compiler will provide you with a non-argument call to super at the first line of your code, the super constructor must be called to create an object:
Note:
If you think your class is not a subclass it actually is, every class in Java is the subclass of a class object even if you don't say extends object in your class definition.
#### Why Do We Need Constructors in Java
Constructors play a very important role, it ensures that an object is properly initialized before use.
##### What happens when we don't use constructors:
Without constructors:

1. Objects might have undefined or default values.
2. Extra initialization methods would be required.
3. Risk of improper object state.
![image alt](https://github.com/harshadev-7/constructor-java/blob/b67945e71655278064af3c62ab27eb1da883833c/Screenshot_20251012_121433_Brave.jpg)

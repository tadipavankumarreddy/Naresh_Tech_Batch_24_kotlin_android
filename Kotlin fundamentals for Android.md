### Concepts present in the [demo notes](/Naresh%20Tech%20-%20Kotlin%20Android%20Development%20-%20Batch%2024%20Notes.pdf)

- Kotlin Syntax
- How to run Programs ?
- Variables & Data Types
- Functions in Kotlin
- Condition control structure
- When Statements

### Loops in Kotlin

When you want to repeat a set of statements for some number of times or till the condition fails, we can employ loops.

`in` -> is a keyword in kotlin that works with range of values or a collection.

#### The `for` Loop in Kotlin

`..`-> This defines the range   
1..10 -> it means 1 to 10

```kotlin
fun main() {
    for(i in 1..10){
        print("$i ")
    }
}
```

```kotlin
fun main() {
    for(i in 1..10 step 2){
        print("$i ")
    }
}
```

```kotlin
fun main() {
    for(i in 10 downTo 1){
        print("$i ")
    }
}
```

```kotlin
fun main() {
    for(i in 10 downTo 1 step 3){
        print("$i ")
    }
}
```
`while` & `do-while` works the same way as the ones we have in `c`, `cPP` , `java` & `python`.

```kotlin

fun main() {
    var i = 0
    while(i<=10){
        print("$i ")
        i++
    }

    do {
        print("$i ")
        i--
    }while (i>=0)
}
```

`repeat` in built function

```kotlin
fun main() {
    repeat(10){
        print("NITT ")
    }
}
```

#### Assignment

- Write a program to find if a given number is prime or not.
- Extend the first program to identify all the palindromic prime numbers till 10,000.
- Write a program to find if a given number is present in the fibnocci series.
- Write a program to find the factorial of any given number. 
- Write a program to identify the average of all the values given in an array.


### Arrays in Kotlin 

Array is one of the fundamental data structure in practically all programming languages. The ides behind an array is to store multiple items of the same data tyoe, such as integers or strings under a single name.

Arrays are used to organize data in programming so that a related set of values can be easily stored and searched for. 

Important Points to make a note of
1. They are store in contigeous memory location.
2. They can be accessed programatically through their indices.
3. They are mutable.
4. Their size is fixed
5. The index of array starts at 0 and ends at 1 less than the actual size. 

***Create an array with the help of `arrayOf()` & `arrayOf<>()` functions***

```kotlin
fun main() {
    var a = arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
    // Get the size of an array
    println("the size of the array is ${a.size}")

    // Access the idividual elements through indices
    println(a[5])

    // Modify the value based on the index
    a[8] = 10

    // set a value at a particular index using set method
    a.set(3,56)

    for(i in a){
       print("$i ")
    }
    println()
    // get method helps us to read a value in an array
    println(a.get(7))
}
```

***Using `Array()` constructor***
```kotlin
fun main() {
    println("Enter the size of the array")
    val s = Scanner(System.`in`)
    val l = s.nextInt()

    var a = Array<Int>(l,{i->i+1})
    for (i in a){
        print("$i ")
    }
}
```

### OOPs in Kotlin

OOP stands for Object Oriented Programming

Procedural Programming is about writing the procedures or methods that operate on the data while, OOP is about creating objects that contain both data and methods that operate on them.

Advantages:
1. Faster and easier to execute. 
2. Provides clear structure of the program
3. OOP helps to keep the kotlin code DRY(Do not repeat yourself)
4. Reusability

#### Kotlin Objects & Classes
- Any Real world entity that shows attributes and behavior can be considered as an object. 
- A class is the blueprint of an object. 

Unlike java, Kotlin is null safe. That is the reason, the variables that you declare must be initialized or they can also accept null values if you specify explicitly with `?` combination. 

```kotlin
import java.util.Scanner

class Dog{
    // Dog Attributes -> name, age & weight
    // Display()
    var name:String? = null
    var age:Int? = null
    var weight:Double? = null

    fun display(){
        println("$name of age $age is of weight $weight")
    }
}

fun main(){
    val d = Dog() // This is how you create an Object
    d.name = "Tommy"
    d.age = 12
    d.weight = 34.45

    val j = Dog()
    j.name = "Jimmy"
    j.age = 10
    j.weight = 4.45

    d.display()
    j.display()
}
```

**Output**
```
Tommy of age 12 is of weight 34.45
Jimmy of age 10 is of weight 4.45

Process finished with exit code 0
```

```kotlin
package com.nareshit.kotlinfundamentalsforandroid

import java.util.Scanner

class Dog{
    // Dog Attributes -> name, age & weight
    // Display()
    var name:String? = null
    var age:Int? = null
    var weight:Double? = null

    fun display(){
        println("$name of age $age is of weight $weight")
    }
}

fun main(){
    val d = Dog() // This is how you create an Object
    d.name = "Tommy"
    d.age = 12
    d.weight = 34.45

    val j = d
    j.name = "Jimmy"
    j.age = 10
    j.weight = 4.45

    d.display()
    j.display()
}
```

**Output**
```
Jimmy of age 10 is of weight 4.45
Jimmy of age 10 is of weight 4.45

Process finished with exit code 0
```


#### Consturctors in Kotlin

In kotlin, A constructor is a special block of code that initilizes a new object of a class. There are two types of constructors in kotlin

1. Primary Constructor
    The primary constructor is a part of the class header and is declared after the class name. It is used to initialize the class with basic parameters.
    
2. Secondary Constructor
    A class can have one or more secondary constructors , which are defined inside the class body using `constructor` keyword. They can provide additional initialization logic or different ways to initialize an object. 

```kotlin
import java.util.Scanner

class Dog(var name:String?, var age:Int?, var weight:Double?){

    constructor(name:String):this(name,0,0.0){
        println("Remember that you only entered the name of the dog")
    }

    constructor(name:String, age:Int):this(name,age,0.0){
        println("Remember that you did not give weight")
    }

    fun display(){
        println("$name of age $age is of weight $weight")
    }
}

fun main(){
    val d = Dog("Justin",12,5.6) // This is how you create an Object
    d.display()

    val tommy = Dog("Tommy")
    d.display()
}
```

**output**

```
Justin of age 12 is of weight 5.6
Remember that you only entered the name of the dog
Justin of age 12 is of weight 5.6

Process finished with exit code 0
```

#### Inheritance in Kotlin
This is another fundamentally very important concept in OOPs. Inheritance is the process of acquring the properties & behaviors of one class into another class. 

**Inheritance is primarily used for Re-usability of the code**

**Important Point to Note:**
- All Classes in Kotlin have a common super class, `Any`, which is the default super class for a class with no super class defined. 

```koltin
class Chiranjeevi{
    // The default super class will be ANY
}
```

`Any` class has got three methods
- equals()
- hashCode()
- toString()

Hence, These methods are present by default in any class you create 

```kotlin
import java.util.Scanner

class Dog(var name:String?, var age:Int?, var weight:Double?){

    fun display(){
        println("$name of age $age is of weight $weight")
    }
}

fun main(){
    val d = Dog("Justin",12,5.6) // This is how you create an Object
    d.display()

    val j = d
    println(d.equals(Dog("Justin",12,5.6)))
    println(d.equals(j))

    println(d.toString())

    println(j.hashCode())
    println(d.hashCode())
}
```

***Output***
```
Justin of age 12 is of weight 5.6
false
true
com.nareshit.kotlinfundamentalsforandroid.Dog@7a0ac6e3
2047526627
2047526627

Process finished with exit code 0
```

**Important Point to Note:**

In Kotlin, all classes are `final` by default.If you want to subclass a class use `open` keyword to make the class subclassable. 

```kotlin
class Pavan{
    // This class is final and we cannot create subclasses to this class
}
```

```kotlin
open class Pavan{
    // Now this class is subclassable
}
```

In Java, we use `extends` keyword to create a subclass. In Kotlin, we use `:` for the same. 

```kotlin
open class Base(p:Int)
class Derived(p:Int):Base(p)
```


```kotlin
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
open class A(var name:String?, var age:Int?){
    fun display(){
        print("$name $age")
    }
    
}

class B(var n:String?, var a:Int?, var salary:Int?):A(n,a){
    fun display2(){
        display()
        print(" $salary")
    }
}

fun main() {
    val b = B("Pavan", 18, 10000)
    b.display2()
}
```
***Output***
```
Pavan 18 10000
```
### Encapsulation

Another fundamental Oops concept. Encapsulation refers to the bundling of data and methods that operate on the data with in a single Unit, is called as class. 

Encapsulation is a way to hide the implementation details of a class from outside access and only exposing public interface that can be used to interact with the class. 

**Modifiers in Kotlin**

- `private` - the element that is declared private cannot be accessed from outside the kotlin file that is defined in. These elements can only be accessed in the same place where they are defined. 
- `public` - Elements are accessed from anywhere
- `protected` - Same as private except that subclasses can access the class/interface elements.
- `internal` - Anything in the module (folder) can be accessed. 


```kotlin
class Internals{
    internal var a = 10
}

fun main(){
    val i = Internals()
    println(i.a)
}
```

```kotlin
class BankAccount(private var balance:Double){
    fun deposit(amount:Double){
        if(amount>0){
            balance += amount
            println("Deposited $amount in your account")
            println("The new balance is $balance")
        }else{
            println("The amount should be positive for deposit")
        }
    }
    
    fun withdraw(amount:Double){
        if(amount>0 && amount<=balance){
            balance -= amount
            println("Successful withdraw: balance is $balance")
        }else{
            println("Insufficient Funds")
        }
    }
    
    fun getBalance():Double{
        return balance
    }
}
```

By using encapsulation, the internal state of the `BankAccount` class is protected from direct access and modifications from outside the class. Only the methods provided by the class can modify the balance, ensuring that the class maintains control over how the balance is accessed and changed. This help maintain integrity of the data and prevents unintended side effects.

If a class with a certain functionality is defined in a different package and the elements in the class are accessible either direclty (if they are declared as public) or with the help of their helper methods (incase of private or protected modifiers), you can write the import statements to import that module or a specific class. 

If a class in the smae module (Package) needs to be accessed, you can directly access it. No need of Import statements. 

### Polymorphism

Existence in multiple forms is called polymorphism
- Overloading (compile time polymorphism)
- Overriding (runtime Polymorphism)

**Overloading**

```kotlin
fun sum(a:Int, b:Int):Int{
	return a+b
}

fun sum(a:Int, b:Int, c:Int):Int{
    return a+b+c
}

fun sum(a:Int, b:Double):Double{
    return a+b
}
fun main() {
 	println(sum(10,20))
    println(sum(10,20,30))
    println(sum(10,30.45))
}
```

***Overriding***

The function has to be `open` for overrding to happen.

```kotlin
open class First{
    open fun sum(a:Int,b:Int) = a+b
    fun sum(a:Int, b:Int, c:Int) = a+b+c
}

class Second:First(){
    override fun sum(a:Int, b:Int) = a*b
}
               
fun main() {
    var s = Second()
    println(s.sum(10,20))
    println(s.sum(10,20,30))
}
```

### Abstract Classes in Kotlin

Abstract classes are those classes defined with `abstract` keyword. In an abstract class you can have methods with body and methods without a body. 

- Abstract classes cannot be instantiated on its own and mustt be subclassed. 
- It can have Abstract methods (unimplemented)
- It can have concrete methods (defined)

```Kotlin
abstract class RBI{
    /***This function is not open to override - so all the banks that 
     * are undertaken by RBI should be implementing the same
     * interst rate***/
    fun homeLoanInterestRate():Double{
        return 7.65
    }
    
    abstract fun personalLoan():Double
}

class SBI:RBI(){
    override fun personalLoan():Double{
        return 6.2
    }
}

class ICICI:RBI(){
    override fun personalLoan():Double{
        return 7.8
    }
}

fun main(){
    val s:SBI = SBI()
    println(s.homeLoanInterestRate())
    println(s.personalLoan())
}
```

### Interfaces in Kotlin

Interfaces are similar to interfaces in java, but with some additonal features and more concise syntax.

**Declare an Interface**

```kotlin
interface MyInterface{
    fun myMethod()
    val myProperty:String
}
```
**Implementing an Inteface**

Classes in kotlin can implement one or other interfaces using `:` symbol.

```koltin
interface MyInterface{
    fun myMethod()
    val myProperty:String
}

class MyClass:MyInterface{
    override val myProperty:String = "Hello"
    override fun myMethod(){
        println("My Method Implementation")
    }
}
fun main() {
    val m = MyClass()
    m.myMethod()
}
```

#### Default Implementation
Kotlin interfaces can provide default implementation for Methods. 

```kotlin
interface MyInterface{
    fun myMethod(){
        println("This is default implementation")
    }
}
```

With interfaces, we can implement Multiple Inheritance

```kotlin
interface Animal{
    val name:String
    fun sound():String
    
    //default Implementation
    fun printDetails(){
        println("Animal: $name, sound: ${sound()}")
    }
}

class Dog(override val name:String):Animal{
    override fun sound():String = "Bark"
}

class Cat(override val name:String):Animal{
    override fun sound():String = "Meow"
}	
fun main() {
	val dog = Dog("Buddy")
    dog.printDetails()
}
```

***End***
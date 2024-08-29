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




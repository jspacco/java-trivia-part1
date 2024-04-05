# toString, Comparable, hashCode, equals

## ex0: toString

If you don't include a `toString()` method, Java uses the default, which prints the class name, an `@` sign, and the hash code of the object. The hash code is a unique identifier for the object. It is not the memory address of the object, but it is unique for each object.

This is not super helpful. Provide a `toString()` method.

## ex1: Comparable

`ex1` shows what happens when you have a Comparable Ninja class that sorts by name, and you put two Ninjas into the same TreeSet. The TreeSet will sort the Ninjas by name, and the second Ninja will not be added to the TreeSet because it is equal to the first Ninja according to the `compareTo` method.

## ex2: hashCode

`ex2` shows what happens when you have a HashSet of Ninjas, and you override the hashCode method but **not** the equals method, and you add two Ninjas that should be the same. The HashSet will add both Ninjas because, while they have the same hashCode, they are not equal according to the `hashCode` method.

## ex3: equals

`ex3` shows what happens when you have a HashSet of Ninjas, and you override the equals method but **not** the hashCode method, and you add two Ninjas that should be the same. The HashSet will add both Ninjas because, while they are equal according to the `equals` method, they do not have the same hashCode and so they has to different buckets.

## ex4: overriding equals incorrectly

This does **not** override the equals method! It overloads it. The equals method must have the signature `public boolean equals(Object obj)`. This method has the signature `public boolean equals(Ninja obj)`. 

```java
@Override
public boolean equals(Ninja obj) {
    if (obj == null) {
        return false;
    }
    return this.name.equals(obj.name) && this.honor == obj.honor;
}
```

The way to fix this is **not** to remove the `@Override` annotation. That will make the code compile, but for the **wrong** reasons. What if we had code like this:

```java
Ninja ninja1 = new Ninja("Hanzo", 100);
Object ninja2 = new Ninja("Hanzo", 100);
System.out.println(ninja1.equals(ninja2));
```

The output would be `false` because the `equals` method is not being called. The `equals` method is being overloaded, and the `equals` method in the `Object` class is being called. The `equals` method in the `Object` class checks if the two objects are the same object, not if they are equal according to the `equals` method in the `Ninja` class.

The correct way to override the `equals` method is as follows:
    
```java
@Override
public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
    if (obj instanceof Ninja) {
        Ninja otherNinja = (Ninja) obj;
        return this.name.equals(otherNinja.name) && this.honor == otherNinja.honor;
    }
    return false;
}
```

## ex5: overriding equals and hashCode correctly

`ex5` shows what happens when you override the `equals` and `hashCode` methods correctly. The `equals` method checks if the two Ninjas have the same name and honor, and the `hashCode` method returns the sum of the hash codes of the name and honor fields.

Now if we put two identical Ninjas into a HashSet, only one will be added because they are equal according to the `equals` method, and they have the same hashCode.
```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > y) x else y // Potential bug: Integer overflow if x and y are very large
  }
}
```
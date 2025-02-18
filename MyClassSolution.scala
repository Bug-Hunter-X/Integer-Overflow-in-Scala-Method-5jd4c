```scala
import scala.math.BigInt

class MyClass(val x: BigInt) {
  def myMethod(y: BigInt): BigInt = {
    if (x > y) x else y 
  }
}
```
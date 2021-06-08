object MyModule {
  def fibonacci(n: Int):Int = {
    def go(i: Int, current: Int, next: Int): Int =
      if (i < n) go(i + 1, next, current + next)
      else current
    go(1, 0, 1)
  }
  // scala exercise 2.1
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }
  // scala exercise 2.2
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(index: Int): Boolean = {
      if (as.size > index + 1 ) if (ordered(as(index), as(index+1))) loop(index+1)
        else false
      else true
    }
    loop(0)
  }
}

MyModule.fibonacci(1)
MyModule.fibonacci(2)
MyModule.fibonacci(6)
MyModule.fibonacci(7)
MyModule.fibonacci(700)
MyModule.isSorted(Array(1,2,3), (a: Int, b: Int) => a <= b )
MyModule.isSorted(Array(1,2,3, 4, 5, 5, 6), (a: Int, b: Int) => a <= b )
MyModule.isSorted(Array(1,2,3, 4, 5, 7, 6), (a: Int, b: Int) => a <= b )

// scala exercise 2.3
def curry[A,B,C](f: (A, B) => C): A => (B => C) =
  (a: A) => (b: B) => f(a, b)
// scala exercise 2.4
def uncurry[A,B,C](f: A => B => C): (A, B) => C =
  (a: A, b: B) => f(a)(b)

// scala exercise 2.5
def compose[A,B,C](f: B => C, g: A => B): A => C =
  (a: A) => f(g(a))


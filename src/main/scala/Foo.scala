import com.wix.accord.dsl._

object App {
  def main(args: Array[String]): Unit = {
    validator[MyClass] { myClass =>
      myClass.s is notEmpty // this triggers the exception
    }
  }
}

case class MyClass(s: Seq[_])

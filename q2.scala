import scala.io.StdIn.readInt

object q2 extends App {
    def numberType(num : Int): Unit = {
        num match {
            case x if x<=0 => println("Negative/Zero is given");
            case x if x%2==0 => println("Even number is given");
            case _ => println("Odd number is given");
        }
    }
    printf("Enter a number: ")
    var number = readInt();
    numberType(number);

}
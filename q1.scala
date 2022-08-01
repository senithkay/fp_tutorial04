object q1 extends App {
    def interest(deposit: Double) : Double = deposit match {
        case deposit if deposit <=0 => 0;
        case deposit if deposit <=20000 => deposit*0.02;
        case deposit if deposit <=200000 => deposit*0.035;
        case deposit if deposit <=2000000 => deposit*0.04;
        case _ => deposit*0.065;
    }

    var deposit:Int = 3000000; 
    println("Interest is: " + interest(deposit))
}
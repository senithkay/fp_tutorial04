object q3 extends App {
    def toUpper(name:String): String = {
        var results = "";
        for (x<-name){
            x match {
                case y if 'a' <= y && y<= 'z' => results += (y-32).toChar;
                case _ => results+=x;
            }
        }
        return results;
    }

    def toLower(name:String): String = {
        var results = "";
        for (x<-name){
            x match {
                case y if 'A' <= y && y<= 'Z' => results += (y+32).toChar;
                case _ => results+=x;
            }
        }
        return results;
    }

    def formatNames(name:String,function:(String)=>String, positions:Int*):String = {
        var results = "";
        for (i<-0 until name.length){
            if (positions.contains(i)) 
                results += function(name.charAt(i).toString)
            else
                results += name.charAt(i)
            
        }
        return results;


    }


    println(formatNames("Benny", toUpper,1,2,3,4));
    println(formatNames("Niroshan", toUpper,1));
    println(formatNames("Saman", toLower,0));
    println(formatNames("Kumara", toUpper,5));

}
package stratpat
interface Fly{
    fun flyon(): String
}
class CanNotFly:Fly {

    override fun flyon(): String {
        return "i cant fly, sorry...."
     }
    
}
class CanFly:Fly {

    override fun flyon(): String {
        return "flying high"
     }
    
}
open class Animal(val name:String,val flight:Fly ){
    public fun flyon(){
        println(name + " : " +flight.flyon())
    }
}
class fish(name:String) : Animal(name, CanNotFly())
class bird(name:String) : Animal(name,CanFly())
package cmdpat
interface command{
    fun execute()
}
//invoker
class captain {
    fun invoke(cmd:command){
        cmd.execute()
    }
}
//we can make a earospave interface (with subclasses like subclasses like plane, drone, spaceship...etc)
//but using one class gets the point across

//target 
class SpaceShip {
    fun land() {
        println("checking correct location")
    }
    fun takeOff() {
        println("ready for take off")
    }
}
//comands
class landCMD(val ship:SpaceShip): command{
    override fun execute(){
        ship.land()
    }
}
class takeOffCMD(val ship:SpaceShip): command{
    override fun execute(){
        ship.takeOff()
    }
}

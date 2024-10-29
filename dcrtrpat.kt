package dcrtrpat
interface Pie {
    fun getdescription(): String
    fun getCost():Double
}
class plainPie : Pie{
    override fun getdescription(): String {
        return "I am a pie with: thick dough"
    }
    override fun getCost():Double{
        return 2.0
    }

}
abstract class FlavorDecorator(protected val pie:Pie): Pie {
    
    override fun getdescription(): String {
        return pie.getdescription() +" and "
    }
    override fun getCost(): Double {
        return pie.getCost()
    }
}

class Apple(newpie:Pie):FlavorDecorator(newpie){
    override fun getdescription(): String {
        return super.getdescription() + "apple, "
    }
    override fun getCost(): Double {
        return super.getCost()+.5
    }
}
class Orange(newpie:Pie):FlavorDecorator(newpie){
    override fun getdescription(): String {
        return super.getdescription() + "orange, "
    }
    override fun getCost(): Double {
        return super.getCost()+.7
    }
}
class Cheese(newpie:Pie):FlavorDecorator(newpie){
    override fun getdescription(): String {
        return super.getdescription() + "cheese, "
    }
    override fun getCost(): Double {
        return super.getCost()+.8
    }
}


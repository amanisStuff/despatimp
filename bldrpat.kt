package bldrpat
interface cakePlan {
    fun setBase(flavor:String)
    fun setTopping(color:String)
    fun setdecor(type:String)
}
class cake() : cakePlan{
    private var base: String? = null
    private var topping: String? = null
    private var decor: String? = null

    override fun setBase(flavor: String) {
        base = flavor
     }

    override fun setTopping(color: String) { 
        topping=color
    }

    override fun setdecor(type: String) {
        decor=type
     }
    override fun toString(): String {
        return base+" cake "+"with "+topping+ " toppings and "+decor +" decorations"
     }    
}
interface cakeMaker {
    
    fun makeBase(flavor:String){}
    fun makeTopping(color:String){}
    fun makedecor(type:String){}
    fun getCake():cake

}
class OldBaker :cakeMaker{
    private val mycake:cake = cake()

    override fun makeBase(flavor: String) {
        mycake.setBase(flavor)
     }

    override fun makeTopping(color: String) { 
        mycake.setTopping(color)

    }

    override fun makedecor(type: String) {
        mycake.setdecor(type)
     }

    override fun getCake():cake { 
        return mycake
    }
    

}
class baker {
    fun makeCake(flavor:String,color:String,type:String): cake{
        val cakeMaker= OldBaker()
        cakeMaker.makeBase(flavor)
        cakeMaker.makeTopping(color)
        cakeMaker.makedecor(type)

        return cakeMaker.getCake()
    }
}
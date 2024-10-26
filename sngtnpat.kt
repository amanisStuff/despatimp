package sngtnpat
class feedBox{
    private var amount: Int = 0 
    private constructor(amountpra: Int){
        amount= amountpra
    }
    fun feedAnimal(amountpra:Int): Int ? {
        if (amount < amountpra){
            
            return amount
        }
        amount = amount.minus(amountpra)
        return amount
    }
    companion object {
        private var BoxInstance:feedBox ?  = null
        public fun getInstance(): feedBox ?{
            if (BoxInstance== null) {BoxInstance = feedBox(1000)}
            return BoxInstance
        }
    }
}
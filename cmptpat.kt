package cmptpat
abstract class documentcomponent(){
    abstract fun print()
    open fun add(component: documentcomponent) {
        throw UnsupportedOperationException("Operation not supported")
    }

    open fun remove(component: documentcomponent) {
        throw UnsupportedOperationException("Operation not supported")
    }   
}
class document: documentcomponent() {
    private val components = ArrayList<documentcomponent>()

    override fun add(component: documentcomponent) {
        components.add(component)
    }

    override fun remove(component: documentcomponent) {
        components.remove(component)
    }
    override fun print() {
        println("Document")
        for (component in components) {
            component.print()
        }
    }
    
}
class page : documentcomponent() {
    private val components = ArrayList<documentcomponent>()

    override fun print() {
        println("Page:")
        for (component in components) {
            component.print()
        }
    }

    override fun add(component: documentcomponent) {
        components.add(component)
    }

    override fun remove(component: documentcomponent) {
        components.remove(component)
    }
}
class paragraph : documentcomponent() {
    override fun print() {
        println("Paragraph")
    }
}

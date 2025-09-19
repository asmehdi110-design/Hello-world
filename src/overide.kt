fun main ()
{
    val generalMobile = Mobile()


    val onePlus = onePlus()
    onePlus.display()
    onePlus.makeCall()
}

open class Mobile (){
open    val name : String = ""
open    val size : Int = 5

  open  fun makeCall () = println("Calling From Mobile")
    fun powerOff ()= println("ShuttingDonw")
 open fun display()=println("Simple Mobile Display")
}

class onePlus : Mobile()
{
    override fun display() = println("One Plus display")
    override fun makeCall() = println("Calling from OnePlus")
}
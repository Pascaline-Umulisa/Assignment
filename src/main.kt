fun main(){
    val name= "Pascaline"
    println("Hello"+" "+name)

    var x=getmodulus(47,6)
    println(x)
    var f=addition(9,7,2,56)
    println(f)
    interestingfact()

}
fun getmodulus(a:Int, b:Int):Int{
    var modulus=a%b
    return modulus
}
fun addition(numb1:Int, numb2:Int,numb3:Int,numb4:Int):Int{
    var sum=numb1+numb2+numb3+numb4
    return sum

}
fun interestingfact(){
    var fact="I can spend hours having a conversation with myself"
    println(fact)
}
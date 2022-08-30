val name: String = "Aly" // one time assign

var nullName: String? = "asd"

fun main() {
    println("Hello, world!!!")
    
    var name2: String = "Aly2" // many time assigneable
    name2 = "aly2"
    nullName = null
    println(name)
    println(name2)
    
    
    if(nullName != null){
        println(nullName)
    }else{
        println(name2)
    }
    
    //burda when içerisinde switch mantığı gibi 
    //verdiğimiz değerden gelen değerlere göre kontrol yapabiliyoruz
    when(nullName){
        null-> println("it is null")
        else -> println("not null")
    }
    // burda bir değişkene değer atamak için sorgu yapabiliyoruz
    // sorgu sonucunu değişkende tutabiliyoruz
    val ifValue = if(nullName != null) name2 else "its null"
    println(ifValue)
    
    //aynı işlemi burda when ile de yapabiliyoruz
    val whenValue =when(nullName){
        null -> "its null bruh"
        else -> name2
    }
    println(whenValue)
    
    
    
    
}

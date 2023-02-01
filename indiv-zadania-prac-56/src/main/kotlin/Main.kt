fun main(args: Array<String>) {
    // сам.работа задание 2
    /*try {
        println("Введите трехзначное число")
        var num:Int
        var ed:Int
        var des:Int
        var sot:Int
        num= readln().toInt()
        if(num>99 && num <1000){
            sot=num/100
            des=(num/10)%10
            ed=num%10
            if(ed==des && des == sot){
                println("В числе все цифры одинаковы")
            }
            else println("В числе цифры неодинаковы")
        }
        else println("Введите трехзначное число!!!")
    }
    catch (e:Exception){
        println(e.message)
    }*/

        // сам.работа задание 2
    try{
        println("Введите стороны прямоугольного отверстия")
        var a:Int
        var b:Int
        a= readln().toInt()
        b= readln().toInt()
        println("Введите величины ребер кирпича")
        var x:Int
        var y:Int
        var z:Int
        x=readln().toInt()
        y=readln().toInt()
        z= readln().toInt()
        if(((a>=x) and (b>=y))or((a>=y) and (b>=x))or
            ((a>=x) and (b>=z)) or ((a>=z) and (b>=x))or
            ((a>=z)and (b>=y)) or ((a>=y) and (b>=z))){
            println("кирпич влезает")
        }
        else
            println("Кирпич не влезает")

    }catch (ex:Exception){
        println(ex.message)
    }



}
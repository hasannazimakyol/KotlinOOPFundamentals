package com.hnakyol.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Hasan", 24)

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        //Encapsulation
        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())

        println(james.returnBandName("Hasan"))
        println(james.returnBandName("Kirk"))

        //Inheritance

        var lars = SuperMusician("Lars", "Drums", 60)
        println(lars.name)
        println(lars.returnBandName("Hasan"))
        lars.sing()

        //Polymorphism

        //Static Polymorphism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3, 4))
        println(mathematics.sum(4, 5 ,6 ))

        //Dynamic Polymorphism

        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        //Abstract & Interface

        //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda Expressions

        fun printString(myString: String) {
            println(myString)
        }

        printString("My Test String")

        val testString = {myString : String -> println(myString)}

        testString("My Lambda String")

        val multiplyLambda = {a: Int,b: Int -> a * b}
        println(multiplyLambda(4, 5))

        val multiplyLambda2 : (Int, Int) -> Int = {a, b -> a * b}
        println(multiplyLambda2(5,6))

        //Asynchronous

        //Callback function, Listener function, Completion function

        fun downloadMusicians(url: String, completion : (Musician) -> Unit) {

            //url -> Download
            //Data
            val kirkHammett = Musician("Kirk", "Guitar", 60)
            completion(kirkHammett)
        }

        downloadMusicians("metallica.com", {musician ->
            println(musician.name)
        })

    }
}

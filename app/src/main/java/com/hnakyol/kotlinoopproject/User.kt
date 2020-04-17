package com.hnakyol.kotlinoopproject

class User : People{

    //Property
    var name : String? = null
    var age : Int? = null

    //Constructor vs Init
    constructor(nameInput: String, ageInput: Int){

        this.name = nameInput
        this.age = ageInput

    }

    init {
        println("init")
    }







}
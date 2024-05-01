package com.example.filmlerapp.data.entity

import java.io.Serializable

data class Filmler(var id:Int,
                   var ad:String,
                   var resim:String,
                   var fiyat:Int) : Serializable {

}
package com.example.myapplication2.modelo

import android.app.Dialog
import android.content.DialogInterface

class Categoria constructor(id: Int, nombre: String) {
    var nombre = nombre
    var id = id
    override fun toString(): String {
        return nombre
    }
}

package com.timtam.herballist.model

data class Plants (
    val name: String,
    val desc: String,
    val image: Int,
    val category: String,
    val advantages: ArrayList<String>,
    val latinName: String,
    val usage: String
)

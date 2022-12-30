package com.example.kfcmain.adapters.items

interface ListItem
data class Product(val name: String, val price: Int, val image: Int ):ListItem
data class Category(val name: String):ListItem
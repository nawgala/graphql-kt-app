package com.rnd.graphql.graphqlktapp.model

data class Bike(override val name: String, val price: Int): Vehicle

data class IBike(override val name: String, val price: Int): IVehicle

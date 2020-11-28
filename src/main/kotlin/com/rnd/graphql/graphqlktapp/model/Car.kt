package com.example.graphql.features.model

import com.rnd.graphql.graphqlktapp.model.IVehicle
import com.rnd.graphql.graphqlktapp.model.Vehicle

data class Car(override val name: String, val price: Int, val engineType: String) : Vehicle

data class ICar(override val name: String, val price: Int, val engineType: String) : IVehicle

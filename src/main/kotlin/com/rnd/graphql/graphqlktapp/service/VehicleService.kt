package com.rnd.graphql.graphqlktapp.service

import com.example.graphql.features.model.Car
import com.example.graphql.features.model.ICar
import com.rnd.graphql.graphqlktapp.model.Bike
import com.rnd.graphql.graphqlktapp.model.IBike
import com.rnd.graphql.graphqlktapp.model.IVehicle
import com.rnd.graphql.graphqlktapp.model.Vehicle
import org.springframework.stereotype.Service

@Service
class VehicleService {
    fun getVehicles(): List<Vehicle> {
        return listOf(
                Car("BMW X1", 45000, "PETROL"),
                Bike("Ducati", 90000)
        )
    }

    fun getIVehicles(): List<IVehicle> {
        return listOf(
                ICar("BMW X1", 45000, "PETROL"),
                IBike("Ducati", 90000)
        )
    }
}
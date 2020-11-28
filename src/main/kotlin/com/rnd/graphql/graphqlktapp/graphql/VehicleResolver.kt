package com.rnd.graphql.graphqlktapp.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.rnd.graphql.graphqlktapp.model.IVehicle
import com.rnd.graphql.graphqlktapp.model.Vehicle
import com.rnd.graphql.graphqlktapp.service.VehicleService
import org.springframework.stereotype.Component

@Component
class VehicleResolver(private val vehicleService: VehicleService) : GraphQLQueryResolver {
    fun getVehicles(): List<Vehicle> {
        return vehicleService.getVehicles()
    }

    fun getIVehicles(): List<IVehicle> {
        return vehicleService.getIVehicles()
    }
}
package com.rnd.graphql.graphqlktapp.config

import com.coxautodev.graphql.tools.SchemaParserDictionary
import com.example.graphql.features.model.Car
import com.example.graphql.features.model.ICar
import com.rnd.graphql.graphqlktapp.model.Bike
import com.rnd.graphql.graphqlktapp.model.IBike
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GraphQLConfig() {
    @Bean
    fun schemaParserDictionary(): SchemaParserDictionary {
        return SchemaParserDictionary()
                .add(Car::class)
                .add(Bike::class)
                .add(IBike::class)
                .add(ICar::class)
    }
}
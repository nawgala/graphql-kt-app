package com.rnd.graphql.graphqlktapp.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class HelloWorldResolver: GraphQLQueryResolver {
    fun hello(): String {
        return "Hello World!"
    }
}
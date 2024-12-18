package com.example.retrofit // Defines the package for organizing this file

// Imports necessary classes and annotations
import com.plcoding.retrofitcrashcourse.com.example.retrofit.Todo // Imports the Todo data class, representing a single todo item
import retrofit2.Response // Retrofit's Response class, which encapsulates the HTTP response
import retrofit2.http.GET // Retrofit's GET annotation for defining GET HTTP requests

/**
 * Interface to define API endpoints for Retrofit.
 * Retrofit uses this interface to perform network requests.
 */
interface TodoAPI {

    /**
     * Defines an HTTP GET request to the `/todos` endpoint.
     * The full URL becomes `https://jsonplaceholder.typicode.com/todos` when combined with the base URL.
     *
     * @return A Response object containing a list of Todo items.
     *         The function is marked as `suspend` to work with Kotlin Coroutines for asynchronous execution.
     */
    @GET("/todos") // Specifies the HTTP GET request to the `/todos` endpoint
    suspend fun getTodos(): Response<List<Todo>>
    // Returns a Retrofit Response containing a List of Todo objects (parsed from JSON).
}

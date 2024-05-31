package com.marqumil.amphibians.network

import com.marqumil.amphibians.model.Amphibians
import retrofit2.http.GET


interface AmphibiansApiService {

    @GET("/amphibians")
    suspend fun getAmphibians(): List<Amphibians>

}

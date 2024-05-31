package com.marqumil.amphibians.data

import com.marqumil.amphibians.model.Amphibians
import com.marqumil.amphibians.network.AmphibiansApiService


interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibians>
}

class NetworkAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibians> = amphibiansApiService.getAmphibians()

}
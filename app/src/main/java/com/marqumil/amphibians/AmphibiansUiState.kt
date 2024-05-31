package com.marqumil.amphibians

import com.marqumil.amphibians.model.Amphibians


sealed interface AmphibiansUiState {
    data class Success(val photos: List<Amphibians>) : AmphibiansUiState
    data object Error : AmphibiansUiState
    data object Loading : AmphibiansUiState
}
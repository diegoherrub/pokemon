package edu.iesam.pokemon.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.pokemon.domain.ErrorApp
import edu.iesam.pokemon.domain.GetPokemonUseCase
import edu.iesam.pokemon.domain.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonDetailViewModel(
    private val getPokemonUseCase: GetPokemonUseCase
): ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun viewCreated(pokemonId: String){
        viewModelScope.launch(Dispatchers.IO) {
            val pokemon = getPokemonUseCase.invoke(pokemonId)
            _uiState.postValue(UiState(pokemon = pokemon))
        }
    }

    // refleja los estados de la vista
    data class UiState (
        val isLoading: Boolean = false,
        val errorApp: ErrorApp? = null,
        val pokemon: Pokemon? = null
    )
}
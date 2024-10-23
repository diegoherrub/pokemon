package edu.iesam.pokemon.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.pokemon.domain.ErrorApp
import edu.iesam.pokemon.domain.GetPokemonsUseCase
import edu.iesam.pokemon.domain.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PokemonsViewModel(
    private val getPokemonsUseCase: GetPokemonsUseCase
): ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun viewCreated(){
        _uiState.value = (UiState(isLoading = true))

        viewModelScope.launch(Dispatchers.IO) {
            val pokemons = getPokemonsUseCase.invoke()
            delay(5000)
            _uiState.postValue(UiState(pokemons = pokemons))
        }
    }

    // refleja los estados de la vista
    data class UiState (
        val isLoading: Boolean = false,
        val errorApp: ErrorApp? = null,
        val pokemons: List<Pokemon>? = null
    )
}
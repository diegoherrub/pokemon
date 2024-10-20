package edu.iesam.pokemon.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.pokemon.domain.GetPokemonsUseCase
import edu.iesam.pokemon.domain.Pokemon

class PokemonsViewModel(
    private val getPokemonsUseCase: GetPokemonsUseCase
): ViewModel() {

    fun viewCreated(): List<Pokemon> {
        return getPokemonsUseCase.invoke()
    }
}
package edu.iesam.pokemon.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.pokemon.domain.GetPokemonUseCase
import edu.iesam.pokemon.domain.Pokemon

class PokemonDetailViewModel(
    private val getPokemonUseCase: GetPokemonUseCase
): ViewModel() {

    fun viewCreated(pokemonId: String): Pokemon? {

        return getPokemonUseCase.invoke(pokemonId)
    }
}
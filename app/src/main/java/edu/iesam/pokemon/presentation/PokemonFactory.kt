package edu.iesam.pokemon.presentation

import android.content.Context
import edu.iesam.pokemon.data.PokemonDataRepository
import edu.iesam.pokemon.data.local.PokemonXlmLocalDataSource
import edu.iesam.pokemon.data.remote.PokemonMockRemoteDataSource
import edu.iesam.pokemon.domain.GetPokemonUseCase
import edu.iesam.pokemon.domain.GetPokemonsUseCase

class PokemonFactory(private val context: Context) {
    private val pokemonMockRemote = PokemonMockRemoteDataSource()
    private val pokemonLocal = PokemonXlmLocalDataSource(context)
    private val pokemonDataRepository = PokemonDataRepository(pokemonLocal, pokemonMockRemote)
    private val getPokemonUseCase = GetPokemonUseCase(pokemonDataRepository)
    private val getPokemonsUseCase = GetPokemonsUseCase(pokemonDataRepository)

    fun buildViewModel(): PokemonsViewModel {
        return PokemonsViewModel(getPokemonsUseCase)
    }

    fun buildPokemonDetailViewModel(): PokemonDetailViewModel {
        return PokemonDetailViewModel(getPokemonUseCase)
    }
}
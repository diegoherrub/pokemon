package edu.iesam.pokemon.data

import edu.iesam.pokemon.data.local.PokemonXlmLocalDataSource
import edu.iesam.pokemon.data.remote.PokemonMockRemoteDataSource
import edu.iesam.pokemon.domain.Pokemon
import edu.iesam.pokemon.domain.PokemonRepository

class PokemonDataRepository(
    private val local: PokemonXlmLocalDataSource,
    private val mockRemoteDataSource: PokemonMockRemoteDataSource
): PokemonRepository {

    override fun getPokemon(pokemonId: String): Pokemon? {
        val localPokemon = local.findById(pokemonId)
        if (localPokemon == null) {
            mockRemoteDataSource.getPokemon(pokemonId)?.let {
                local.save(it)
                return it
            }
        }
        return localPokemon
    }

    override fun getPokemons(): List<Pokemon> {
        val pokemonsFromLocal = local.findAll()
        if (pokemonsFromLocal.isEmpty()) {
            val pokemonsFromRemote = mockRemoteDataSource.getPokemons()
            local.saveAll(pokemonsFromRemote)
            return pokemonsFromRemote
        } else {
            return pokemonsFromLocal
        }
    }
}
package edu.iesam.pokemon.data.local

import android.content.Context
import com.google.gson.Gson
import edu.iesam.pokemon.R
import edu.iesam.pokemon.domain.Pokemon

class PokemonXlmLocalDataSource(private val context: Context) {

    private val sharedPref = context.getSharedPreferences(
        context.getString(R.string.pokemon_file_xml), Context.MODE_PRIVATE
    )

    private val gson = Gson()

    fun save(pokemon: Pokemon) {
        val editor = sharedPref.edit()
        editor.putString(pokemon.id, gson.toJson(pokemon))
        editor.apply()
    }

    fun saveAll(pokemons: List<Pokemon>) {
        val editor = sharedPref.edit()
        pokemons.forEach { pokemon ->
            editor.putString(pokemon.id, gson.toJson(pokemon))
        }
        editor.apply()
    }

    fun findById(pokemonId: String): Pokemon? {
        return sharedPref.getString(pokemonId,null)?.let { pokemon ->
            gson.fromJson(pokemon, Pokemon::class.java)
        }
    }

    fun findAll(): List<Pokemon> {
        val pokemons = ArrayList<Pokemon>()
        val mapPokemons = sharedPref.all
        mapPokemons.values.forEach { jsonPokemon ->
            val pokemon = gson.fromJson(jsonPokemon as String, Pokemon::class.java)
            pokemons.add(pokemon)
        }
        return pokemons
    }
}
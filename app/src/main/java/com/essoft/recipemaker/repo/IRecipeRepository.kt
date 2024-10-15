package com.essoft.recipemaker.repo

import com.essoft.recipemaker.model.DbRecipeModel
import com.essoft.recipemaker.model.RecipeModel
import kotlinx.coroutines.flow.Flow

interface IRecipeRepository {
    suspend fun getAllRecipes(): Flow<List<DbRecipeModel>>

    suspend fun createRecipe(dbRecipe: DbRecipeModel)

    suspend fun readRecipe(): Flow<DbRecipeModel>

    suspend fun updateRecipe(recipe: RecipeModel)

    suspend fun deleteRecipe(id: Long): Boolean

    suspend fun saveRecipeImageToLocal(uri: String): String
}
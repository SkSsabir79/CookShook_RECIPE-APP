// RecipeDetailActivity.kt
package sabir.android.cookshook

import Recipe
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipe = intent.getParcelableExtra<Recipe>("recipe")

        val recipeImageView: ImageView = findViewById(R.id.detailRecipeImageView)
        val recipeNameTextView: TextView = findViewById(R.id.detailRecipeNameTextView)
        val recipeTimeTextView: TextView = findViewById(R.id.detailRecipeTimeTextView)
        val recipeIngredientsTextView: TextView = findViewById(R.id.detailRecipeIngredientsTextView)
        val recipeProcessTextView: TextView = findViewById(R.id.detailRecipeProcessTextView)

        recipe?.let {
            recipeImageView.setImageResource(it.image)
            recipeNameTextView.text = it.name
            recipeTimeTextView.text = "Time to make: ${it.time}"
            recipeIngredientsTextView.text = "Ingredients:\n${it.ingredients.joinToString("\n")}"
            recipeProcessTextView.text = "Process:\n${it.process}"
        }
    }
}

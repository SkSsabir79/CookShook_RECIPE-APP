// RecipeAdapter.kt
package sabir.android.cookshook

import Recipe
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sabir.android.cookshook.databinding.ItemRecipeBinding

class RecipeAdapter(private val recipes: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val binding = ItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipes[position])
    }

    override fun getItemCount() = recipes.size

    inner class RecipeViewHolder(private val binding: ItemRecipeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(recipe: Recipe) {
            binding.recipeImageView.setImageResource(recipe.image)
            binding.recipeNameTextView.text = recipe.name

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, RecipeDetailActivity::class.java)
                intent.putExtra("recipe", recipe)
                binding.root.context.startActivity(intent)
            }
        }
    }
}

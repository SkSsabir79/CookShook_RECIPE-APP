// RecipeRepository.kt
package sabir.android.cookshook

import Recipe

object RecipeRepository {
    val recipes = listOf(
        Recipe(
            "Shahi Paneer",
            R.drawable.shahi_paneer,
            listOf("Paneer", "Cream", "Tomato", "Onion", "Spices"),
            "30 mins",
            "\n" +
                    "Cooking:\n" +
                    "\n" +
                    "Heat oil in a pan and add cumin seeds. Once they splutter, add the onion paste and cook until golden brown.\n" +
                    "Add ginger-garlic paste and cook for another 2 minutes.\n" +
                    "Add tomato puree, turmeric powder, red chili powder, and salt. Cook until the oil starts to separate from the masala.\n" +
                    "Add a cup of water and bring it to a boil. Let it simmer for 5 minutes.\n" +
                    "Add paneer cubes and mix well. Cook for 5-7 minutes, allowing the paneer to absorb the flavors.\n" +
                    "Add garam masala and kasuri methi. Stir well and cook for an additional 2 minutes.\n" +
                    "Garnish with fresh cream and chopped coriander leaves.\n" +
                    "Serving:\n" +
                    "\n" +
                    "Serve hot with naan or rice.\n"
        ),
        Recipe(
            "Dal Makhani",
            R.drawable.dal_makhani,
            listOf("Black lentils", "Kidney beans", "Butter", "Cream", "Tomato", "Spices"),
            "45 mins",
            "Preparation:\n" +
                    "\n" +
                    "Soak black lentils (urad dal) and kidney beans (rajma) overnight.\n" +
                    "Drain and rinse them.\n" +
                    "Cooking:\n" +
                    "\n" +
                    "Pressure cook the lentils and kidney beans with enough water until they are soft (about 7-8 whistles).\n" +
                    "Heat oil in a pan and add cumin seeds. Once they splutter, add finely chopped onions and cook until golden brown.\n" +
                    "Add ginger-garlic paste and cook for 2 minutes.\n" +
                    "Add tomato puree, turmeric powder, red chili powder, and salt. Cook until the masala thickens and oil separates.\n" +
                    "Add the cooked lentils and beans, and mix well. Add water if needed to achieve the desired consistency.\n" +
                    "Simmer on low heat for 20-30 minutes, stirring occasionally.\n" +
                    "Add cream and cook for another 5 minutes.\n" +
                    "Garnish with fresh coriander leaves.\n" +
                    "Serving:\n" +
                    "\n" +
                    "Serve hot with butter naan or rice."
        ),
        Recipe(
            "Soya Chaap",
            R.drawable.soya_chaap,
            listOf("Soya chaap", "Yogurt", "Spices", "Onion", "Tomato"),
            "40 mins",
            "Preparation:\n" +
                    "\n" +
                    "Cut soya chaap into pieces and marinate with yogurt, ginger-garlic paste, red chili powder, turmeric powder, and salt. Let it marinate for at least 1 hour.\n" +
                    "Cooking:\n" +
                    "\n" +
                    "Heat oil in a pan and cook the marinated soya chaap pieces until they are golden brown and cooked through.\n" +
                    "In another pan, heat oil and add cumin seeds. Once they splutter, add chopped onions and cook until golden brown.\n" +
                    "Add ginger-garlic paste and cook for 2 minutes.\n" +
                    "Add tomato puree, turmeric powder, red chili powder, and salt. Cook until the oil starts to separate from the masala.\n" +
                    "Add the cooked soya chaap pieces to the masala and mix well. Cook for another 5 minutes.\n" +
                    "Add garam masala and chopped coriander leaves. Stir well.\n" +
                    "Serving:\n" +
                    "\n" +
                    "Serve hot with roti or rice.\n"
        ),
        Recipe(
            "Kadi Pakoda",
            R.drawable.kadi_pakoda,
            listOf("Gram flour", "Yogurt", "Spices", "Onion", "Oil"),
            "35 mins",
            "Preparation:\n" +
                    "\n" +
                    "For the pakoras: Mix gram flour (besan) with spices (cumin seeds, red chili powder, turmeric powder, salt) and water to make a thick batter. Add chopped onions and green chilies if desired. Drop spoonfuls of the batter into hot oil and fry until golden brown. Drain on paper towels.\n" +
                    "Cooking Kadhi:\n" +
                    "\n" +
                    "Heat oil in a pan and add cumin seeds and mustard seeds. Once they splutter, add chopped onions and cook until golden brown.\n" +
                    "Add ginger-garlic paste and cook for 2 minutes.\n" +
                    "Add yogurt and gram flour (besan) mixture to the pan. Mix well and cook for 5 minutes.\n" +
                    "Add water to achieve the desired consistency and bring it to a boil. Let it simmer for 10-15 minutes.\n" +
                    "Add the fried pakoras to the kadhi and let it simmer for another 10 minutes, allowing the pakoras to absorb the flavors.\n" +
                    "Serving:\n" +
                    "\n" +
                    "Serve hot with steamed rice."
        )
    )
}

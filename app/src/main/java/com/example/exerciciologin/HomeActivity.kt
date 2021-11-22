package com.example.exerciciologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciologin.model.Prato
import com.example.exerciciologin.model.Restaurante

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initComponents()
    }

    private fun initComponents() {
        val restauranteList = initMenu()

        findViewById<RecyclerView>(R.id.rvRestauranteMenuList).apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = HomeAdapter(restauranteList, this.context as HomeActivity)
        }
    }
    private fun initMenu(): MutableList<Restaurante>{

        val pratoList = mutableListOf(Prato(),Prato(),Prato(),Prato(),Prato(),Prato(),Prato(),Prato())

        val item1 = Restaurante("https://c.pxhere.com/photos/c8/ea/appetizer_bowl_delicious_dish_epicure_food_fries_guacamole-1557385.jpg!d","Tony Roma's", "Av. Lavandisca, 717 - Indianápolis, São Paulo","Fecha às 22:00", pratoList)
        val item2 = Restaurante("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Good_Food_Display_-_NCI_Visuals_Online.jpg/1024px-Good_Food_Display_-_NCI_Visuals_Online.jpg","Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema","Fecha às 00:00", pratoList)
        val item3 = Restaurante("https://c.pxhere.com/photos/0c/a0/meat_plate_ketchup_frits_eat_calories_french_food-664514.jpg!d","Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 00:00", pratoList)
        val item4 = Restaurante("https://c.pxhere.com/photos/3d/86/hamburger_food_meal_tasty_dining_lunch_citizen_luncheon-927054.jpg!d","Sí Señor!", "Alameda Jauaperi, 626 - Moema","Fecha às 01:00", pratoList)

        return mutableListOf(item1, item2, item3, item4)
    }

}
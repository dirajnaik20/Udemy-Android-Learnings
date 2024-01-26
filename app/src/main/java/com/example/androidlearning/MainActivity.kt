package com.example.androidlearning

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //using List
    //val fruitList= listOf<String>("Apple","Banana","Guava","Mango","Pear","Lemon","Orange")
    val fruitList = listOf<Fruit>(
        Fruit("Apple", "Alex"), Fruit("Banana", "Fayaz"),
        Fruit("Guava", "Vistar"), Fruit("Mango", "Ashvin"), Fruit("Pear", "Alex"),
        Fruit("Lemon", "Fayaz"), Fruit("Orange", "Vistar")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        myRecyclerView.setBackgroundColor(Color.YELLOW)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = MyRecyclerViewAdapter(fruitList) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(
            this@MainActivity, "Item Selected: ${fruit.name}",
            Toast.LENGTH_LONG
        ).show()
    }
}
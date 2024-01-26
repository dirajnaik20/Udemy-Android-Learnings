package com.example.androidlearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView.OnChildClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(private val fruitList: List<Fruit>,private val clickListener:(Fruit)->Unit) :
    RecyclerView.Adapter<MyRecyclerViewHolder>() {

    //val fruitList= listOf<String>("Apple","Banana","Guava","Mango","Pear","Lemon","Orange")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listView = layoutInflater.inflate(R.layout.list_view, parent, false)

        return MyRecyclerViewHolder(listView)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyRecyclerViewHolder, position: Int) {

        val fruit = fruitList[position]
        holder.bind(fruit,clickListener)
    }
}

class MyRecyclerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(fruit: Fruit,clickListener:(Fruit)->Unit) {
        val tvName = view.findViewById<TextView>(R.id.tvName)
        tvName.text = fruit.name

        view.setOnClickListener{
            clickListener(fruit)
        }

    }


}
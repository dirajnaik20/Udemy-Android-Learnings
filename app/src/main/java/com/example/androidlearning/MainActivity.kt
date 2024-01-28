package com.example.androidlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidlearning.databinding.ActivityMainBinding
import com.example.androidlearning.db.Subscriber
import com.example.androidlearning.db.SubscriberDatabase
import com.example.androidlearning.db.SubscriberRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var subscriberViewModel: SubscriberViewModel
    private lateinit var adapter: MyRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val dao = SubscriberDatabase.getInstance(application).subscriberDAO
        val repository = SubscriberRepository(dao)
        val factory = SubscriberViewModelFactory(repository)
        subscriberViewModel = ViewModelProvider(this, factory)[SubscriberViewModel::class.java]
        binding.myViewModel = subscriberViewModel
        binding.lifecycleOwner = this
        initRecyclerView()

        subscriberViewModel.message.observe(this) {
            it.getContentIfNotHandled()?.let {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }

        }


    }

    private fun displaySubscribersList() {
        subscriberViewModel.subscribers.observe(this) {
            Log.i("MYTAG", it.toString())
            adapter.setList(it)
            adapter.notifyDataSetChanged()

        }
    }

    private fun initRecyclerView() {
        binding.subscriberRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter =
            MyRecyclerViewAdapter() { selectedItem: Subscriber -> listItemClicked(selectedItem) }
        binding.subscriberRecyclerView.adapter = adapter
        displaySubscribersList()
    }

    private fun listItemClicked(subscriber: Subscriber) {
        //Toast.makeText(this, "Selected Subscriber is ${subscriber.name}", Toast.LENGTH_LONG).show()
        subscriberViewModel.initUpdateAndDelete(subscriber)
    }


}
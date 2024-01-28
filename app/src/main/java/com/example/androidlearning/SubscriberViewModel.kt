package com.example.androidlearning

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidlearning.db.Subscriber
import com.example.androidlearning.db.SubscriberRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SubscriberViewModel(private val repository: SubscriberRepository) : ViewModel() {

    val subscribers = repository.subscribers

    private var isUpdateOrDelete = false
    private lateinit var subscriberToUpdateOrDelete: Subscriber

    val inputName = MutableLiveData<String>()
    val inputEmail = MutableLiveData<String>()

    val saveOrUpdateButtonText = MutableLiveData<String>()
    val clearAllOrDeleteButtonText = MutableLiveData<String>()

    private val statusMessage=MutableLiveData<Event<String>>()
    val message:LiveData<Event<String>>
        get() = statusMessage

    init {
        saveOrUpdateButtonText.value = "Save"
        clearAllOrDeleteButtonText.value = "Clear All"
    }

    fun saveOrUpdate() {

        if(inputName.value==null){
            statusMessage.value= Event("Please Enter Name!!")
        }
        else if (inputEmail.value==null){
            statusMessage.value= Event("Please Enter Email!!")
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(inputEmail.value!!).matches()){
            statusMessage.value= Event("Please Enter Correct Email!!")
        }
        else{

            if (isUpdateOrDelete) {
                subscriberToUpdateOrDelete.name=inputName.value!!
                subscriberToUpdateOrDelete.email=inputEmail.value!!
                update(subscriberToUpdateOrDelete)
            } else {
                val name = inputName.value!!
                val email = inputEmail.value!!
                insert(Subscriber(0, name, email))
                inputName.value = ""
                inputEmail.value = ""
            }

        }

    }

    fun clearAllOrDelete() {
        if (isUpdateOrDelete) {
            delete(subscriberToUpdateOrDelete)
        } else {
            clearAll()
        }

    }

    fun insert(subscriber: Subscriber) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(subscriber)
        withContext(Dispatchers.Main){
            statusMessage.value= Event("Subscriber inserted successfully")
        }
    }

    fun update(subscriber: Subscriber) = viewModelScope.launch(Dispatchers.IO) {
        repository.update(subscriber)
        withContext(Dispatchers.Main){
            inputName.value = ""
            inputEmail.value = ""
            isUpdateOrDelete = false
            saveOrUpdateButtonText.value = "Save"
            clearAllOrDeleteButtonText.value = "clear All"
            statusMessage.value=Event("Subscriber updated successfully")
        }
    }

    fun delete(subscriber: Subscriber) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(subscriber)
        withContext(Dispatchers.Main){
            inputName.value = ""
            inputEmail.value = ""
            isUpdateOrDelete = false
            saveOrUpdateButtonText.value = "Save"
            clearAllOrDeleteButtonText.value = "clear All"
            statusMessage.value=Event("Subscriber deleted successfully")
        }
    }

    fun clearAll() = viewModelScope.launch(Dispatchers.IO) {
        repository.deleteAll()
        withContext(Dispatchers.Main){
            statusMessage.value=Event("All subscriber deleted successfully")
        }
    }

    fun initUpdateAndDelete(subscriber: Subscriber) {
        inputName.value = subscriber.name
        inputEmail.value = subscriber.email
        isUpdateOrDelete = true
        saveOrUpdateButtonText.value = "Update"
        clearAllOrDeleteButtonText.value = "Delete"
        subscriberToUpdateOrDelete = subscriber

    }

}
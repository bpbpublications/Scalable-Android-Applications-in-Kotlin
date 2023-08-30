package com.example.chapter8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserProfileViewModel : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    fun loadUserData() {
        val user = fetchDataFromDataSource()
        _user.value = user
    }

    private fun fetchDataFromDataSource(): User? {
        return null // Simulate loading user data from a data source
    }
}

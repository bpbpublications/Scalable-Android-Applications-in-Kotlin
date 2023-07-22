package com.aimicor.example.myapplication

import UserService1
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel1 @Inject constructor(
    service: UserService1
) : ViewModel() {
    // ...
}

package com.example.chapter8

import android.R
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(), LoginContract.View {
    private val presenter by lazy {
        LoginPresenter(this, UserModel())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ...
        // Set click listener for login button ...
        findViewById<View>(R.id.button1).setOnClickListener {
            presenter.loginButtonClicked("user", "pwd")
        }
    }

    override fun showLoading() { /* ... */ }
    override fun hideLoading() { /* ... */ }
    override fun showError(message: String) { /* .. */ }
    override fun navigateToHome() { /* .. */ }
}
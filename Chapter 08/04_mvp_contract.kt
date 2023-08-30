package com.example.chapter8

interface LoginContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showError(message: String)
        fun navigateToHome()
    }

    interface Presenter {
        fun loginButtonClicked(name: String, pwd: String)
    }
}

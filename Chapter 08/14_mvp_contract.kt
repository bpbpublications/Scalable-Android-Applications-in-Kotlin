package com.example.chapter8

interface LoginContract1 {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showError(message: String)
        fun navigateToHome()
        fun navigateToHelp()
        fun showPwd()
        // ...
    }

    interface Presenter {
        fun loginButtonClicked(name: String, pwd: String)
        fun helpButtonClicked()
        fun showPwdButtonClicked()
        // ...
    }
}

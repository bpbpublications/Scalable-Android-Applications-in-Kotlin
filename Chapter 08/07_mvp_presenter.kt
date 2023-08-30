package com.example.chapter8

class LoginPresenter(
    private val view: LoginContract.View,
    private val userModel: UserModel
) : LoginContract.Presenter {

    override fun loginButtonClicked(name: String, pwd: String) {
        view.showLoading()
        userModel.login(name, pwd) { result ->
            view.hideLoading()
            result.apply {
                onSuccess { view.navigateToHome() }
                onFailure { view.showError(it.message.orEmpty()) }
            }
        }
    }
}

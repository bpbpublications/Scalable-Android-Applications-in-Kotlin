interface AddToCartUseCaseOutputPort {
    fun onSuccess(response: Response)
    fun onFailure(error: Throwable)
}

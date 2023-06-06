data class DetailResponse(
    val website: Website? = null
)

data class Website(
    val uri: Uri? = null
)

data class Uri(
    val url: String? = null
)

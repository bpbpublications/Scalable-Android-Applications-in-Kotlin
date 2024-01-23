@Serializable
internal data class MarsData(
    val price: Int,
    val id: Int,
    val type: String,
    @SerialName("img_src")
    val imgSrc: String
)

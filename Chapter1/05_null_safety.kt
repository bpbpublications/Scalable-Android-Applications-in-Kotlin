data class DetailDomain(val url: String)

fun responseToDomain(detailResponse: DetailResponse?): DetailDomain {
    return DetailDomain(detailResponse?.website?.uri?.url ?: "")
}

fun responseToDomain1(detailResponse: DetailResponse?): DetailDomain {
    return DetailDomain(detailResponse?.website?.uri?.url.orEmpty())
}

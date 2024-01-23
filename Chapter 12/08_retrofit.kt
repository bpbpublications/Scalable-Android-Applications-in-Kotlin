interface MarsApi {
    @GET("realestate")
    suspend fun getMarsData(): List<MarsData>
}

suspend fun fetchMarsData(): Result<List<MarsData>> {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://mars.udacity.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val marsApi = retrofit.create(MarsApi::class.java)

    return try {
        Result.success(marsApi.getMarsData())
    } catch (e: Throwable) {
        Result.failure(e)
    }
}

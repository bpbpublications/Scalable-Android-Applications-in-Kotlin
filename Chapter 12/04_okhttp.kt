suspend fun fetchMarsData(): Result<List<MarsData>> =
    withContext(Dispatchers.IO) {
        val client = OkHttpClient()
        val request = Request.Builder().url(marsUrl).build()
        val response = client.newCall(request).execute()

        if (response.isSuccessful) response.body?.run {
            Result.success(
                Gson().fromJson(
                    string(),
                    Array<MarsData>::class.java
                ).toList()
            )
        } ?: Result.failure(IOException("Empty response"))
        else Result.failure(IOException(response.message))
    }

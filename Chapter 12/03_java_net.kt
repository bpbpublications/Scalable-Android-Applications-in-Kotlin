suspend fun fetchMarsData(): Result<List<MarsData>> {
    val connection = URL(marsUrl).openConnection() as HttpURLConnection

    try {
        return withContext(Dispatchers.IO) {
            connection.connect()
            if (connection.responseCode == HttpURLConnection.HTTP_OK) {
                Result.success(
                    Gson().fromJson(
                        connection.inputStream.bufferedReader().readText(),
                        Array<MarsData>::class.java
                    ).toList()
                )
            } else {
                Result.failure(IOException(connection.responseMessage))
            }
        }
    } catch (e: Throwable) {
        return Result.failure(e)
    } finally {
        connection.disconnect()
    }
}

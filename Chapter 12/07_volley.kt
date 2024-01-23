suspend fun fetchMarsData(
    context: Context
): Result<List<MarsData>> = suspendCoroutine { result ->
    val queue = Volley.newRequestQueue(context)

    val request = JsonArrayRequest(GET, marsUrl, null, { response ->
        result.resume(
            Result.success(
                Gson().fromJson(
                    response.toString(),
                    Array<MarsData>::class.java
                ).toList()
            )
        )
    }, { error -> result.resume(Result.failure(error)) })

    queue.add(request)
}

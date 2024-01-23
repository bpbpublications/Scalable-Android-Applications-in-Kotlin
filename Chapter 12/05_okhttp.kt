fun fetchMarsData() {
    val client = OkHttpClient()
    val request = Request.Builder().url(marsUrl).build()
    client.newCall(request).enqueue(
        object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call, response: Response) {
                TODO("Not yet implemented")
            }
        }
    )
}

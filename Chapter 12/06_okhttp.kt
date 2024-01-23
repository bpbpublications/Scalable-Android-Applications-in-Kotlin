val content = "some content"

val request: Request = Request.Builder()
    .url(marsUrl)
    .post(content.toRequestBody())
    .build()

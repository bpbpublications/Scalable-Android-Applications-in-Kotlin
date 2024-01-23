...
// When
sut()

// Then
.onSuccess { result ->
    assertEquals(1, result.size)
    assertEquals(expected, result.first())
}

// Else
.onFailure { throw it } // throw the passed "it" param

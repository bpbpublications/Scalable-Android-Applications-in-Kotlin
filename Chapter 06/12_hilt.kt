package com.aimicor.example.myapplication

import javax.inject.Inject

class UserRepository @Inject constructor() {
    // ...
}

class UserService @Inject constructor(
    repository: UserRepository
) {
    // ...
}

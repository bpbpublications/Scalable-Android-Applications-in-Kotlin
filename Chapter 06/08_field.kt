package com.aimicor.example.myapplication

import InMemoryUserRepository
import UserRepository2
import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun getUserRepository(
        injectObject: InMemoryUserRepository
    ): UserRepository2 {
        return injectObject
    }
}

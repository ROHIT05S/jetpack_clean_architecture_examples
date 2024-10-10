package com.example.loginpocusingfirebase.usecase

import com.example.loginpocusingfirebase.domain.AuthenticationRepository
import javax.inject.Inject

class LogoutUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {
        suspend operator fun invoke() = authenticationRepository.logout()
}
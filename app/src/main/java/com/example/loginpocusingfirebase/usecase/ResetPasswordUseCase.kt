package com.example.loginpocusingfirebase.usecase

import com.example.loginpocusingfirebase.domain.AuthenticationRepository
import javax.inject.Inject


class ResetPasswordUseCase @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    suspend operator fun invoke(email: String) = authenticationRepository.resetPassword(email)
}

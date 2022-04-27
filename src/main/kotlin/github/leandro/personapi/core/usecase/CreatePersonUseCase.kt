package github.leandro.personapi.core.usecase

import github.leandro.personapi.core.dto.CreatePersonRequest

interface CreatePersonUseCase {
    fun execute(request: CreatePersonRequest)
}


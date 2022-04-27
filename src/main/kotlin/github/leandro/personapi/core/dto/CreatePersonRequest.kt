package github.leandro.personapi.core.dto

import github.leandro.personapi.core.entity.enum.PersonType

data class CreatePersonRequest(
    val type: PersonType,
    val corporateName: String = ""
)
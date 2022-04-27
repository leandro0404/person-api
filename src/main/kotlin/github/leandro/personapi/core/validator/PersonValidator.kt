package github.leandro.personapi.core.validator

import github.leandro.personapi.core.entity.Person
import github.leandro.personapi.core.entity.enum.PersonType

interface PersonValidator {

    val type : PersonType
    fun valid(person : Person): Boolean
}
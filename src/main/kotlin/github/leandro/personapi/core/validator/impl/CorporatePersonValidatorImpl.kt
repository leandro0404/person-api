package github.leandro.personapi.core.validator.impl

import github.leandro.personapi.core.entity.Person
import github.leandro.personapi.core.entity.enum.PersonType
import github.leandro.personapi.core.validator.PersonValidator
import org.springframework.stereotype.Component


@Component
class CorporatePersonValidatorImpl : PersonValidator {
    override val type: PersonType
        get() = PersonType.CORPORATE

    override fun valid(person: Person): Boolean {
        return false;
    }
}
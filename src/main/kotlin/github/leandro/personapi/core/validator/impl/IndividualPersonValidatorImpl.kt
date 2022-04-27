package github.leandro.personapi.core.validator.impl

import github.leandro.personapi.core.entity.Person
import github.leandro.personapi.core.entity.enum.PersonType
import github.leandro.personapi.core.validator.PersonValidator
import org.springframework.stereotype.Component


@Component
class IndividualPersonValidatorImpl : PersonValidator {

    override val type = PersonType.INDIVIDUAL

    override fun valid(person: Person): Boolean {
       return false;
    }


}
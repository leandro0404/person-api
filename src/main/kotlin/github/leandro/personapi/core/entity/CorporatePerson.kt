package github.leandro.personapi.core.entity

import github.leandro.personapi.core.entity.enum.PersonType

class CorporatePerson : Person(PersonType.CORPORATE) {
    var corporateName: String = ""
}
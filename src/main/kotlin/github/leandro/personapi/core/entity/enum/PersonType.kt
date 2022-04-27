package github.leandro.personapi.core.entity.enum

enum class PersonType(id: Long) {
    INDIVIDUAL(1),
    CORPORATE(2),
    MEI(3),
    INTERNATIONAL(4);

    val id : Long = 0
}
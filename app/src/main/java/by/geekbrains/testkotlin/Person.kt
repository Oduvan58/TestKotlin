package by.geekbrains.testkotlin

object Person {

    private val person = Friend("Pavel", "Yancheuski")

    fun getPerson(): Friend {
        val anotherPerson = person.copy(lastName = "Bond")
        return anotherPerson
    }
}
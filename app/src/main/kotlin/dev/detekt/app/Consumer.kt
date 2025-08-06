package dev.detekt.app

import dev.detekt.utils.Model

class Consumer {
    fun printName(model: Model?) {
        val name = model?.name ?: return

        println("Name: $name")
    }

    private fun validateNames(models: List<Model?>) {
        val transformed = models.mapNotNull {
            val name = it?.name ?: return@mapNotNull null
            val whatever = it?.whatever ?: return@mapNotNull null

            println("Name: $name")
            name to whatever
        }
        println(transformed)
    }
}

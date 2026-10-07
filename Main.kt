fun main() {

    var opcion: Int

    // Creamos el menu
    //Pedimos al usuario que selecciones una de las opciones
    do {
        println()
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Calcular resto")
        println("6. Salir")
        print("Selecciona una opción: ")

        //Leemos la opcion que a seleccionao la persona
        opcion = readln().toIntOrNull() ?: 0

        //Dependiendo de la opcion que seleccione, q ejecute una u otra
        when (opcion) {
            //SUma
            1 -> {
                print("Escribe un número: ")
                val numero1 = readln().toDoubleOrNull()

                print("Escribe otro número: ")
                val numero2 = readln().toDoubleOrNull()

                if (numero1 != null && numero2 != null) {
                    val resultado = numero1 + numero2
                    println("El resultado de la suma es: $resultado")
                } else {
                    println("Error: debes introducir números válidos.")
                }
            }

            //Resta
            2 -> {
                print("Introduce el primer número: ")
                val numero1 = readln().toDoubleOrNull()

                print("Introduce el segundo número: ")
                val numero2 = readln().toDoubleOrNull()

                if (numero1 != null && numero2 != null) {
                    val resultado = numero1 - numero2
                    println("El resultado de la resta es: $resultado")
                } else {
                    println("Error: debes introducir números válidos.")
                }
            }

            //Multiplicación
            3 -> {
                print("Introduce el primer número: ")
                val numero1 = readln().toDoubleOrNull()

                print("Introduce el segundo número: ")
                val numero2 = readln().toDoubleOrNull()

                if (numero1 != null && numero2 != null) {
                    val resultado = numero1 * numero2
                    println("El resultado de la multiplicación es: $resultado")
                } else {
                    println("Error: debes introducir números válidos.")
                }
            }

            //Dividir
            4 -> {
                print("Introduce el primer número: ")
                val numero1 = readln().toDoubleOrNull()

                print("Introduce el segundo número: ")
                val numero2 = readln().toDoubleOrNull()

                if (numero1 != null && numero2 != null) {

                    if (numero2 != 0.0) {
                        val resultado = numero1 / numero2
                        println("El resultado de la división es: $resultado")
                    } else {
                        println("Error: no se puede dividir entre cero.")
                    }

                } else {
                    println("Error: debes introducir números válidos.")
                }
            }

            //Calcular resto
            5 -> {
                print("Introduce el primer número: ")
                val numero1 = readln().toDoubleOrNull()

                print("Introduce el segundo número: ")
                val numero2 = readln().toDoubleOrNull()

                if (numero1 != null && numero2 != null) {

                    if (numero2 != 0.0) {
                        val resultado = numero1 % numero2
                        println("El resto de la división es: $resultado")
                    } else {
                        println("Error: no se puede calcular el resto con cero.")
                    }

                } else {
                    println("Error: debes introducir números válidos.")
                }
            }

            //salir
            6 -> {
                println("Terminado")
            }

            else -> {
                println("Error: opción no válida.")
            }
        }

    } while (opcion != 6)
}
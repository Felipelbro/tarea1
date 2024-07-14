###Variables
En Kotlin, puedes definir variables mutables (que se pueden cambiar) usando var y variables inmutables (que no se pueden cambiar) usando val.

// Variable mutable
var nombre: String = "Juan"

// Variable inmutable
val edad: Int = 30

##Constantes
Para definir constantes, puedes usar la palabra clave const en combinación con val. Las constantes deben ser de tipo primitivo y su valor debe ser conocido en tiempo de compilación.

const val PI: Double = 3.14159

##Opcionales

Las variables opcionales (nullable) se definen agregando un signo de interrogación (?) al tipo. Esto indica que la variable puede contener un valor null.

var direccion: String? = null

##Manejo de Nudos

Kotlin proporciona varias formas de manejar nulos de manera segura, como el operador de llamada segura "?.", el operador Elvis "?":, y el operador de no nulo "!!"

// Llamada segura
val longitud: Int? = direccion?.length

// Operador Elvis
val longitudNoNull: Int = direccion?.length ?: 0

// Operador de no nulo (lanza una excepción si es null)
val longitudForzada: Int = direccion!!.length

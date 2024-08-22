# ManipulandoDatosJava
Solution homework class 3

# ¿Qué diferencias hay entre castear y parsear?
La principal diferencia es que castear es cuando convierto un objeto de una clase a otra clase, siempre y cuando estén relacionadas, como una subclase y su clase padre. Por ejemplo, si tengo un objeto Animal y quiero convertirlo en un objeto Perro, puedo hacer un casting.
Parsear es cuando convierto una cadena de texto en un objeto de una clase específica, como un número o una fecha. Por ejemplo, si tengo una cadena que dice "123" y quiero convertirla en un número entero, puedo parsearla.

# ¿En qué situaciones sería útil utilizar cada uno de estos procesos?
Para "Castear" es útil cuando necesito acceder a métodos o propiedades específicas de una subclase a partir de una referencia de la clase padre. Por ejemplo, si tengo un objeto Animal y quiero llamar al método Saltar() que solo está disponible en la clase Kanguro, necesito hacer un casting para convertir el objeto Animal en un objeto Kanguro.

Para "Parsear" es útil cuando necesito leer datos de un archivo de texto o de una entrada del usuario y convertirlos en objetos de una clase específica. Por ejemplo, si estoy leyendo un archivo de texto que contiene números y quiero convertirlos en objetos Integer, necesito parsear la cadena de texto "String".

# ¿Qué aspectos debes tener en cuenta al realizar un casteado?
Asegurarme de que la clase de destino sea una subclase de la clase origen, para que el casting sea válido. También que el objeto no sea null antes de realizar el casting, porque si lo es, me dará un error.

Además, es buena práctica utilizar el operador instanceof para verificar si el objeto es una instancia de la clase destino antes de realizar el casting, para evitar errores en tiempo de ejecución.

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tarea semana 3");

        // a) Declaración de variables:
        byte edad_1 = 25; //declaración de variables segun la cantidad de bits (Wrapper classes)
        short codigo_Postal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true; //declaración de unavariable con valor logico

        System.out.println("Edad: " + edad_1); //impresion en pantalla de todas la variables
        System.out.println("Código Postal: " + codigo_Postal);
        System.out.println("Salario: " + salario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Es mayor de edad: " + esMayorDeEdad);
        //result 

        // b) Uso de clases envolventes(Wrapper classes):
        byte edad_2 = 25; // variable primitiva byte
        Byte edadObj = edad_2; // comportamiento byte -> Byte
        byte edadAgain = edadObj; // comportamiento: Byte -> byte

        double new_salario = 5000.0; // variable primitiva double
        Double salarioObj = new_salario; // comportamiento: double -> Double

        // utilizamos el nombre ya declarado arriba
        System.out.println(nombre.toString()); // imprime "Juan Pérez"

        System.out.println("Edad: " + edadAgain); // variable primitiva 
        System.out.println("Salario: " + salarioObj); //valor de salario tipo Double

        // c) Casteo de datos:
        // Convertimos la variable salario a un valor int
        int salarioInt = (int) salario; // casteo: double -> int
        System.out.println("Salario como entero: " + salarioInt); //imprimimos la convertido

        // Convertimos la variable codigoPostal a un valor long
        long codigoPostalLong = codigo_Postal; // casteo: short -> long
        System.out.println("Código Postal como long: " + codigoPostalLong); //imprimimos lo convertido

        // d) Parseo de datos:
        String numeroStr = "12345678"; // decalración variable 
        int numeroInt = Integer.parseInt(numeroStr); // convertimos de String -> int

        String decimalStr = "3.14159"; // decalración variable
        double decimalValor = Double.parseDouble(decimalStr);//convertimos de String -> Double

        System.out.println("Valor de numeroInt: " + numeroInt); //impresión de lo convertido 
        System.out.println("Valor de decimalValor: " + decimalValor);//impresión de lo convertido 
        //resultado del codigo con todas las fases:
        /*Tarea semana 3
        Edad: 25
        Código Postal: 12345
        Salario: 3500.0
        Nombre: Juan Pérez
        Es mayor de edad: true
        Juan Pérez
        Edad: 25
        Salario: 5000.0
        Salario como entero: 3500
        Código Postal como long: 12345
        Valor de numeroInt: 12345678
        Valor de decimalValor: 3.14159
         */       
    }
}
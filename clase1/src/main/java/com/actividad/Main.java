package com.actividad;

public class Main {
    public static void main(String[] args) {
        // declaracion de variables de tipo int y double
        int numEntero = 10;
        System.out.println("el numero es:" + numEntero);
        double numDecimal = 5.5;
        System.out.println("el numero decimal es:" + numDecimal);

        // declaracion de variables siguiendo el lowerCamelCase
        String nombreCompleto = "Andres Garcia";
        System.out.println("el nombre es:" + nombreCompleto);

        // Estilos de convención de codificación, lowerCamelCase y PascalCase
        String NombresConApellidos = "Juan Andres Jaramillo Garcia";
        System.out.println("su informacion es: " + NombresConApellidos);

        // estilo de codificacion con snake_case
        String año_nacimiento = "1990";
        System.out.println("tu año de nacimiento es: " + año_nacimiento);

        // kebab-case no es válido porque el guion se interpreta como operador de resta.
        // Ejemplo no válido: String nombre-persona = "Juan";
        // causa error

        // tipo de datos primitivos
        byte edad = 25;
        short año = 2025;
        int cantidad = 1500;
        long distancia = 123456789L;
        float altura = 1.75f;
        double peso = 70.5;
        boolean esMayor = true;
        char inicial = 'A';
        // imprimir valores
        System.out.println("La edad es: " + edad);
        System.out.println("El año es: " + año);
        System.out.println("La cantidad es: " + cantidad);
        System.out.println("La distancia es: " + distancia);
        System.out.println("La altura es: " + altura);
        System.out.println("El peso es: " + peso);
        System.out.println("Es mayor de edad: " + esMayor);
        System.out.println("La inicial es: " + inicial);

        // Operación aritmética básica
        int suma = 5 + 3;
        System.out.println("Suma de 5 + 3 = " + suma);

        // uso de booleanos en una condicion if-else
        boolean esAdulto = edad > 18;
        if (esAdulto) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }

        // tipos de datos no primitivos
        String saludo = "Hola, bienvenido a Java!";
        System.out.println(saludo);

        // uso de arreglos
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 21;
        numeros[2] = 36;

        // Imprimir los valores del arreglo
        System.out.println("Valores del arreglo:");
        System.out.println("Posición 0: " + numeros[0]);
        System.out.println("Posición 1: " + numeros[1]);
        System.out.println("Posición 2: " + numeros[2]);

        
         // Crear una instancia de Persona
        Persona persona1 = new Persona("Andrés García", 25);
        persona1.mostrarDatos();

        //operaciones aritmeticas basicas
        int num1= 15;
        int num2= 5;

        int sum = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int divisionEntera = num1 / num2;
        int modulo = num1 % num2; 

        // imprimir resultados
        System.out.println("=== Operaciones Aritméticas ===");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + divisionEntera);
        System.out.println("Módulo (resto): " + modulo);

        //division con decimal y con entero del mismo par de numeros
        int division_entera = num1 / num2;
        double divisionDecimal = (double) num1 / num2;
        System.out.println("division con decimal: " + divisionDecimal);
        System.out.println("division con entero: " + division_entera);

        // incremento y decremento
        int valor = 2;
        System.out.println("Valor inicial: " + valor);
        valor++; // incremento
        System.out.println("Después del incremento: " + valor);
        valor--; // decremento
        System.out.println("Después del decremento: " + valor);

        // uso de comparadores de asignacion
        //+= y -=
        int numero1 = 10;
        System.out.println("numero inicial: " + numero1);
        numero1 += 5;
        System.out.println("numero después de += 5: " + numero1);
        numero1 -= 3;
        System.out.println("numero después de -= 3: " + numero1);

        // *= y  /=
        int numero2 = 10;
        System.out.println("numero2 inicial: " + numero2);
        numero2 *= 2;
        System.out.println("numero2 después de *= 2: " + numero2);
        numero2 /= 5;
        System.out.println("numero2 después de /= 5: " + numero2);

        // %=
        int numero3 = 10;
        System.out.println("numero3 inicial: " + numero3);
        numero3 %= 3;
        System.out.println("numero3 después de %= 3: " + numero3);

        // operadores de comparacion
        // == y !=
        int a = 6;
        int b = 4;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // >, <, >=, <=
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // if else
        int finAño = 2025;
        if (finAño == 2026) {
            System.out.println("el año es 2026");
        } else {
            System.out.println("el año no es 2026");
        }

        //operadores logicos
        // expresion && y || con boolenos
        boolean condicion1 = true;
        boolean condicion2 = false;
        System.out.println("condicion1 && condicion2: " + (condicion1 && condicion2));
        System.out.println("condicion1 || condicion2: " + (condicion1 || condicion2));

        // uso de ! con booleanos
        boolean condicion3 = true;
        System.out.println("negar condicion3: " + (!condicion3));

        // una combinacion de operadores logicos y condicion compuesta
        boolean resultado = (a > b) && (condicion1 || !condicion2);
        System.out.println("resultado de la combinacion: " + resultado);

        // el uso de if, de if-else y de if-else if-else
        //if
        int notaFinal = 85;
        if (notaFinal > 70){
            System.out.println("aprobado");
        } 
        //if-else
        if (notaFinal < 70){
            System.out.println("reprobado");
        } else {
            System.out.println("aprobado");
            
        }

        //if-else if-else
        if (notaFinal >= 90){
            System.out.println("excelente");
        } else if (notaFinal >= 70){
            System.out.println("aprobado");
        } else {
            System.out.println("reprobado");
        }

        // operador ternario
        String resultadoFinal = (notaFinal >= 70) ? "aprovado" : "reprobado";
        System.out.println("el resultado final es: " + resultadoFinal);

        // switch-case
    }

    // creacion de una clase de nombre Persona
     static class Persona {
        String nombre;
        int edad;

        // constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        // metodo para mostrar la informacion
        public void mostrarDatos(){
            System.out.println("nombre:" + nombre + ",edad:" + edad);
        }
    }
}


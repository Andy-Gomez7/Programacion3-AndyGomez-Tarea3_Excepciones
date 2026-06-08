# Programacion3-AndyGomez-Tarea3_Excepciones

# Manejo de Excepciones en Java

## Andy Delcio Gomez Moya

## Matrícula: 1000-6215

## Materia: Programación 3

## Descripcion:
Desarrollar una aplicación en Java que permita registrar usuarios, validando la información ingresada y aplicando técnicas robustas de manejo de errores. El propósito de esta tarea es reforzar los conceptos del capítulo de Excepciones:
- try
- catch
- múltiples catch.
- Bloque finally.
- throw
- throws.
- Excepciones personalizadas.
- getMessage().

Una empresa necesita un sistema interactivo de consola para registrar usuarios en su plataforma. El programa solicita información personal (Nombre, Edad, Correo electrónico y Salario mensual) y debe garantizar, antes de cualquier registro, que todos los datos cumplen con reglas de negocio estrictas.

## Validacion:
En un metodo con la firma: public static void validar(String nombre, int edad, String correo, double salario) throws Exception se realizaran todas las validaciones.

## Validaciones requeridas:

- Nombre: No puede estar vacío y debe tener al menos 3 caracteres.

- **Edad:** Debe estar en el rango de 18 a 100 años.

- **Correo Electrónico:** Debe contener obligatoriamente los caracteres @ y .

- **Salario:** Debe ser estrictamente mayor que 0 (ej. -5000 es inválido).

## Requisitos Técnicos

**Excepciones Personalizadas:**
    - NombreInvalidoException
    - EdadInvalidaException
    - CorreoInvalidoException
    - SalarioInvalidoException
    
**Manejo de InputMismatchException:**
para controlar cuando el usuario introduce texto en lugar de numeros.

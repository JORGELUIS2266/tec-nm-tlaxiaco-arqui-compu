/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package general.arquitetura;

import java.util.Scanner;

public class ConversionOctalDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1: Octal a Decimal");
        System.out.println("2: Decimal a Octal");
        System.out.println("3: Binario a Decimal");
        System.out.println("4: Decimal a Binario");
        System.out.println("5: Hexadecimal a Decimal");
        System.out.println("6: Decimal a Hexadecimal");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un número octal: ");
                String octal = scanner.next();
                int decimalDesdeOctal = Integer.parseInt(octal, 8);
                System.out.println("El número en decimal es: " + decimalDesdeOctal);
                break;

            case 2:
                System.out.print("Ingrese un número decimal: ");
                int dec = scanner.nextInt();
                String oct = Integer.toOctalString(dec);
                System.out.println("El número en octal es: " + oct);
                break;

            case 3:
                System.out.print("Ingrese un número binario: ");
                String binario = scanner.next();
                int decimalDesdeBinario = Integer.parseInt(binario, 2);
                System.out.println("El número en decimal es: " + decimalDesdeBinario);
                break;

            case 4:
                System.out.print("Ingrese un número decimal: ");
                int decimalABinario = scanner.nextInt();
                String bin = Integer.toBinaryString(decimalABinario);
                System.out.println("El número en binario es: " + bin);
                break;

            case 5:
                System.out.print("Ingrese un número hexadecimal: ");
                String hexadecimal = scanner.next();
                int decimalDesdeHexadecimal = Integer.parseInt(hexadecimal, 16);
                System.out.println("El número en decimal es: " + decimalDesdeHexadecimal);
                break;

            case 6:
                System.out.print("Ingrese un número decimal: ");
                int decimalAHexadecimal = scanner.nextInt();
                String hex = Integer.toHexString(decimalAHexadecimal).toUpperCase();
                System.out.println("El número en hexadecimal es: " + hex);
                break;

            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}    

/*
Explicación del Código:
Opciones de Conversión:

1: Octal a Decimal: Convierte un número octal a su equivalente en decimal.
2: Decimal a Octal: Convierte un número decimal a su equivalente en octal.
3: Binario a Decimal: Convierte un número binario a su equivalente en decimal.
4: Decimal a Binario: Convierte un número decimal a su equivalente en binario.
5: Hexadecimal a Decimal: Convierte un número hexadecimal a su equivalente en decimal.
6: Decimal a Hexadecimal: Convierte un número decimal a su equivalente en hexadecimal.
Métodos Utilizados:

Integer.parseInt(value, base) se usa para convertir un número desde su representación en octal,
binario o hexadecimal a decimal.
Integer.toOctalString(value), Integer.toBinaryString(value) y Integer.toHexString(value)
se usan para convertir un número decimal a octal, binario o hexadecimal respectivamente.
Uso:

Al ejecutar el programa, selecciona la opción de conversión deseada e ingresa
el número en el sistema numérico correspondiente. El programa te mostrará el resultado de la conversión.



Ejemplo 1: Octal a Decimal
Entrada: Seleccionas la opción 1 e ingresas el número octal 17.
Proceso: El número octal 17 se convierte a decimal.
Salida: El número en decimal es: 15
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
1
Ingrese un número octal: 17
El número en decimal es: 15
Ejemplo 2: Decimal a Octal
Entrada: Seleccionas la opción 2 e ingresas el número decimal 64.
Proceso: El número decimal 64 se convierte a octal.
Salida: El número en octal es: 100
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
2
Ingrese un número decimal: 64
El número en octal es: 100
Ejemplo 3: Binario a Decimal
Entrada: Seleccionas la opción 3 e ingresas el número binario 1010.
Proceso: El número binario 1010 se convierte a decimal.
Salida: El número en decimal es: 10
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
3
Ingrese un número binario: 1010
El número en decimal es: 10
Ejemplo 4: Decimal a Binario
Entrada: Seleccionas la opción 4 e ingresas el número decimal 23.
Proceso: El número decimal 23 se convierte a binario.
Salida: El número en binario es: 10111
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
4
Ingrese un número decimal: 23
El número en binario es: 10111
Ejemplo 5: Hexadecimal a Decimal
Entrada: Seleccionas la opción 5 e ingresas el número hexadecimal A3.
Proceso: El número hexadecimal A3 se convierte a decimal.
Salida: El número en decimal es: 163
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
5
Ingrese un número hexadecimal: A3
El número en decimal es: 163
Ejemplo 6: Decimal a Hexadecimal
Entrada: Seleccionas la opción 6 e ingresas el número decimal 255.
Proceso: El número decimal 255 se convierte a hexadecimal.
Salida: El número en hexadecimal es: FF
text
Copiar código
Seleccione la conversión que desea realizar:
1: Octal a Decimal
2: Decimal a Octal
3: Binario a Decimal
4: Decimal a Binario
5: Hexadecimal a Decimal
6: Decimal a Hexadecimal
6
Ingrese un número decimal: 255
El número en hexadecimal es: FF
Estos ejemplos demuestran cómo puedes utilizar cada una de las
opciones del programa para convertir entre diferentes sistemas numéricos. 
Simplemente selecciona la conversión deseada e ingresa el número en el formato correspondiente.

*/
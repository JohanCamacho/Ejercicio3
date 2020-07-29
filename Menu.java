package com.company;

import java.util.Scanner;

public class Menu {

    public static void MenuEmpleado(){

        try {
            Scanner scanner = new Scanner(System.in);
            int opc;

            do {
                System.out.println("");
                System.out.println("*** Menú Empleados ***");
                System.out.println("1. Agregar Empleado");
                System.out.println("2. Eliminar Empleado");
                System.out.println("3. Actualizar Empleado");
                System.out.println("4. Mostrar Empleados");
                System.out.println("5. Encontrar el empleado con mayor salario.");
                System.out.println("6. Encontrar el empleado con menor salario.");
                System.out.println("7. Ordenar los empleados por nombre.");
                System.out.println("8. Hallar la suma de los salarios de todos los empleados cuyo salario es mayor a 700000.");
                System.out.println("9. Determinar el número total de empleados cuyo apellido comienza por la letra ‘A’ o ‘a’.");
                System.out.println("10. Los 5 primeros empleados con el mayor salario.");
                System.out.println("11. SALIR");
                opc = scanner.nextInt();
                if (opc < 1 || opc > 11) {
                    System.out.println("Opción incorrecta, verifique el menu");
                }
            } while (opc < 1 || opc > 11);

            switch (opc) {
                case 1:
                    OperacionesMenu.Agregar();
                    break;

                case 2:
                    OperacionesMenu.Eliminar();
                    break;

                case 3:
                    OperacionesMenu.Actualizar();
                    break;

                case 4:
                    OperacionesMenu.Mostrar();
                    break;

                case 5:
                    OperacionesMenu.EmpleadoMayorSalario();
                    break;

                case 6:
                    OperacionesMenu.EmpleadoMenorSalario();
                    break;

                case 7:
                    OperacionesMenu.OrdenarporNombre();
                    break;

                case 8:
                    OperacionesMenu.SumaSalarioTotal();
                    break;

                case 9:
                    OperacionesMenu.NumeroApellidosconA();
                    break;

                case 10 :
                    OperacionesMenu.PrimeroscincoMayorSalario();
                    break;

                case 11:
                    System.out.println("!Has Finalizado¡");
                    System.exit(0);
            }

        }catch (Exception ex){
            System.out.println("Ese caracter no es correcto, verifique");
            MenuEmpleado();
        }
    }
}


package estudiantesUmb;

import java.util.Scanner;

public class ClassMainManage {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t-UNIVERSIDAD MANUELA BELTRAN\n");
        StudentManagement studentManagement = new StudentManagement();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\n\tBuenos dias señorita secretaria a continuacion te mostraremos nuestras opcion\n");


        int option = 0;

        while (option != 6) {
            System.out.print("Seleccione una opción:");
            System.out.println("""

                    1. Insertar estudiante
                    2. Consultar estudiante
                    3. Modificar estudiante
                    4. Borrar estudiante
                    5. Mostrar lista de estudiantes
                    6. Salir""");
            System.out.println("Opcion:");
            option= scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante que deseas agregar a la base de datos:");
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Nombres: ");
                    String nombres = scanner2.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner2.nextLine();
                    System.out.print("Email: ");
                    String direccion = scanner2.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner2.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = scanner2.nextLine();
                    Students students = new Students(nombres, apellidos, direccion, telefono, carrera);
                    studentManagement.insertInfor(codigo, students);
                    System.out.println("Estudiante insertado con exito");
                    break;
                case 2:
                    System.out.print("Ingrese el código del estudiante a consultar: ");
                    codigo = scanner.nextInt();
                    students = studentManagement.consultInfo(codigo);
                    if (students != null) {
                        System.out.println("Código: " + codigo);
                        System.out.println("Nombres: " + students.getName());
                        System.out.println("Apellidos: " + students.getLastName());
                        System.out.println("Email: " + students.getEmail());
                        System.out.println("Teléfono: " + students.getPhoneNumber());
                        System.out.println("Carrera: " + students.getStreetHome());
                    } else {
                        System.out.println("El estudiante no existe.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del estudiante a modificar: ");
                    codigo = scanner.nextInt();
                    students = studentManagement.consultInfo(codigo);
                    if (students != null) {
                        System.out.println("Ingrese los nuevos datos del estudiante:");
                        System.out.print("Nombres: ");
                        nombres = scanner2.nextLine();
                        System.out.print("Apellidos: ");
                        apellidos = scanner2.nextLine();
                        System.out.print("Email: ");
                        direccion = scanner2.nextLine();
                        System.out.print("Teléfono: ");
                        telefono = scanner2.nextLine();
                        System.out.print("Carrera: ");
                        carrera = scanner2.nextLine();

                        students.setName(nombres);
                        students.setLastName(apellidos);
                        students.setEmail(direccion);
                        students.setPhoneNumber(telefono);
                        students.setStreetHome(carrera);
                        studentManagement.updateInfo(codigo, students);
                        System.out.println("El estudiante ha sido modificado.");
                    } else {
                        System.out.println("El estudiante no existe.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el código del estudiante a borrar: ");
                    codigo = scanner.nextInt();
                    students = studentManagement.consultInfo(codigo);
                    if (students != null) {
                        studentManagement.deleteInfor(codigo);
                        System.out.println("El estudiante ha sido borrado.");
                    } else {
                        System.out.println("El estudiante no existe.");
                    }
                    break;
                case 5:
                    studentManagement.ViewStudent();
                    break;
                case 6:
                    System.out.println("Muchas gracias has salido del programa.....");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
            }
        }
    }
}

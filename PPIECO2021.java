import java.util.Scanner;

public class PPIECO2021 {
    static Scanner sc = new Scanner(System.in);
    static ListPlace listPlace = new ListPlace();
    static ListPhoto listPhoto = new ListPhoto();

    // Método para limpiar la consola
    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Método para salir de la aplicación o regresar al menú
    static boolean exitApplicationOrReturnMenu() {
        System.out.print("Regresar al menú principal de la aplicación (S/N): ");
        if (sc.nextLine().equalsIgnoreCase("S"))
            return false;
        else
            return true;
    }

    // Agregar un nuevo lugar
    static void addPlaces() {
        int quantity_places = 0;
        String ubication_city, name, description, recommendation, address, hours, entry_price, fauna, flora;
        System.out.println("Cantidad de lugares a ingresar: ");
        quantity_places = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity_places; i++) {
            System.out.println("Ingrese la ciudad donde está ubicado el lugar: ");
            ubication_city = sc.nextLine();
            System.out.println("Ingrese el nombre del lugar: ");
            name = sc.nextLine();
            System.out.println("Ingrese la descripción del lugar: ");
            description = sc.nextLine();
            System.out.println("Ingrese la recomendación del lugar: ");
            recommendation = sc.nextLine();
            System.out.println("Ingrese la dirección del lugar: ");
            address = sc.nextLine();
            System.out.println("Ingrese el horario del lugar: ");
            hours = sc.nextLine();
            System.out.println("Ingrese el precio de entrada al lugar: ");
            entry_price = sc.nextLine();
            System.out.println("Ingrese la fauna del lugar: ");
            fauna = sc.nextLine();
            System.out.println("Ingrese la flora del lugar: ");
            flora = sc.nextLine();
            System.out.print("Estás seguro de guardar este lugar (S/N): ");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                listPlace.addPlace(new Place(ubication_city, name, description, recommendation, address, hours,
                        entry_price, fauna, flora));
            } else {
                System.out.print("Deseas dejar de guardar lugares (S/N): ");
                if (sc.nextLine().equalsIgnoreCase("S"))
                    return;
            }
        }
    }

    // Mostrar los lugares
    public static boolean showPlaces() {
        // Que se muestren nada más los nombres, que se pide el ingrese el
        // nombre del que quiere ver, que pueda elegir ver uno o todos.
        clearConsole();
        int flagOne = 0;
        System.out.println("---Menú de opciones de visualización de lugares---");
        System.out.println("\n\nElija la acción que desea realizar");
        System.out.println("1.Ver todos los lugares");
        System.out.println("2.Buscar la información de un lugar especifico por su nombre");
        System.out.println("3.Salir");
        flagOne = Integer.parseInt(sc.nextLine());
        switch (flagOne) {
            case 1:
                listPlace.showPlaces();
                break;
            case 2:
                searchPlaces();
                break;
            case 3:
                home();
                break;
            default:
                System.out.println("\nNota: La ultima opción elegida era invalida");
                break;
        }
        System.out.print("Desea elegir otra opción del menú de opciones de visualización de lugares (S/N): ");
        if (sc.nextLine().equalsIgnoreCase("S"))
            return false;
        else
            return true;
    }

    public static void searchPlaces() {
        System.out.println("Ingrese el nombre del lugar que quiere ver ");
        String lugar = sc.nextLine();
        listPlace.searchPlace(lugar);
    }

    public static void deletePlace() {
        String namePlace;
        System.out.println("---Eliminar lugares---");
        System.out.println("\n\n¿Cuál es el nombre del lugar que va a eliminar?");
        namePlace = sc.nextLine();
        System.out.println(namePlace);
        listPlace.deletePlace(namePlace);
        System.out.println("\n\nLugar eliminado exitosamente");
    }

    static void addPhotos() {
        int quantityPhotos = 0;
        int id_photo;
        String photo_path, name_place;
        System.out.println("Cantidad de fotos a ingresar: ");
        quantityPhotos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantityPhotos; i++) {
            System.out.println("Ingrese el ID de la foto: ");
            id_photo = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la ruta de la foto: ");
            photo_path = sc.nextLine();
            System.out.println("Ingrese el nombre de la foto: ");
            name_place = sc.nextLine();
            System.out.print("Estás seguro de guardar esta foto (S/N): ");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                listPhoto.addPhoto(new Photo(id_photo, photo_path, name_place));
            } else {
                System.out.print("Desea dejar de guardar fotos (S/N): ");
                if (sc.nextLine().equalsIgnoreCase("S")) {
                    return;
                }
            }
        }
    }

    public static boolean showPhotos() {
        // Que se muestren nada más los nombres, que se pide el ingrese el
        // nombre del que quiere ver, que pueda elegir ver uno o todos.
        clearConsole();
        int flagOne = 0;
        System.out.println("---Menú de opciones de visualización de fotos---");
        System.out.println("\n\nElija la acción que desea realizar:");
        System.out.println("1.Ver todas las fotos");
        System.out.println("2.Buscar la información de una foto en especifico por su nombre");
        System.out.println("3.Salir");
        flagOne = Integer.parseInt(sc.nextLine());
        switch (flagOne) {
            case 1:
                listPhoto.showPhotos();
                break;
            case 2:
                System.out.println("La funcionalidad no se encuentra aún disponible, vendrá en la próxima versión");
                break;
            case 3:
                home();
                break;
            default:
                System.out.println("\nNota: La ultima opción elegida era invalida");
                break;
        }
        System.out.print("Desea elegir otra opción del menú de opciones de visualización de fotos (S/N): ");
        if (sc.nextLine().equalsIgnoreCase("S")) {
            return false;
        } else {
            return true;
        }
    }

    // Menú principal del aplicativo
    public static boolean home() {
        clearConsole();
        boolean response;
        boolean returnFinish = false;
        int flagOne = 0;
        System.out.println("Usuario EcoCol");
        System.out.println("---Menú de opciones---");
        System.out.println("\n\nElija la acción que desea realizar");
        System.out.println("1.Guardar lugares");
        System.out.println("2.Ver lugares");
        System.out.println("3.Eliminar lugares");
        System.out.println("4.Agregar fotos del lugar");
        System.out.println("5.Mostrar fotos del lugar");
        System.out.println("6.Salir");
        flagOne = Integer.parseInt(sc.nextLine());
        switch (flagOne) {
            case 1:
                addPlaces();
                returnFinish = exitApplicationOrReturnMenu();
                break;
            case 2:
                response = showPlaces();
                while (!response) {
                    response = showPlaces();
                }
                returnFinish = false;
                break;
            case 3:
                deletePlace();
                returnFinish = exitApplicationOrReturnMenu();
                break;
            case 4:
                addPhotos();
                returnFinish = exitApplicationOrReturnMenu();
                break;
            case 5:
                response = showPhotos();
                while (!response) {
                    response = showPhotos();
                }
                returnFinish = false;
                break;
            case 6:
                returnFinish = true;
                break;
            default:
                System.out.println("\nNota: La ultima opción elegida era invalida");
                break;
        }
        return returnFinish;
    }

    // Método principal de la clase
    public static void main(String[] args) {
        boolean response = home();
        while (!response) {
            response = home();
        }
        clearConsole();
        System.out.println("--------------------------------------");
        System.out.println("-----------------EcoCol---------------");
        System.out.println("--------------------------------------");
        System.out.println("\nRegrese pronto, EcoCol te espera :)\n");

    }

}

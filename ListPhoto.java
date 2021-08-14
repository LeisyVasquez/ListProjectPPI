import java.util.Scanner;

public class ListPhoto {

    Scanner sc = new Scanner(System.in);

    public NodoPhoto head = null;
    public int size = 0;

    public void addPhoto(Photo value) {
        NodoPhoto newNodo = new NodoPhoto(value);
        if (head == null) {
            head = newNodo;
        } else {
            NodoPhoto pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNodo;
        }
        size++;
    }

    //Mostrar todos las fotos de la lista
    public void showPhotos() {
        if (head == null) {
            System.out.println("No hay fotos");
        } else {
            NodoPhoto pointer = head;
            while (pointer != null) {
                String response = pointer.value.toString();
                System.out.println(response);
                pointer = pointer.next;
            }
        }
    }

}
import java.util.Scanner;

public class Photo{
    Scanner leer= new Scanner(System.in);
    public int id_photo=0;
    public String photo_path="";
    public String name_place="";
    
    public Photo(int id_photo, String photo_path, String name_place ){
        this.id_photo=id_photo;
        this.photo_path=photo_path;
        this.name_place=name_place;
    }
    
    public String toString(){
        return "ID: " + id_photo + " Ruta: " + photo_path + " Nombre: " + name_place ; 
    }
    
}
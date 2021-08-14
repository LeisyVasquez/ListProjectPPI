public class Place {
    public String ubication_city = "";
    public String name = "";
    public String description = "";
    public String recommendation = "";
    public String address = "";
    public String hours = "";
    public String entry_price = "";
    public String fauna = "";
    public String flora = "";

    public Place(String ubication_city, String name, String description, String recommendation, String address,
            String hours, String entry_price, String fauna, String flora) {
        this.ubication_city = ubication_city;
        this.name = name;
        this.description = description;
        this.recommendation = recommendation;
        this.address = address;
        this.hours = hours;
        this.entry_price = entry_price;
        this.fauna = fauna;
        this.flora = flora;
    }

    public String toString(){
        return "Nombre: " + name + " Descripcion: " + description + " Recommendaciones: " + recommendation + " Dirección: " + address + " Horarios: " + hours + " Precio de entrada: " + entry_price + " Fauna: " + fauna + " Flora: " + flora; 
    }

}
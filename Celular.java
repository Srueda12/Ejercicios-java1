package B2;

public class Celular {

    //Atributos
    String marca;
    String modelo;
    int peso;
    String color;
    String sistema;
    int versSistema;
    int memoria;
    int capAlmacenamiento;
    int cantCamara;
    boolean memoriaExerna;

    //Get y Set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Funciones
    public void tomarFotos(){
        System.out.println("Capturar Imagen");
    }

    public void ConexionRed(){
        System.out.println("Conexion Wifi");
    }

    public void Hablar(){
        System.out.println("Hablar");
    }

}



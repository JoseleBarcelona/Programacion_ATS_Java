package ProgOrienObjt.poo7GetterSetter;

public class MainGettetSetter {
    public static void main(String[] args) {
        Encapsulamiento obj1 = new Encapsulamiento();

        obj1.setEdad(51);
        obj1.setNombre("Núria");
        System.out.println("La edad es: " + obj1.getEdad());
        System.out.println("El nombre es: " + obj1.getNombre());


    }

}

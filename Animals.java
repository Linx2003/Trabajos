class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void sonido() {
        System.out.println("Haciendo ruido...");
    }
}


class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void sonido() {
        System.out.println("Guau, guau!");
    }
}


class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void sonido() {
        System.out.println("Miau, miau!");
    }
}




public class Animals{
    public static void main(String[] args) {
        Animal animal1 = new Perro("Zeus", 5);
        Animal animal2 = new Gato("Copito", 3);

        animal1.sonido();
        animal2.sonido();

        Potencia pote = new Potencia(3, 4);
		System.out.println(pote.calcularPotencia());

    }
}
public class Main {
    public static void main(String[] args) {
        
        // 1. Crear el objeto único usando el constructor sobrecargado
        DibujoAsignado miObra = new DibujoAsignado("Personaje Asignado", "Marcadores y Colores", 12);
        
        System.out.println("=== REPORTE DE TRABAJO INDIVIDUAL ===");
        
        // 2. Imprimir 1 atributo del objeto (como lo pide la guía)
        System.out.println("Nombre del dibujo asignado: " + miObra.getNombreDibujo());
        System.out.println("Técnica que se va a usar: " + miObra.getTecnica());
        
        System.out.println("\n=== EJECUCIÓN DE PROCESOS ===");
        // Probando los métodos personalizados y la sobrecarga
        miObra.iniciarTrazo();
        miObra.colorear();
        miObra.aplicarSombras();
        miObra.finalizarDibujo();
        
        System.out.println("\n=== REQUISITO DE REDES SOCIALES ===");
        // Prueba del método sobrecargado que simula la entrega en redes
        miObra.compartirEnRedes("Instagram", "del curso");
    }
}
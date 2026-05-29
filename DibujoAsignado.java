public class DibujoAsignado {
    // 1. Los 5 Atributos requeridos
    private String nombreDibujo;
    private String tecnica;      // Ej: Lápiz, Colores, Marcadores
    private int cantidadColores;
    private int tiempoMinutos;
    private boolean terminado;

    // 2. Constructor Base (Sin parámetros)
    public DibujoAsignado() {
        this.nombreDibujo = "Mi Dibujo";
        this.tecnica = "Lápiz";
        this.cantidadColores = 0;
        this.tiempoMinutos = 0;
        this.terminado = false;
    }

    // Sobrecarga de Constructor (Recibe parámetros)
    public DibujoAsignado(String nombreDibujo, String tecnica, int cantidadColores) {
        this.nombreDibujo = nombreDibujo;
        this.tecnica = tecnica;
        this.cantidadColores = cantidadColores;
        this.tiempoMinutos = 45; // Tiempo estimado inicial
        this.terminado = false;
    }

    // 3. Getters & Setters
    public String getNombreDibujo() { return nombreDibujo; }
    public void setNombreDibujo(String nombreDibujo) { this.nombreDibujo = nombreDibujo; }
    public String getTecnica() { return tecnica; }
    public void setTecnica(String tecnica) { this.tecnica = tecnica; }
    public int getCantidadColores() { return cantidadColores; }
    public void setCantidadColores(int cantidadColores) { this.cantidadColores = cantidadColores; }
    public int getTiempoMinutos() { return tiempoMinutos; }
    public void setTiempoMinutos(int tiempoMinutos) { this.tiempoMinutos = tiempoMinutos; }
    public boolean isTerminado() { return terminado; }
    public void setTerminado(boolean terminado) { this.terminado = terminado; }

    // 4. Los 5 Métodos diferentes a Getters y Setters
    public void iniciarTrazo() {
        System.out.println("Comenzando a dibujar las líneas base de: " + nombreDibujo);
    }

    public void colorear() {
        System.out.println("Aplicando " + cantidadColores + " colores usando la técnica de " + tecnica);
    }

    public void aplicarSombras() {
        System.out.println("Añadiendo sombras para darle profundidad al dibujo.");
    }

    public void finalizarDibujo() {
        this.terminado = true;
        System.out.println("¡El dibujo '" + nombreDibujo + "' ha sido completamente terminado!");
    }

    // Sobrecarga de método (Mismo método, diferentes parámetros)
    public void compartirEnRedes() {
        System.out.println("Compartiendo el dibujo en redes sociales...");
    }

    public void compartirEnRedes(String redSocial, String profesor) {
        System.out.println("Publicando con éxito en " + redSocial + ". ¡Mención enviada al profe " + profesor + "!");
    }
}
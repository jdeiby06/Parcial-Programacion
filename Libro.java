public class Libro {
// Atributos de la clase
    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    // --- CONSTRUCTORES ---

    /**
     * Constructor por defecto para crear un objeto Libro vacío.
     */
    public Libro() {
    }

    /**
     * Constructor para inicializar un objeto Libro con todos sus atributos.
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false; // Por defecto, un libro nuevo no está prestado.
    }

    // --- GETTERS Y SETTERS ---

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // No se necesita un setter público para 'prestado' ya que se gestiona
    // a través de los métodos prestar() y devolver().

    // --- MÉTODOS DE NEGOCIO ---

    /**
     * Método para prestar un libro.
     * Retorna true si la operación fue exitosa (el libro no estaba prestado).
     */
    public boolean prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("El libro \"" + this.titulo + "\" ha sido prestado exitosamente.");
            return true;
        } else {
            System.out.println("El libro \"" + this.titulo + "\" ya se encuentra prestado.");
            return false;
        }
    }

    /**
     * Método para devolver un libro.
     * Retorna true si la operación fue exitosa (el libro estaba prestado).
     */
    public boolean devolver() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("El libro \"" + this.titulo + "\" ha sido devuelto exitosamente.");
            return true;
        } else {
            System.out.println("El libro \"" + this.titulo + "\" no estaba prestado.");
            return false;
        }
    }

    /**
     * Método para imprimir los datos del libro.
     */
    public void mostrarLibro() {
        System.out.println("--- Detalles del Libro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Estado: " + (this.prestado ? "Prestado" : "Disponible"));
        System.out.println("--------------------------");
    }
}
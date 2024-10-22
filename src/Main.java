public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Crear libros
        Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro(3, "El Principito", "Antoine de Saint-Exupéry", 1943);

        // Agregar libros
        libroDAO.agregarLibro(libro1);
        libroDAO.agregarLibro(libro2);
        libroDAO.agregarLibro(libro3);

        // Obtener y mostrar todos los libros
        System.out.println("Todos los libros:");
        libroDAO.obtenerTodosLosLibros().forEach(System.out::println);

        // Actualizar un libro
        Libro libroActualizado = new Libro(2, "Don Quijote", "Miguel de Cervantes Saavedra", 1605);
        libroDAO.actualizarLibro(libroActualizado);

        // Obtener libro por ID
        System.out.println("Obtener libro con ID 2:");
        System.out.println(libroDAO.obtenerLibroPorId(2));

        // Eliminar un libro
        libroDAO.eliminarLibro(3);

        // Mostrar todos los libros después de la eliminación
        System.out.println("Todos los libros después de eliminar:");
        libroDAO.obtenerTodosLosLibros().forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Foro {
    private String nombre;
    private List<Tema> temas;

    public Foro(String nombre) {
        this.nombre = nombre;
        this.temas = new ArrayList<>();
    }

    public void agregarTema(Tema tema) {
        temas.add(tema);
    }

    // Métodos getter y setter para cada atributo...
}

public class Tema {
    private String titulo;
    private List<Comentario> comentarios;

    public Tema(String titulo) {
        this.titulo = titulo;
        this.comentarios = new ArrayList<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    // Métodos getter y setter para cada atributo...
}

public class Comentario {
    private String autor;
    private String contenido;

    public Comentario(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
    }

    // Métodos getter y setter para cada atributo...
}

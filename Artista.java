package evf.javadoc.original;

//Comentario apartado b

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    //Constructor por defecto
    public Artista() {
	this("");
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
}



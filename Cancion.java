package evf.javadoc.original;


 public class Cancion {
    //Nuevo atributo
    private int id;

    String nombreCancion;
    Artista artista;

    //Modificamos el contructor
    public Cancion(int id, String nombreCancion, Artista artista) {
	this.id = id;
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }


    public void reproducirCancion(){
        System.out.println("Reproduciendo la canción "+nombreCancion);
    }


    public String getNombreCancion() {
        return nombreCancion;
    }


    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
  }


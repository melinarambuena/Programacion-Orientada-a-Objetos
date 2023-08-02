package Entidades;

public class Libro {

    private Integer ISBN;
    private String titulo;
    private String autor;
    private Integer numerodePaginas;

    //Constructor por defecto
    public Libro() {
    }

//Constructor con parametros
    public Libro(Integer ISBN, String titulo, String autor, Integer numerodePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

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

    public Integer getNumerodePaginas() {
        return numerodePaginas;
    }

    public void setNumerodePaginas(Integer numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numerodePaginas=" + numerodePaginas + '}';
    }



}

package biblioteca;

class Livro implements ItemBiblioteca {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + titulo;
    }
}
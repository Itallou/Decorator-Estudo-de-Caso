package biblioteca;

class Dicionario implements ItemBiblioteca {
    private String idioma;

    public Dicionario(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String getDescricao() {
        return "Dicionário de " + idioma;
    }
}
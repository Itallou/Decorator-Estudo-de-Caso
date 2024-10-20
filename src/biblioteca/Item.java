package biblioteca;

abstract class Item implements ItemBiblioteca {
    protected ItemBiblioteca itemDecorado;

    public Item(ItemBiblioteca item) {
        this.itemDecorado = item;
    }

    public String getDescricao() {
        return itemDecorado.getDescricao();
    }
}
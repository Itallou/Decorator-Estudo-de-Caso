package biblioteca;

class Emprestimo extends Item {
    private boolean emprestado;

    public Emprestimo(ItemBiblioteca item) {
        super(item);
        this.emprestado = false;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Item emprestado.");
        } else {
            System.out.println("Item já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Item devolvido.");
        } else {
            System.out.println("Item não foi emprestado.");
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + (emprestado ? " (Emprestado)" : " (Disponível para empréstimo)");
    }
}
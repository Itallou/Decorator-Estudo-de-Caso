package biblioteca;

class Reserva extends Item {
    private boolean reservado;

    public Reserva(ItemBiblioteca item) {
        super(item);
        this.reservado = false;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Item reservado.");
        } else {
            System.out.println("Item já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva cancelada.");
        } else {
            System.out.println("Item não está reservado.");
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + (reservado ? " (Reservado)" : " (Disponível para reserva)");
    }
}
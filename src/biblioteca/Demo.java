package biblioteca;

public class Demo {
    public static void main(String[] args) {
        // Criando um livro e um dicionário
        ItemBiblioteca livro = new Livro("O Senhor dos Anéis");
        ItemBiblioteca dicionario = new Dicionario("Inglês-Português");

        // Livro com funcionalidade de empréstimo e reserva
        ItemBiblioteca livroEmprestado = new Emprestimo(livro);
        ItemBiblioteca livroReservado = new Reserva(livroEmprestado);

        // Decorando o dicionário com funcionalidade de empréstimo
        ItemBiblioteca dicionarioEmprestado = new Emprestimo(dicionario);

        // Exibindo descrições
        System.out.println(livroReservado.getDescricao());  // Livro disponível para empréstimo e disponível para reserva
        System.out.println(dicionarioEmprestado.getDescricao());  // Dicionário disponível para empréstimo

        // Operações de empréstimo e reserva
        ((Emprestimo) livroEmprestado).emprestar();
        ((Reserva) livroReservado).reservar();
        
        // Exibindo descrições após empréstimo e reserva
        System.out.println(livroReservado.getDescricao());  // Livro emprestado e reservado
        
        ((Emprestimo) livroEmprestado).devolver();
        ((Reserva) livroReservado).cancelarReserva();
        
        // Exibindo descrições após devolução e cancelamento de reserva
        System.out.println(livroReservado.getDescricao());  // Livro disponível para empréstimo e disponível para reserva
    }
}

// Este projeto implementa um sistema de biblioteca usando o padrão Decorator em Java. 
// O sistema permite que materiais da biblioteca, como livros e dicionários, recebam funcionalidades como empréstimo e reserva.
// A interface ItemBiblioteca define a descrição dos itens.
// As classes livros e dicionario representam os itens da biblioteca.
// As classes emprestimo e reserva adicionam funcionalidades aos itens.

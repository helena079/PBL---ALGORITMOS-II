package Livro;

import Livro.Livro;

import java.util.Map;

public interface LivroDAO {
    void adicionarLivro(Livro livro);
    void atualizarLivro(Livro livro);
    void excluirLivro(String isbn);
    Livro buscarLivro(String isbn, String titulo, String autor, String categoria);
    Map<String, Livro> listarLivros();
}

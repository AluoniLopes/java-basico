package edu.aluoni.collection.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adiconarLivro(String titulo, String autor, int anoPub) {
        livroList.add(new Livro(titulo, autor, anoPub));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorintervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorAutor = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo() == titulo)
                    return l;
            }
        }
        return livrosPorAutor;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adiconarLivro("Meu padre nao é meu pai", "Steve Job", 1998);
        catalogo.adiconarLivro("Uma casa Muito engraçada", "Auto muito funny", 1990);
        catalogo.adiconarLivro("Diario de um Banana", "Steve Job", 1970);

        System.out.println(catalogo.pesquisarAutor("Steve Job"));
        System.out.println(catalogo.pesquisarPorTitulo("Diario de um Banana"));
        System.out.println(catalogo.pesquisarPorintervaloAno(1970, 1990));
    }
}
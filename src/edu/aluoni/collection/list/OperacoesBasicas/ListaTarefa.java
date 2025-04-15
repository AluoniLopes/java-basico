package edu.aluoni.collection.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int totalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("nº total de elemtos na lista é: " + listaTarefa.totalTarefas());
        listaTarefa.adicionarTarefa("Uma tarefa");
        listaTarefa.adicionarTarefa("Uma tarefa");
        listaTarefa.adicionarTarefa("Uma segunda tarefa");
        listaTarefa.adicionarTarefa("Uma terceira tarefa");
        listaTarefa.adicionarTarefa("Uma quarta tarefa");
        System.out.println("nº total de elemtos na lista é: " + listaTarefa.totalTarefas());

        listaTarefa.removerTarefa("Uma tarefa");
        System.out.println("nº total de elemtos na lista é: " + listaTarefa.totalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
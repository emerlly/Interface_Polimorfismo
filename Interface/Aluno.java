package Interface;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Escolaridade> grausEscolaridade;

    public Aluno(String nome) {
        this.nome = nome;
        this.grausEscolaridade = new ArrayList<>();
    }

    public void adicionarEscolaridade(Escolaridade escolaridade) {
        grausEscolaridade.add(escolaridade);
    }

    public void imprimirGrausEscolaridade() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Graus de Escolaridade:");
        for (Escolaridade grau : grausEscolaridade) {
            grau.pegarEscolaridade();
        }
    }
}
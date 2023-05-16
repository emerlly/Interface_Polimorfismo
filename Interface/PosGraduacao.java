package Interface;

public class PosGraduacao implements Escolaridade {
    @Override
    public void pegarEscolaridade() {
        System.out.println("Pós-Graduação");
    }
}
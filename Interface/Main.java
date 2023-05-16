package Interface;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {   	
    	Scanner entrada = new Scanner(System.in);
    	int input = 0;
    	int count = 0;
    	
    	
    	System.out.println("Qual o nome do Aluno?");
    	String nome = entrada.next();   	
        Aluno aluno = new Aluno(nome);
        
        System.out.println("\nAbaixo os codigos das escolaridades");
        System.out.println("1 - Fundamental");
        System.out.println("2 - Ensino Médio");
        System.out.println("3 - Graduação");
        System.out.println("4 - Pós-Graduação");
        System.out.println("9 - SAIR \n");
        
        while(count < 4) {        
	        System.out.print("Digite a escolaridade de '"+nome +"\n");
	        input = entrada.nextInt();
	       
	        if (input == 1){
            	aluno.adicionarEscolaridade(new Fundamental());
	        }
            if (input == 2) {
                aluno.adicionarEscolaridade(new Medio());
            }
            if (input == 3) {
               aluno.adicionarEscolaridade(new Graduacao());
            }
            if (input == 4) {
            	aluno.adicionarEscolaridade(new PosGraduacao());
            }
            if (input == 9) {
            break;
            }
            count +=1;	  
        }
        entrada.close();
        aluno.imprimirGrausEscolaridade();
        
        
    }
    
}

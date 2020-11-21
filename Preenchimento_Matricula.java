
package java;
import java.util.Scanner;

public class Java {


   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno a = new Aluno();
        Responsavel r = new Responsavel();
        Ocupacao o = new Ocupacao();
        Pessoa p = new Pessoa();
        String curso;
        boolean matricula;
        System.out.println("digite o curso do aluno");
        curso = entrada.next();
        a.setCurso(curso);
        System.out.println("a matricula foi trancada?");
        String resp = entrada.next();
        if(resp == "sim"){
        matricula = true;
        a.setMatriculatrancada(matricula);
    }
        else{
            matricula = false;
            a.setMatriculatrancada(matricula);
            
            
        }
        System.out.println("preenchimento do aluno concluido, agora preenchimento do responsavel");
        System.out.println(" ");
        System.out.println("digite a renda");
        int renda;
        renda = entrada.nextInt();
        r.setRenda(renda);
        System.out.println("digite a sua ocupação");
        String ocupacao = entrada.next();
        o.setDescricao(ocupacao);
        System.out.println(" ");
        System.out.println("digite seu cpf");
        String cpf = entrada.next();
        p.setCpf(cpf);
        System.out.println("digite o nome");
        String nome = entrada.next();
        p.setNome(nome);
        System.out.println("digite a idade");
        int idade = entrada.nextInt();
        p.setIdade(idade);
        
        
        

    }
    
}
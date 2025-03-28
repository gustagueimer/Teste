package automatizado;

import java.util.Scanner;

import automatizado.notas.Aluno;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner enput = new Scanner(System.in);
  
    	Aluno dumbkid = new Aluno();
    	
        System.out.println( "Haaaiiiii :D" );
        
        System.out.println("\ninsira o nome do aluno :D");
        dumbkid.setNome(enput.nextLine());
        
        while(true) {
        	try {
        		System.out.println("insira uma nota :D");
        		dumbkid.addNota(enput.nextDouble());
        	} catch(Exception e) {
        		System.out.println("input invalido >:C");
        		enput.nextLine();
        	} finally {
        		System.out.println("para inserir outra nota, digite 22 :S");
        		if(enput.nextInt() != 22) {
        			break;
        		}
        	}
        }
        
        enput.close();
        
        System.out.println("\nthe results are in, you are the father :O \n");
        dumbkid.apresentarResultado();
    
    }
}

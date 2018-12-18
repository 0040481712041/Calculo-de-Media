 import javax.swing.JOptionPane;
 public class ExemploNota
 {
    public static void main (String[]args){
        // Atributos
        String nome, n1, n2, nsub;
        double nota1, nota2, sub, media;
        //Recebendo o nome do aluno(a)
        nome = JOptionPane.showInputDialog("Digite o nome do aluno(a) ");
       //Recebe a string nota
        n1 = JOptionPane.showInputDialog("Digite a p1 ");
        n2 = JOptionPane.showInputDialog("Digite a p2");
        //converte a String em double
        nota1 = Double.parseDouble(n1);
        nota2 = Double.parseDouble(n2);
        //Calcula a media 
        media = (nota1+nota2)/2;
        //Verifica se a média é superior ou igual a 6
        if (media>=6){
            JOptionPane.showMessageDialog(null,"Aluno " +nome+"\n"+"A media do aluno(a) eh "+media+"\n"+"Aluno(a) Aprovado.","Situacao do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno " +nome+"\n"+"A media do aluno(a) eh  "+media+"\n"+"Devera fazer Prova Substituta."+"\n"+"Pressione ok para digitar a nota da sub.","Situacao do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            //Recebendo e convertendo valor
            nsub = JOptionPane.showInputDialog("Digite a nota da Substitutiva");
            sub = Double.parseDouble(nsub);
            //Calculando a nota da sub
            media = (sub + nota2)/2;
            if (media >=6 ){
                JOptionPane.showMessageDialog(null,"Aluno(a) " +nome+"\n"+"A media do aluno(a) eh "+media+"\n"+"Aluno Aprovado","Situacao do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Aluno(a)" +nome+"\n"+"A media do aluno eh "+media+"+\n"+"Reprovado","Situacao do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            }
        }
       System.exit(0);
    }
 }
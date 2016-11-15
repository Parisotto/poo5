package quiz;
import java.util.ArrayList;
public class Quiz{
    private static ArrayList<Question> test;
    private static ArrayList<Usuario> usu;
    private static int usuAtual = -1;
    
    public static void setUsu(String usuario){
        if(usu == null){
            usu = new ArrayList<>();
        } else {
            for(Usuario u: usu){
                if(u.getUsuario().equalsIgnoreCase(usuario)){
                   usuAtual = u.getId();
                   return;
                }
            }
        }
        Usuario novoUsuario = new Usuario(usuario);
        usu.add(novoUsuario);
        usuAtual = usu.size()-1;
        novoUsuario.setId(usuAtual);
    }
    public static ArrayList<Question> getTest(){
        if(Quiz.test == null){
            Quiz.test = new ArrayList<>();
            
            // Questão 1 resposta índice 2
            Question q1 = new Question(
                    "Qual a definição de Classe em POO?", 2, 
                    new String[]{
                        "É um objeto após ser instanciado", 
                        "É o protótipo de um vetor com atributos", 
                        "É uma abstração que define um tipo de objeto" 
                    }
            );
            Quiz.test.add(q1);
            
            // Questão 2 resposta índice 0
            Question q2 = new Question(
                    "O que é um atributo?", 0, 
                    new String[]{
                        "Esta é a resposta correta", 
                        "É o protótipo de um vetor com atributos", 
                        "É uma abstração que define um tipo de objeto" 
                    }
            );
            Quiz.test.add(q2);
            
            // Questão 3 resposta índice 2
            Question q3 = new Question(
                    "O que é um atributo?", 2, 
                    new String[]{
                        "É o protótipo de um vetor com atributos", 
                        "É uma abstração que define um tipo de objeto",
                        "Esta é a resposta correta" 
                    }
            );
            Quiz.test.add(q3);
            
            // Questão 4 resposta índice 1
            Question q4 = new Question(
                    "O que é um atributo?", 1, 
                    new String[]{
                        "É o protótipo de um vetor com atributos", 
                        "Esta é a resposta correta", 
                        "É uma abstração que define um tipo de objeto" 
                    }
            );
            Quiz.test.add(q4);
            
            // Questão 5 resposta índice 0
            Question q5 = new Question(
                    "O que é um atributo?", 0, 
                    new String[]{
                        "Esta é a resposta correta", 
                        "É o protótipo de um vetor com atributos", 
                        "É uma abstração que define um tipo de objeto" 
                    }
            );
            Quiz.test.add(q5);
        }
        return Quiz.test;
    }
    
    public static double validateTest(int[] userAnswers){
        int count=0;
        for(int i = 0; i < Quiz.test.size(); i++){
            if(Quiz.test.get(i).getAnswer() == userAnswers[i]){
                count++;
            }
        }
        double grade = (double)count / (double)test.size();

        usu.get(usuAtual).setLastGrade(grade);
        usu.get(usuAtual).setTestsGradeSum(grade);
        return grade;
    }
    public static String getUsu(int idUsu){
        return usu.get(idUsu).getUsuario();
    }
    public static int getUsuAtual(){
        return usuAtual;
    }
    public static double getLastGrade(int idUsu){
        return usu.get(idUsu).getLastGrade();
    }
    
    public static double getGradeAvarege(int idUsu){
        if(usu.get(idUsu).getTestsCount() == 0) return 0;
        return usu.get(idUsu).getTestsGradeSum() / (double)usu.get(idUsu).getTestsCount();
    }
    
    public static ArrayList<Usuario> getUsuList(){
        return usu;
    } 
}

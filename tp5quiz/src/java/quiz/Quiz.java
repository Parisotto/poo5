package quiz;
import java.util.ArrayList;
public class Quiz{
    private static int testsCount = 0;
    private static double testsGradeSum = 0.0;
    private static double lastGrade = 0.0;
    private static ArrayList<Question> test;
    
    public static ArrayList<Question> getTest(){
        if(Quiz.test == null){
            Quiz.test = new ArrayList<>();
            
            // Questão 1 resposta índice 2
            Question q1 = new Question(
                    "Qual a definição de Classe em POO?", 2, 
                    new String[]{
                        "É um objeto após ser instanciado", /* índice 0 */
                        "É o protótipo de um vetor com atributos", /* índice 1 */
                        "É uma abstração que define um tipo de objeto" /* CORRETA índice 2 */
                    }
            );
            Quiz.test.add(q1);
            
            // Questão 2 resposta índice 0
            Question q2 = new Question(
                    "O que é um atributo?", 0, 
                    new String[]{
                        "É um objeto após ser instanciado", /* CORRETA índice 0 */
                        "É o protótipo de um vetor com atributos", /* índice 1 */
                        "É uma abstração que define um tipo de objeto" /* índice 2 */
                    }
            );
            Quiz.test.add(q2);
        }
        return Quiz.test;
    }
    
    public static double validateTest(String[] userAnswers){
        int count=0;
        for(int i = 0; i < Quiz.test.size(); i++){
            if(Quiz.test.get(i).getAnswer() == Integer.parseInt(userAnswers[i])){
                count++;
            }
        }
        double grade = (double)count / (double)test.size();
        Quiz.lastGrade = grade;
        Quiz.testsGradeSum += grade;
        Quiz.testsCount++;
        return grade;
    }
    
    public static double getLastGrade(){
        return Quiz.lastGrade;
    }
    
    public static double getGradeAvarege(){
        if(Quiz.testsCount == 0) return 0;
        return Quiz.testsGradeSum / (double)Quiz.testsCount;
    }
}

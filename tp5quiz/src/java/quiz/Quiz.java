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
            
            // Questão 1 resposta índice 3
            Question q1 = new Question(
                    "Como teve início a Ditadura Militar no Brasil que durou de 1964 a 1985?", 
                    3, 
                    new String[]{
                        "A - Através de eleições democráticas que levaram ao poder os militares.", 
                        "B - Através de um acordo ocorrido entre o presidente João Goulart e comandantes das forças armadas brasileiras.", 
                        "C - Através de uma sangrenta guerra civil em que os militares tomaram o poder a força, após a morte de milhares de brasileiros.",
                        "D - Através de um golpe militar, ocorrido em 31 de março de 1964, que tirou o presidente João Goulart do poder."
                    }
            );
            Quiz.test.add(q1);
            
            // Questão 2 resposta índice 0
            Question q2 = new Question(
                    "Qual das alternativas abaixo aponta características do regime militar brasileiro?", 
                    0, 
                    new String[]{
                        "A - Bipartidarismo, falta de democracia, perseguição aos opositores políticos e repressão aos movimentos sociais.", 
                        "B - Democracia, eleições diretas para presidência da República, apoio aos movimentos sociais, distribuição de terras para os camponeses.", 
                        "C - Implantação do socialismo, existência de vários partidos políticos, tolerância com os opositores políticos.",
                        "D - Liberdade de imprensa, valorização do sistema democrático, apoio aos sindicatos e movimentos de trabalhadores sem terras."
                    }
            );
            Quiz.test.add(q2);
            
            // Questão 3 resposta índice 3
            Question q3 = new Question(
                    "O Ato Institucional Número 5 ( AI-5 ) foi o mais duro do governo militar. Qual das alternativas abaixo aponta as características deste ato?", 
                    3, 
                    new String[]{
                        "A - Fechou totalmente a economia brasileira para o mercado externo, nomeou juízes para cargos públicos e implantou várias medidas socialistas.", 
                        "B - Decretou a prisão de todos os artistas brasileiros, proibiu todo tipo de música no país e modificou a letra do Hino Nacional.",
                        "C - Decretou o fechamento do Congresso Nacional por 10 anos, anulou o título de eleitor de todos os cidadãos brasileiros e anulou as aposentadorias de cantores, professores e políticos.",
                        "D - Aposentou juízes, cassou mandatos, acabou com as garantias do habeas-corpus e aumentou a repressão militar e policial."
                    }
            );
            Quiz.test.add(q3);
            
            // Questão 4 resposta índice 1
            Question q4 = new Question(
                    "No campo econômico, a economia brasileira cresceu muito durante os anos de 1969 e 1973. Esta fase ficou conhecida como época do Milagre Econômico. Qual das alternativas abaixo aponta características deste período?", 
                    1, 
                    new String[]{
                        "A - Investimentos nos setores culturais e educacionais, baixo índice de endividamento externo, distribuição de renda de forma justa.", 
                        "B - Forte crescimento do PIB, investimentos em infraestrutura e elevados empréstimos vindos do exterior com aumento da dívida externa.", 
                        "C - Elevados investimentos externos (principalmente da URSS), inflação muito baixa e controlada e aumento do consumo das camadas mais pobres da sociedade.",
                        "D - Criação de programas de distribuição de renda, incentivo à reforma agrária, aumento significativo das exportações de máquinas e produtos tecnológicos."
                    }
            );
            Quiz.test.add(q4);
            
            // Questão 5 resposta índice 2
            Question q5 = new Question(
                    "Qual das alternativas abaixo aponta uma importante decisão que abriu caminho para a redemocratização no país e fim da ditadura militar?", 
                    2, 
                    new String[]{
                        "A - Em 1984, a Campanha das Diretas Já conquistou seu objetivo e as eleições diretas para presidente voltou ao país em 1985.", 
                        "B - Em 1979, o presidente Figueiredo estabeleceu o fim da ditadura e convocou eleições diretas para presidente.", 
                        "C - Em 1978, o presidente Geisel acabou com o AI-5, restaurou o habeas-corpus e abriu caminho para a volta da democracia no Brasil.",
                        "D - Em 1980, com apoio dos EUA, uma guerra civil derrubou o governo militar e colocou no poder um presidente civil."
                    }
            );
            Quiz.test.add(q5);
            
            //Questão 6 resposta índice 2
            Question q6 = new Question(
                    "Qual alternativa relaciona três militares que assumiram a presidência do Brasil durante o golpe militar?",
                    2,
                    new String[]{
                        "A - Deodoro da Fonseca, Floriano Peixoto, Ernesto Geisel",
                        "B - Emílio Garrastazu Médici, Getúlio Vargas, Gaspar Dutra",
                        "C - Erneto Geisel, João Figueiredo, Emílio Garrastazu Médici",
                        "D - Getúlio Vargas, Tancredo Neves, Catulo da Paixão Cearense"
                    }
            );
            Quiz.test.add(q6);
            
            //Questão 7 resposta índice 3
            Question q7 = new Question(
                    "Quem era o presidente civil deposto pelo golpe militar?",
                    3,
                    new String[]{
                        "A - Tancredo Neves",
                        "B - Luis Inácio Lula da Silva",
                        "C - Fernando Collor de Melo",
                        "D - João Goulart"
                    }
            );
            Quiz.test.add(q7);
            
            //Questão 8 resposta índice 1
            Question q8 = new Question(
                    "Quem foi o presidente eleito por voto INDIRETO após o fim do regime militar?",
                    1,
                    new String[]{
                        "A - Fernando Henrique Cardoso",
                        "B - Tancredo Neves",
                        "C - José Sarney",
                        "D - Lula"
                    }
            );
            Quiz.test.add(q8);
            
            //Questão 9 resposta índice 2
            Question q9 = new Question(
                    "Quem foi o primeiro presidente eleito por voto DIRETO do povo após o fim do regime militar?",
                    2,
                    new String[]{
                        "A - Fernando Henrique Cardoso",
                        "B - Luis Inácio Lula da Silva",
                        "C - Fernando Collor de Melo",
                        "D - Itamar Franco"
                    }
            );
            Quiz.test.add(q9);
            
            //Questão 10 resposta índice 0
            Question q10 = new Question(
                    "Quem foi o primeiro presidente militar a assumir quando ocorreu o golpe de 1964?",
                    0,
                    new String[]{
                        "A - Castelo Branco",
                        "B - Costa e Silva",
                        "C - Emílio Garrastazu Médici",
                        "D - Ernesto Geisel"
                    }
            );
            Quiz.test.add(q10);
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

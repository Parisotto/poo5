<%@page import="java.util.Collections"%>
<%@page import="quiz.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="quiz.Question"%>
<%@page import="quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int idUsuario;
    if(request.getParameter("test") != null){
        int[] respostas = new int[5];
        for(int i=0; i<5; i++){
            if(request.getParameter(Integer.toString(i)) != null){
                respostas[i] = Integer.parseInt(request.getParameter(Integer.toString(i)));
            } else {
                respostas[i] = -1;
            }
        }
        Quiz.validateTest(respostas);
        response.sendRedirect("index.jsp");
    } else {
        if(request.getParameter("usuario") != null){
            if(request.getParameter("usuario") != ""){
                Quiz.setUsu(request.getParameter("usuario"));
            } else {
                Quiz.setUsu("Anônimo");
            }
        } else {
            Quiz.setUsu("Anônimo");
        }
%>
<html>
    <head>
        <title>Teste: WebQuiz</title>
        <meta charset="UTF-8">

        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <main>
            <div> 
                <h1>Web Quiz POO</h1>
        <h2><%= Quiz.getUsu(Quiz.getUsuAtual()) %></h2>
        <form id="teste">
<%
        ArrayList<Question> test = Quiz.getTest();
        Collections.shuffle(test);
        int i = 1;
        for(Question q: test){
%>
            <fieldset>
                <legend><%= i++ %>) <%= q.getQuestion() %></legend>
<%
            int j = 0;
            for(String alternative: q.getAlternatives()){
%>
            <input type="radio" id="<%= test.indexOf(q) %><%= j %>" name="<%= test.indexOf(q) %>" value="<%= j %>"><label for="<%= test.indexOf(q) %><%= j++ %>"><%= alternative %></label>
<%
            }
%>
            </fieldset>
            <hr>
<%
        }
%>
            <input type="submit" name="test" value="Concluir">
        </form>
        </div>
        </main>
    </body>
</html>
<%
    }
%>

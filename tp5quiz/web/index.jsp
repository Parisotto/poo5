<%@page import="java.util.ArrayList"%>
<%@page import="quiz.Usuario"%>
<%@page import="quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>POO TP5 QUIZ - Home</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
<%
    if(Quiz.getUsuAtual() > -1){
        String usuario = Quiz.getUsu(Quiz.getUsuAtual());
%>
        <h1>QUIZ! <span><%= usuario %></span></h1>
        <p>Última nota: <%= 100.0 * Quiz.getLastGrade(Quiz.getUsuAtual()) %>%</p>
        <p>Média: <%= 100 * Quiz.getGradeAvarege(Quiz.getUsuAtual()) %>%</p>
        <hr>
        <table>
            <tr>
                <th>ID</th>
                <th>Usuário</th>
                <th>Última nota</th>
                <th>Média</th>
            </tr>
<%
        ArrayList<Usuario> usuarios = Quiz.getUsuList();
        for(Usuario u: usuarios){
            double db1 = 100.0 * u.getLastGrade();
            double db2 = 100.0 * Quiz.getGradeAvarege(u.getId());
%>        
            <tr>
                <td><%= u.getId() %></td>
                <td><%= u.getUsuario() %></td>
                <td><%= String.format( "%.1f", db1) %></td>
                <td><%= String.format( "%.1f", db2) %>%</td>
            </tr>
<%
        }
    }
%>
        </table>
        <form method="get" action="testex.jsp">
            <input type="text" placeholder="Nome" name="usuario" value=""><br>
            <input type="submit" value="Inicar Teste">
        </form>
    </body>
</html>

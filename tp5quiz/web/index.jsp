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
        <main>
            <div>
                <h1>Web Quiz POO</h1>
<%
    if(Quiz.getUsuAtual() > -1){
        double db1 = 100 * Quiz.getLastGrade(Quiz.getUsuAtual());
        double db2 = 100 * Quiz.getGradeAvarege(Quiz.getUsuAtual());
%>
        <h2><%= Quiz.getUsu(Quiz.getUsuAtual()) %></h2>
        <p>Última nota: <strong><%= String.format("%.0f", db1) %></strong> - Média: <strong><%= String.format("%.0f", db2) %></strong></p>
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
            db1 = 100 * u.getLastGrade();
            db2 = 100 * Quiz.getGradeAvarege(u.getId());
%>        
            <tr<% if(Quiz.getUsuAtual()==u.getId()){%> class="usu-atual"<% } %>>
                <td><%= u.getId() %></td>
                <td><%= u.getUsuario() %></td>
                <td><%= String.format("%.0f", db1) %></td>
                <td><%= String.format("%.0f", db2) %></td>
            </tr>
<%
        }
    }
%>
        </table>
        <form method="get" action="testex.jsp">
            <input type="text" autofocus placeholder="Nome" name="usuario" value="">
            <input type="submit" value="Teste">
        </form>
        </div>
        </main>
    </body>
</html>

<%-- 
    Document   : test
    Created on : 09/11/2016, 21:29:30
    Author     : Parisotto
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="quiz.Question"%>
<%@page import="quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(request.getParameter("test") != null){
        Quiz.validateTest(
            new String[]{
                request.getParameter("0"), 
                request.getParameter("1"), 
                request.getParameter("2"), 
                request.getParameter("3") 
            }
        );
        response.sendRedirect("index.jsp");
    }
%>
<html>
    <head>
        <title>Teste: WebQuiz</title>
        <meta charset="UTF-8">

        <style>
            body{
                width:600px;
                margin:20px auto;
                background: #eee;
                border:1px solid #eee;
                padding: 50px;
                border-radius: 8px;
                box-sizing: border-box;
                box-shadow: 0 0 8px #999;
            }
        </style>
    </head>
    <body>
        <h1>WebQuiz!</h1>
        <h2>Teste</h2>
        <hr>
        <form>
<%
    ArrayList<Question> test = Quiz.getTest();
    for(Question q: test){
%>
            <h4><%= q.getQuestion() %></h4>
<%
        int i = 0;
        for(String alternative: q.getAlternatives()){
%>
            <input type="radio" name="<%= test.indexOf(q) %>" value="<%= i++ %>"> <%= alternative %><br>
<%
        }
%>
            <hr>
<%
    }
%>
            <input type="submit" name="test" value="Concluir">
        </form>
    </body>
</html>

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
        <h1>QUIZ!</h1>
        <p>Última nota: <%= 100 * Quiz.getLastGrade() %>%</p>
        <p>Média: <%= 100 * Quiz.getGradeAvarege() %>%</p>
        <hr>
        <a href="testex.jsp"><button>Iniciar Teste</button></a>
    </body>
</html>

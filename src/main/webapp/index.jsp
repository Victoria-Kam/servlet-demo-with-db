<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<div style="width: 400px; height: 400px"><p>1. Создать страницу логина с формой ввода имени пользователя и пароля.
    Создать сервлет для обработки формы логина и определению
    пользователя (можно использовать предустановленные значения имени
    и пароля, в БД нет необходимости)
    Создать защищенную страницу, попасть на которую можно только после
    логина
    Все запросы к защищенной странице должны приводить к
    перенаправлению на страницу логина, если пользователь еще не
    залогинен, а если залогинен – должны всегда быть успешными
    <br><br><b>Дополнительное задание.</b>
    <br>2. Создать сервлет для вывода всех студентов группы. Информация о
    студентах должна храниться в базе данных.
    <br>3. Создать сервлет для вывода количества посещений страницы.</p></div>
<br/>
<a href="task-two">Дополнительное задание 2</a>
<a href="task-three">Дополнительное задание 3</a>


<div style="margin-left: 740px; margin-right: 980px;border-color: aqua; border-style: solid">
    <p>Основное задание</p>
    <form action="main-servlet" method="post">
        <p>Логин:</p>
        <input type="text" name="login">
        <br>
        <p>Пароль:</p>
        <input type="text" name="password">
        <div style="margin: 10px; margin-left: 35%"><button type="submit">Войти</button></div>

    </form>
</div>
</body>
</html>
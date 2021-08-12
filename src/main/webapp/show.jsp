<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="search-container">
  <form action="/find" method="post">
    <input type="text" placeholder="Search.." name="findName">
    <button type="submit" class="btn btn-warning">Search</button>
  </form>
</div>
<div class="container">
  <h2>Table Head Colors</h2>
  <a href="/create">create</a>
  <form>
    <table class="table">
      <thead class="thead-dark">
      <tr>
        <td>ID</td>
        <td>Name</td>
        <td>address</td>
        <td>phone</td>
        <td>email</td>
        <td>classroom</td>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${list}" var="h" varStatus="loop">
        <tr>
          <td>${h.name}</td>
          <td>${h.date}</td>
          <td>${h.address}</td>
          <td>${h.phone}</td>
          <td>${h.email}</td>
          <td>${h.classroom}</td>
          <td><a href="/edit?index=${loop.index}">edit</a></td>
          <td><a href="/delete?index=${loop.index}">delete</a></td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </form>
</div>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    html{
        text-align: center;
    }
</style>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Details</title>
</head>
<body>
<h1><i class="fa fa-bank"></i> JAVABANK - Customer #${user.id}</h1>

<h2><i class="fa fa-user"></i>${user.name}</h2>

<p><i class="fa fa-envelope"></i> Email: ${user.email}</p>

<p><i class="fa fa-mobile-phone"></i> Phone: ${user.phone}</p>
</body>
</html>
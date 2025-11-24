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
<h1><i class="fa fa-bank"></i> JAVABANK - Customer #${customer.id}</h1>

<h2><i class="fa fa-user"></i>${customer.name}</h2>

<p><i class="fa fa-envelope"></i> Email: ${customer.email}</p>

<p><i class="fa fa-mobile-phone"></i> Phone: ${customer.phone}</p>
</body>
</html>
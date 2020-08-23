<%-- 
    Document   : home
    Created on : Aug 22, 2020, 5:29:27 PM
    Author     : lokesh
--%>

<%@page import = "java.util.Scanner" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
            int coef = 3;    // Declaritive tag
            

            %>
        
        <h1>Hello World!</h1>
        <%
            out.println(7+5);        // Scriplet Tag

            %>
            
            My favourite number is : <%= coef %>
            
       
    </body>
</html>

<%@ page import="java.util.Date" %>
    <html>

    <body>

        <h2>Display Even Numbers between 1 and 20</h2>
        <% for (int i=1; i <=20; i++) { if (i % 2==0) { out.println(i + "<br>" ); } } %>

            <h2>Display Factorial of 7</h2>
            <% int fact=1; for (int i=1; i <=7; i++) { fact *=i; } out.println("Factorial of 7 is: " + fact + " <br>");
                %>

                <h2>Multiplication Table of 5</h2>
                <% for (int i=1; i <=10; i++) { out.println("5 x " + i + "=" + (5 * i) + " <br>");
                    }
                    %>

                    <h2>Display Current Date and Time</h2>
                    <% Date now=new Date(); out.println("Current Date and Time: " + now.toString());
    %>

</body>
</html>
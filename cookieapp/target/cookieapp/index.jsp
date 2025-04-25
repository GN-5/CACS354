<html>

<body>
    <h2>Display Even Numbers between 1 and 20</h2>
    <% for (int i=1; i <=20; i++) { if (i % 2==0) { out.println(i + "<br>" ); } } %>

        <h2>Display Factorial of 7</h2>
        <% int factorial=1; for (int i=1; i <=7; i++) { factorial *=i; } out.println("Factorial of 7
            is: " + factorial + " <br>");
            %>

            <h2>Multiplication Table of 5</h2>
            <% for (int i=1; i <=10; i++) { out.println("5 x " + i + "=" + (5 * i) + " <br>");
                }
                %>

                <h2>Display Current Date and Time</h2>
                <% java.util.Date date=new java.util.Date(); out.println("Current Date and Time: " + date.toString());
    %>
</body>
</html>
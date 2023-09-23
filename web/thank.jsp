<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/> 
    </head>
    <body>
        <img src="MURACH.jpg" alt="Mo ta hinh anh" width="100" height="100">
        <h1>THANKS FOR TAKING SURVEY</h1>
        <h2>The information that you entered:</h2>
        <label>First Name:</label>
        <span>${user.firstName}</span>      <br>
        <label>Last Name:</label>
        <span>${user.lastName}</span>       <br>
        <label>Email:</label>
        <span>${user.email}</span>          <br>
        <label>Birth:</label>
        <span>${user.birth}</span>          <br>
        <label>Heard from:</label>
        <span>${user.heardFrom}</span>      <br>
        <label>Updates:</label>
        <span>${user.wantsUpdates}</span>   <br>
        <label>Contact Via:</label>
        <span>${user.contactVia}</span>     <br>
    </body>
</html>

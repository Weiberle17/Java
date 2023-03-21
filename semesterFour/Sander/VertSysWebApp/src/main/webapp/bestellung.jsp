<%-- Datei: bestellung.html --%>
<jsp:useBean class="com.webapp.FormBean" id="bestellung" scope="session"/>
<jsp:setProperty name="bestellung" property="*"/>

<html>
  <body>
    <form action="details.jsp">
      <input type="text" name="Anzahl">
      <input type="text" name="Beschriftung">
      <input type="submit" value="Bestellung abschicken">
    </form>
  </body>
</html>

<%-- Datei: index.jsp --%>
<%-- <jsp:useBean class="FormBean" id="bestellung" scope="session"/> --%>
<%-- <jsp:setProperty name="bestellung" property="*"/> --%>
<html>
  <body>
    <form action="bestellung.jsp">
      <input type="text" name="Nachname">
      <input type="text" name="Vorname">
      <input type="text" name="Straße">
      <input type="text" name="PLZ">
      <input type="text" name="Ort">
      <input type="submit" value="Weiter">
    </form>
  </body>
</html>

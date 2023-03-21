<%-- Datei: details.jsp --%>
<jsp:useBean class="com.webapp.FormBean" id="bestellung" scope="session"/>

<html>
  <body>
    <table>
      <tr>
        <th>Variable</th>
        <th>Eingegebener Wert</th>
      </tr>
      <tr>
        <td>Nachname</td>
        <td><jsp:getProperty name="bestellung" property="Nachname"</td>
      </tr>
      <tr>
        <td>Vorname</td>
        <td><jsp:getProperty name="bestellung" property="Vorname"</td>
      </tr>
      <tr>
        <td>Straße</td>
        <td><jsp:getProperty name="bestellung" property="Straße"</td>
      </tr>
      <tr>
        <td>PLZ</td>
        <td><jsp:getProperty name="bestellung" property="PLZ"</td>
      </tr>
      <tr>
        <td>Ort</td>
        <td><jsp:getProperty name="bestellung" property="Ort"</td>
      </tr>
      <tr>
        <td>Anzahl</td>
        <td><jsp:getProperty name="bestellung" property="Anzahl"</td>
      </tr>
      <tr>
        <td>Beschriftung</td>
        <td><jsp:getProperty name="bestellung" property="Beschriftung"</td>
      </tr>
    </table>
  </body>
</html>

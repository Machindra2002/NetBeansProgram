<%@include file="HeaderPart.jsp" %>
<form action="Contact Us.jsp">
    <table border="1">
        <thead>
            <tr>
                <th>Roll NO</th>
                <th><input type="text" name="rno"/></th>
            </tr>
            <tr>
                <th>Student Name</th>
                <th><input type="text" name="name"/></th>
            </tr>
            <tr>
                <th>Qualification</th>
                <th><input type="text" name="qual"></th>
            </tr>
            <tr>
                <th>Percentage</th>
                <th><input type="text" name="Per"/></th>
            </tr>
             <tr>
                 <td>
                     <input type="submit" value="click"/>
                 </td>
            </tr>
        </thead>
    </table>
</form>

<%@include file="FooterPart.jsp" %>
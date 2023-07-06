<%@include file="Header.jsp" %>
<script>
    
    var state = [];
        function State() {
            sid = Number(document.getElementById("sid").value);
            sname = document.getElementById("sname").value;
          
            var obj = {
                "sid": sid,
                "sname": sname,
            }
            state.push(obj);
            Display();
        }

        function Display() {
            var data = "";
            for (i = 0; i < state.length; i++) {
                data += "<tr><td>" + state[i].sid +
                    "</td><td>" + state[i].sname +"</td></tr>"
            }
            document.getElementById("stinfo").innerHTML = data;
        }
</script>
<h1>Search State Here</h1>
<table border="2">
        <thead>
            <tr>
                <td>State Id</td>
                <td><input type="text" id="sid"></td>
            </tr>
            <tr>
                <td>State Name</td>
                <td><input type="text" id="sname"></td>
            </tr>
        </thead>
    </table>
    <br>

    <div>
        <input type="button" value="submit" onclick="State()" />
    </div>

    <hr>
    <table border="1">
        <thead>
            <th>State Id</th>
            <th>State Name</th>
            
        </thead>

        <tbody id="stinfo"></tbody>

    </table>


<%@include file="Footer.jsp" %>
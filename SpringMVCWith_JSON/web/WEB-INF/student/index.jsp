<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link href='<c:url value="/resources/css/bootstrap.min.css"></c:url>' rel="stylesheet" type="text/css"/>
        <script src='<c:url value="/resources/js/jquery.min.js"></c:url>'></script>
        <script src='<c:url value="/resources/js/bootstrap.min.js"></c:url>'></script>
        <script>
            $(document).ready(function () {
//                ClearData();
                GetAll()
                $("#btnsubmit").click(function () {
                    AddStudent();
                })
                 $("#btnupdate").click(function () {
                    UpdateStudent();
                })
                 $("#btnclear").click(function () {
                    ClearData();
                })
            })

            function GetAll() {
                $.ajax({
                    url: '/SpringMVCWith_JSON/studentlist',
                    method: 'get',
                    contentType: 'application/json',
                    success: function (resp) {
                        console.log(resp);
                        $('#tbldata').empty();
                        $.each(resp, function (i, d) {
                            $('#tbldata').append("<tr><td>" + d.rno + "</td><td>" + d.name + "</td><td>" + d.english + "</td><td>"
                                    + d.maths + "</td><td>" + d.science + "</td><td><input type='button' value='View' onclick='ViewStudent(" + d.rno + ")'/>&nbsp;\n\
                                    <input type='button' value='Delete' onclick='DeleteStudent(" + d.rno + ")'/></td></tr>")
                        })
                    }
                })
            }

            function  AddStudent() {
                var st = {"rno": $("#txtrno").val(), "name": $("#txtname").val(), "english": $("#txtenglish").val(), "maths": $("#txtmaths").val(), "science": $("#txtscience").val()};
                console.log(st)
                $.ajax({
                    url:'/SpringMVCWith_JSON/addstudent',
                    method:'post',
                    data:(st),
//                    contectType:'application/json',
                    success: function(Resp) {
                        alert("Student add successfuly");
                        $("#btnsubmit").show();
                        $("btnupdate").hide();
                        GetAll();
                    }
                })
            }
            
             function  UpdateStudent() {
                var st={"rno": $("#txtrno").val(), "name": $("#txtname").val(), "english": $("#txtenglish").val(), "maths": $("#txtmaths").val(), "science": $("#txtscience").val()};
//                console.log(st)
                $.ajax({
                    url:'/SpringMVCWith_JSON/updatestudent',
                    method:'post',
                    data:(st),
//                    contectType:'application/json',
                    success: function(Resp) {
                        alert("update successfuly");
                        ClearData();
                        GetAll();
                    }

                })
            }
            

            function ViewStudent(id) {
                $.ajax({
                    url:'/SpringMVCWith_JSON/fectchstudent/'+id,
                    method:'get',
                    contentType:'application/json',
                    success: function (resp) {
                        console.log(resp);
                        $("#txtrno").val(resp.rno);
                        $("#txtname").val(resp.name);
                        $("#txtenglish").val(resp.english);
                        $("#txtmaths").val(resp.maths);
                        $("#txtscience").val(resp.science);
                        $("#btnsubmit").hide();
                        $("btnupdate").show();
                    }
                })
            }
            
            function DeleteStudent(id) {
                $.ajax({
                    url: '/SpringMVCWith_JSON/deletestudent/'+id,
                    method: 'get',
                    success: function (resp) {
                        alert("Delete Successfully");
                        GetAll();
                    }
                })
            }

            function ClearData() {
                $("#txtrno").val("");
                $("#txtname").val("");
                $("#txtenglish").val("");
                $("#txtmaths").val("");
                $("#txtscience").val("");
                $("#btnsubmit").show();
                $("btnupdate").hide();
            }
        </script>
    </head>
    <body>
        <h1 style="text-align: center;color : red;padding: 10px">Student</h1>
        <div class="container">
            <div class="col-md-4">
                <table>
                    <tr>
                        <td>Roll No</td>
                        <td><input type="text" id="txtrno"/></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><input type="text" id="txtname"/></td>
                    </tr>
                    <tr>
                        <td>English</td>
                        <td><input type="text" id="txtenglish"/></td>
                    </tr>
                    <tr>
                        <td>Maths</td>
                        <td><input type="text" id="txtmaths"/></td>
                    </tr>
                    <tr>
                        <td>Science</td>
                        <td><input type="text" id="txtscience"/></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="button" id="btnsubmit" value="Submit" class="btn  btn-primary"/>
                            <input type="button" id="btnupdate" value="Update" class="btn  btn-info"/>
                            <input type="button" id="btnclear" value="Clear" class="btn  btn-danger"/>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="col-md-8">
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Roll No</th>
                            <th>Student Name</th>
                            <th>English</th>
                            <th>Maths</th>
                            <th>Science</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody id='tbldata'>

                    </tbody>
                </table>
            </div>
        </div>

    </body>
</html>

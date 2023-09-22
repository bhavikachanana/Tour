<%-- 
    Document   : FactUpdate
    Created on : 18 Aug, 2023, 10:32:53 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,Common.ConnectionClass,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fact Update</title>
    </head>
    <body>
        <%@include file="Header.jsp"%>
        <%!
        ConnectionClass cobj;
        PreparedStatement pst;
        ResultSet rst;
        ArrayList<Object> aobj;
        %>
        <%
        cobj = new ConnectionClass();
        cobj.Connect();
        aobj =(ArrayList<Object>)  request.getAttribute("list");
        if(aobj!=null)
            {
        %>
        <div class="col-12 grid-margin stretch-card">
                <div class="card my-5">
                  <div class="card-body">
                    <h4 class="card-title">Facts</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" method="get" action="http://localhost:8084/Tour/FactServlet">
                      <div class="form-group">
                        <label for="exampleInputName1">Fact Name</label>
                        <input type="text"  class="form-control" name="FactName" value="<%=aobj.get(1).toString()%>">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputName1">Fact Specification </label>
                        <input type="text"  class="form-control" name="FactSpeci" value="<%=aobj.get(2).toString()%>">
                        </div>
                      <button type="submit" value="Update" name="btn" class="btn btn-primary me-2">Submit</button>
                      <button type="reset" class="btn btn-dark">Reset</button>
                    </form>
                  </div>
                </div>
        </div>
        <%
        }
        %>
        <%@include file="Footer.jsp" %>
    </body>
</html>
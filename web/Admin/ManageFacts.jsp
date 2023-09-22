<%-- 
    Document   : ManageFacts.jsp
    Created on : 8 Aug, 2023, 5:45:44 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,Common.ConnectionClass"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fact Manager</title>
    </head>
    <body>
        <%@include file="Header.jsp"%>
        <%! 
            ConnectionClass cobj;
            PreparedStatement pst;
            ResultSet rst;
        %>
        <% 
            cobj=new ConnectionClass();
            cobj.Connect();
        %>
        <div class="col-12 grid-margin stretch-card">
                <div class="card my-5">
                  <div class="card-body">
                    <h4 class="card-title">Facts</h4>
                    <p class="card-description"> Edit & Delete Facts </p>
                    <form class="forms-sample" method="get" action="http://localhost:8084/Tour/AdminServlet">
                      <div class="form-group">
                        <label for="exampleInputName1">Category</label>
                        <select class="form-control" name="Categroy" style="color:white" >
                            <%
                                try{
                                pst=cobj.con.prepareStatement("Select CatID , Name from tbCategory");
                                rst=pst.executeQuery();
                                while(rst.next())
                                {
                            %>
                            <option style="color:white" value="<%=rst.getString(1)%>"> <%=rst.getString(2)%></option>
                            <%
                                }
                                rst.close();
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("Error in Category list "+ex);
                                }
                            %>
                        </select>
                      </div>
                        <div class="form-group">
                        <label for="exampleInputName1">Sub Category</label>
                        <select class="form-control" name="SubCategroy" style="color:white" >
                            <%
                                try{
                                pst=cobj.con.prepareStatement("Select SubID , Name from tbSubCategory");
                                rst=pst.executeQuery();
                                while(rst.next())
                                {
                            %>
                            <option style="color:white" value="<%=rst.getString(1)%>"> <%=rst.getString(2)%></option>
                            <%
                                }
                                rst.close();
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("Error in Sub Category list "+ex);
                                }
                            %>
                        </select>
                        </div>
                      <button type="submit" value="search" name="btn" class="btn btn-primary me-2">Submit</button>
                      <button type="reset" class="btn btn-dark">Reset</button>
                    </form>
                        <hr>
                    <h4 class="card-title">Fact Table</h4>
                    <!--<p class="card-description"> Add class <code>.table-hover</code>-->
                    </p>
                    <div class="table-responsive">
                      <table class="table table-hover">
                        <thead>
                          <tr>
                            <th>Click to Edit</th>
                            <th>Fact Name</th>
                            <th>Fact Specification</th>
                          </tr>
                        </thead>
                        <tbody>
                        <%
                        String SubID=(String)request.getAttribute("SubID");
                        try
                        {
                           // pst=cobj.con.prepareStatement("select * from tbFacts where PlannerID=(select PlannerID from tbOrganizerDashboard where  SubID=(select SubID from tbSubCategory where SubID=SubID))");
                             pst=cobj.con.prepareCall("{call findfact(?)}");
                             pst.setInt(1,Integer.parseInt(SubID));
                            if(pst.execute()==true)
                            {
                                rst = pst.getResultSet();
                            while(rst.next())
                            {%>
                          <tr>
                            <td><form method="get" action="http://localhost:8084/Tour/FactServlet">
                            <button type="submit" value="Edit" name="btn" class="btn btn-primary me-2">Edit</button>
                            <input type="text" name="idtxt" value="<%=rst.getString(1)%>" style="display:none">
                            </form> </td>
                            <td><%=rst.getString(3)%></td>
                            <td><%=rst.getString(4)%></td>
                          </tr>
                         <%}
                            rst.close();
                        }
                        }
                        catch(Exception ex)
                        {
                            System.out.println("Error in showing data "+ ex);
                        }
                        cobj.Disconnect();
                        %>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
        <%@include file="Footer.jsp"%>
    </body>
</html>
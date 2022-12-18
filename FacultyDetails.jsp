<%@page import="java.util.Date"%>
<%@ page import="pageNumber.*, java.util.*, java.io.*, java.sql.*,javax.servlet.*, javax.servlet.http.*, javax.sql.*"%>
<%
response.setContentType("text/html");
String uname = request.getParameter("name");
String email = request.getParameter("email");
int pnum = Integer.parseInt(request.getParameter("phoneNumber"));
int exp = Integer.parseInt(request.getParameter("experience"));
String psub1 = request.getParameter("sub1");
String psub2 = request.getParameter("sub2");
String psub3 = request.getParameter("sub3");
String psub4 = request.getParameter("sub4");
 ArrayList<String> a = new ArrayList<String>();
a.add("ENG1");
a.add("BEE1");
a.add("AP");
a.add("M1");
a.add("CTC");
a.add("PYTHON");
a.add("BEE2");
a.add("DS");
a.add("M2");
a.add("EC");
a.add("JAVA");
a.add("DLD");
a.add("PS");
a.add("SE");
a.add("DM");
a.add("DBMS");
a.add("ENG2");
a.add("COA");
a.add("WT");
a.add("OR");
a.add("SS");
a.add("DWDM");
a.add("OS");
a.add("TOC");
a.add("DAA");
int sem1 = 0, sem2 = 0, sem3 = 0, sem4 = 0;
Boolean f1 = false, f2 = false, f3 = false, f4 = false;
for(int i = 0; i < a.size(); i++){
    if(psub1.equals(a.get(i))){
        f1 = true;
        sem1 = (i + 5) / 5;
        break;
    }
}
for(int i = 0; i < a.size(); i++){
    if(psub2.equals(a.get(i))){
        f2 = true;
        sem2 = (i + 5) / 5;
        break;
    }
}
for(int i = 0; i < a.size(); i++){
    if(psub3.equals(a.get(i))){
        f3 = true;
        sem3 = (i + 5) / 5;
        break;
    }
}
for(int i = 0; i < a.size(); i++){
    if(psub4.equals(a.get(i))){
        f4 = true;
        sem4 = (i + 5) / 5;
        break;
    }
}

if(f1 && f2 && f3 && f4){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable?useSSL=false&allowPublicKeyRetrieval=true","root","hari@9RUSHI");
Statement stm = con.createStatement();
out.println("<center><h1>Faculty Details</h1></center>");
String q2 = "insert into facultyform(username, email, phonenumber, internalexp, pre1, semsub1, pre2, semsub2, pre3, semsub3, pre4, semsub4) values('"+uname+"', '"+email+"','"+pnum+"','"+exp+"','"+psub1+"','"+sem1+"','"+psub2+"','"+sem2+"','"+psub3+"','"+sem3+"','"+psub4+"','"+sem4+"')";
PreparedStatement stm1 = con.prepareStatement(q2);
int x = stm1.executeUpdate();
ResultSet r = stm.executeQuery("select * from facultyform order by internalexp");
%>
<div class = "container">
<div class = "row">
<div class = "col-md-2"></div>
<div class = "col-md-10">
<%
out.println("<center> <table width=100% height=100% border=1px >");
out.println("<tr> <th> Username</th> <th> Email </th> <th> Phone Number </th><th>Experience</th><th>Preferred sub1</th><th>Sem</th><th>Preferred sub2</th><th>Sem</th><th>Preferred sub3</th><th>Sem</th><th>Preferred sub4</th><th>Sem</th></tr>");
while(r.next())
{
out.println("<tr> <td> "+r.getString(1)+"</td> ");
out.println("<td> "+r.getString(2)+"</td> ");
out.println("<td> "+r.getInt(3)+"</td>");
out.println("<td> "+r.getInt(4)+"</td>");
out.println("<td> "+r.getString(5)+"</td>");
out.println("<td> "+r.getInt(6)+"</td>");
out.println("<td> "+r.getString(7)+"</td>");
out.println("<td> "+r.getInt(8)+"</td>");
out.println("<td> "+r.getString(9)+"</td>");
out.println("<td> "+r.getInt(10)+"</td>");
out.println("<td> "+r.getString(11)+"</td>");
out.println("<td> "+r.getInt(12)+"</td></tr>");
}
out.println("</table></center>");
con.close();
}
catch(SQLException sq)
{
out.println("sql exception"+sq);
}

catch(ClassNotFoundException cl)
{
out.println("class not found"+cl);
}
}
else{
   response.sendRedirect("invalidsubcode.jsp");
}
%>
</div>
</div>
</div>
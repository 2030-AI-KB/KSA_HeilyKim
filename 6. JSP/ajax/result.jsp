<%@ page contentType="text/plain;charset=UTF-8" language="java" %>
<%-- plain: 별도의 데이터셋을 받는 페이지--%>
<%
    boolean usable = (boolean)request.getAttribute("result");
%>
{
    "usable" : "<%=usable%>"
}

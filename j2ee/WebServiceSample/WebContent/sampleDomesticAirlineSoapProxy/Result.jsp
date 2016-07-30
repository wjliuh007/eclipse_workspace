<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleDomesticAirlineSoapProxyid" scope="session" class="cn.com.WebXml.DomesticAirlineSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleDomesticAirlineSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleDomesticAirlineSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleDomesticAirlineSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        cn.com.WebXml.DomesticAirlineSoap getDomesticAirlineSoap10mtemp = sampleDomesticAirlineSoapProxyid.getDomesticAirlineSoap();
if(getDomesticAirlineSoap10mtemp == null){
%>
<%=getDomesticAirlineSoap10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        cn.com.WebXml.GetDomesticCityResponseGetDomesticCityResult getDomesticCity17mtemp = sampleDomesticAirlineSoapProxyid.getDomesticCity();
if(getDomesticCity17mtemp == null){
%>
<%=getDomesticCity17mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">_any:</TD>
<TD>
<%
if(getDomesticCity17mtemp != null){
org.apache.axis.message.MessageElement[] type_any20 = getDomesticCity17mtemp.get_any();
        String temp_any20 = null;
        if(type_any20 != null){
        java.util.List list_any20= java.util.Arrays.asList(type_any20);
        temp_any20 = list_any20.toString();
        }
        %>
        <%=temp_any20%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 22:
        gotMethod = true;
        String startCity_1id=  request.getParameter("startCity27");
            java.lang.String startCity_1idTemp = null;
        if(!startCity_1id.equals("")){
         startCity_1idTemp  = startCity_1id;
        }
        String lastCity_2id=  request.getParameter("lastCity29");
            java.lang.String lastCity_2idTemp = null;
        if(!lastCity_2id.equals("")){
         lastCity_2idTemp  = lastCity_2id;
        }
        String theDate_3id=  request.getParameter("theDate31");
            java.lang.String theDate_3idTemp = null;
        if(!theDate_3id.equals("")){
         theDate_3idTemp  = theDate_3id;
        }
        String userID_4id=  request.getParameter("userID33");
            java.lang.String userID_4idTemp = null;
        if(!userID_4id.equals("")){
         userID_4idTemp  = userID_4id;
        }
        cn.com.WebXml.GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult getDomesticAirlinesTime22mtemp = sampleDomesticAirlineSoapProxyid.getDomesticAirlinesTime(startCity_1idTemp,lastCity_2idTemp,theDate_3idTemp,userID_4idTemp);
if(getDomesticAirlinesTime22mtemp == null){
%>
<%=getDomesticAirlinesTime22mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">_any:</TD>
<TD>
<%
if(getDomesticAirlinesTime22mtemp != null){
org.apache.axis.message.MessageElement[] type_any25 = getDomesticAirlinesTime22mtemp.get_any();
        String temp_any25 = null;
        if(type_any25 != null){
        java.util.List list_any25= java.util.Arrays.asList(type_any25);
        temp_any25 = list_any25.toString();
        }
        %>
        <%=temp_any25%>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2016-02-22 07:03:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/materialize.css\"/>\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/mystyle.css\"/>\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/admin.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"blue-grey lighten-5\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("        <header class=\"headnav\">\r\n");
      out.write("                        <ul id=\"slide-out\" class=\"side-nav fixed z-depth-0\">\r\n");
      out.write("                          <div class=\"center\">\r\n");
      out.write("                              <img src=\"./img/anon.jpg\" class=\"circle\" style=\"width: 150px; height: 150px; margin-top: 40px; margin-bottom: 20px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                          <li><a href=\"admin-home.jsp\" class=\"waves-effect waves-orange\"><b>Home</b></a></li>\r\n");
      out.write("                         <!--  <li class=\"no-padding\"> -->\r\n");
      out.write("                            <ul class=\"collapsible\" data-collapsible=\"accordion\">\r\n");
      out.write("                              <li>\r\n");
      out.write("                                <a class=\"collapsible-header\"><b>Maintenance</b></a>\r\n");
      out.write("                                  <div class=\"collapsible-body\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                      <li><a href=\"employeeMaintenance.action\">Employee</a></li>\r\n");
      out.write("                                      <li><a href=\"maintenance-prodsvc.jsp\">Product & Service</a></li>\r\n");
      out.write("                                      <li><a href=\"maintenance-promdisc.jsp\">Promo</a></li>\r\n");
      out.write("                                      <li><a href=\"maintenance-package.jsp\">Discount</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li>\r\n");
      out.write("                                <a class=\"collapsible-header\"><b>Transaction</b></a>\r\n");
      out.write("                                  <div class=\"collapsible-body\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                      <li><a href=\"transactions-reservation.jsp\">Reservation</a></li>\r\n");
      out.write("                                      <li><a href=\"transactions-productorder.jsp\">Product Order</a></li>\r\n");
      out.write("                                      <li><a href=\"#!\">Walk-In</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                          <li><a href=\"utilities.jsp\" class=\"waves-effect waves-orange\"><b>Utilities</b></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                       <nav class=\"z-depth-0\">\r\n");
      out.write("                         <div class=\"nav-wrapper orange\">\r\n");
      out.write("                           <a href=\"#!\" class=\"brand-logo white-text\" style=\"margin-left: 30px;\">Salon Management System</a>\r\n");
      out.write("                         \r\n");
      out.write("                           <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("                           <ul class=\"side-nav\" id=\"mobile-demo\">\r\n");
      out.write("                             <li><a href=\"admin-home.jsp\" class=\"waves-effect waves-orange\"><b>Home</b></a></li>\r\n");
      out.write("                               <ul class=\"collapsible collapsible-accordion\">\r\n");
      out.write("                                 <li>\r\n");
      out.write("                                   <a class=\"waves-effect waves-orange collapsible-header\"><b>Maintenance</b></a>\r\n");
      out.write("                                     <div class=\"collapsible-body\">\r\n");
      out.write("                                       <ul>\r\n");
      out.write("                                         <li><a href=\"maintenance-emp.jsp\">Employee</a></li>\r\n");
      out.write("                                         <li><a href=\"maintenance-prodsvc.jsp\">Product & Service</a></li>\r\n");
      out.write("                                         <li><a href=\"maintenance-promdisc.jsp\">Promo</a></li>\r\n");
      out.write("                                         <li><a href=\"maintenance-package.jsp\">Discount</a></li>\r\n");
      out.write("                                       </ul>\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                                 <li>\r\n");
      out.write("                                   <a class=\"waves-effect waves-orange collapsible-header\"><b>Transaction</b></a>\r\n");
      out.write("                                     <div class=\"collapsible-body\">\r\n");
      out.write("                                       <ul>\r\n");
      out.write("                                         <li><a href=\"transactions-reservation.jsp\">Reservation</a></li>\r\n");
      out.write("                                         <li><a href=\"transactions-productorder.jsp\">Product Order</a></li>\r\n");
      out.write("                                         <li><a href=\"#!\">Walk-In</a></li>\r\n");
      out.write("                                       </ul>\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </li>\r\n");
      out.write("                               </ul>\r\n");
      out.write("                              <li><a href=\"utilities.jsp\" class=\"waves-effect waves-orange\"><b>Utilities</b></a></li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                         </div>\r\n");
      out.write("                       </nav>\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- <article>\r\n");
      out.write("          <div class=\"wrapper\">\r\n");
      out.write("                    <div class=\"aside aside1 z-depth-1\">\r\n");
      out.write("                      <header><h5>Add Employee</h5></header>\r\n");
      out.write("\r\n");
      out.write("                      <div class=\"row\">\r\n");
      out.write("                          <form class=\"col s12\" action=\"\">\r\n");
      out.write("                              <div class=\"row\">\r\n");
      out.write("                                  <div class=\"input-field col s6 offset-s6\">\r\n");
      out.write("                                      <img  id=\"output1\" style=\"width: 120px; height: 120px;\" src=\"./img/anon.jpg\" alt=\"\"/>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s4\">\r\n");
      out.write("                                      <input id=\"empid\" type=\"text\" disabled=\"disabled\">\r\n");
      out.write("                                      <label for=\"empid\">Employee ID</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s7 offset-s1\">\r\n");
      out.write("                                      <div class=\"file-field\">\r\n");
      out.write("                                            <div class=\"btn orange\">\r\n");
      out.write("                                              <span class=\"\">File</span>\r\n");
      out.write("                                              <input type=\"file\" accept=\"image/*\" onchange=\"loadFile(event)\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"file-path-wrapper\">\r\n");
      out.write("                                              <input class=\"file-path validate\" type=\"text\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s12\">\r\n");
      out.write("                                      <input id=\"fname\" type=\"text\" class=\"validate\">\r\n");
      out.write("                                      <label for=\"fname\">First Name</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s6\">\r\n");
      out.write("                                      <input id=\"mname\" type=\"text\" class=\"validate\">\r\n");
      out.write("                                      <label for=\"mname\">Middle Name</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s6\">\r\n");
      out.write("                                      <input id=\"lname\" type=\"text\" class=\"validate\">\r\n");
      out.write("                                      <label for=\"lname\">Last Name</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s12\">\r\n");
      out.write("                                      <div class=\"input-field col s4\">\r\n");
      out.write("                                          <select>\r\n");
      out.write("                                            <option value=\"\" disabled selected>Month</option>\r\n");
      out.write("                                            <option value=\"1\">January</option>\r\n");
      out.write("                                            <option value=\"2\">February</option>\r\n");
      out.write("                                            <option value=\"3\">March</option>\r\n");
      out.write("                                            <option value=\"4\">April</option>\r\n");
      out.write("                                            <option value=\"5\">May</option>\r\n");
      out.write("                                            <option value=\"6\">June</option>\r\n");
      out.write("                                            <option value=\"7\">July</option>\r\n");
      out.write("                                            <option value=\"8\">August</option>\r\n");
      out.write("                                            <option value=\"9\">September</option>\r\n");
      out.write("                                            <option value=\"10\">October</option>\r\n");
      out.write("                                            <option value=\"11\">November</option>\r\n");
      out.write("                                            <option value=\"12\">December</option>\r\n");
      out.write("                                          </select>\r\n");
      out.write("                                          <label>Birthday</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"input-field col s2\">\r\n");
      out.write("                                          <input type=\"text\" id=\"day\" class=\"validate\" maxlength=\"2\" style=\"margin-left: -25px;\">\r\n");
      out.write("                                          <label for=\"day\" style=\"margin-left: -10px;\">Day</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"input-field col s2\">\r\n");
      out.write("                                          <input type=\"text\" id=\"year\" class=\"validate\" maxlength=\"4\" style=\"margin-left: -50px;\">\r\n");
      out.write("                                          <label for=\"year\" style=\"margin-left: -25px;\">Year</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"input-field col s4\">\r\n");
      out.write("                                            <input type=\"text\" id=\"age\" class=\"validate\" maxlength=\"3\" disabled=\"disabled\">\r\n");
      out.write("                                            <label for=\"age\">Age</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s6\">\r\n");
      out.write("                                      <p>   \r\n");
      out.write("                                            <input class=\"with-gap\" name=\"group1\" type=\"radio\" id=\"Male\" value=\"Male\" />\r\n");
      out.write("                                            <label for=\"Male\">Male</label>\r\n");
      out.write("                                            <input class=\"with-gap\" name=\"group1\" type=\"radio\" id=\"Female\" value=\"Female\" />\r\n");
      out.write("                                            <label for=\"Female\">Female</label>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s1\">\r\n");
      out.write("                                    <p style=\"margin-top: 12px; margin-left: -9px;\">(+63)</p>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s5\">\r\n");
      out.write("                                      <input type=\"text\" id=\"contact\" class=\"validate\" maxlength=\"10\">\r\n");
      out.write("                                      <label for=\"contact\">Contact Number</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s12\">\r\n");
      out.write("                                      <input type=\"text\" id=\"address\" class=\"validate\">\r\n");
      out.write("                                      <label for=\"address\">Address</label>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"input-field col s12\">\r\n");
      out.write("                                      <select multiple>\r\n");
      out.write("                                        <option value=\"\" disabled selected>Choose Position:</option>\r\n");
      out.write("                                        <option value=\"1\">Hair Stylist</option>\r\n");
      out.write("                                        <option value=\"2\">Nail Stylist</option>\r\n");
      out.write("                                        <option value=\"3\">Therapist</option>\r\n");
      out.write("                                        <option value=\"3\">Manager</option>\r\n");
      out.write("                                      </select>\r\n");
      out.write("                                      <label>Position:</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                  <a class=\"modal-trigger waves-effect waves-white btn-flat orange\" title=\"Next\" href=\"#modal1\">NEXT</a>\r\n");
      out.write("                                  <button class=\"waves-effect waves-orange btn-flat white\" type=\"reset\" value=\"Reset\" title=\"Clear\">CLEAR</button>\r\n");
      out.write("                              </div>\r\n");
      out.write("\r\n");
      out.write("                              Modal Structure\r\n");
      out.write("                                <div id=\"modal1\" class=\"modal modal-fixed-footer\" style=\"width: 450px; height: 450px;\">\r\n");
      out.write("                                  <div class=\"modal-content\">\r\n");
      out.write("                                    <h4>Employee Account</h4>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col s12\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                              <div class=\"input-field col s8 offset-s2\">\r\n");
      out.write("                                                <input id=\"username\" type=\"text\" class=\"validate\">\r\n");
      out.write("                                                <label for=\"username\">Username</label>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                              <div class=\"input-field col s8 offset-s2\">\r\n");
      out.write("                                                <input id=\"password\" type=\"password\" class=\"validate\">\r\n");
      out.write("                                                <label for=\"password\">Password</label>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                              <div class=\"input-field col s8 offset-s2\">\r\n");
      out.write("                                                <input id=\"conf-password\" type=\"password\" class=\"validate\" onkeyup=\"checkPass(); return false;\">\r\n");
      out.write("                                                <label for=\"conf-password\">Confirm Password</label>\r\n");
      out.write("                                                <span id=\"confirmMsg\" class=\"confirmMsg\"></span>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                              <div class=\"input-field col s8 offset-s2\">\r\n");
      out.write("                                                <p id=\"pass-error\"></p>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                  <div class=\"modal-footer\">\r\n");
      out.write("                                    <a href=\"#!\" class=\"modal-action modal-close waves-effect waves-green btn-flat \">CANCEL</a>\r\n");
      out.write("                                    <button href=\"#!\" class=\"modal-action waves-effect waves-green btn-flat orange\" id=\"savebtn\" disabled=\"disabled\">SAVE</button>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                          </form>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"aside aside2 z-depth-1\">\r\n");
      out.write("                      EDIT/DELETE/VIEW Employee\r\n");
      out.write("                      edit/delete/view employee\r\n");
      out.write("                    </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </article> -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  <!--Import jQuery before materialize.js-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"./js/materialize.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $( document ).ready(function(){\r\n");
      out.write("\r\n");
      out.write("        $(\".button-collapse\").sideNav();\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Upload image -->\r\n");
      out.write("\r\n");
      out.write("    <script text=\"text/javascript\">\r\n");
      out.write("      var loadFile = function(event) {\r\n");
      out.write("        var output1 = document.getElementById('output1');\r\n");
      out.write("        output1.src = URL.createObjectURL(event.target.files[0]);\r\n");
      out.write("      };\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Birthday -->\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("          $('select').material_select();\r\n");
      out.write("        });\r\n");
      out.write("      </script>\r\n");
      out.write("\r\n");
      out.write("    <!--- Modal -->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            // the \"href\" attribute of .modal-trigger must specify the modal ID that wants to be triggered\r\n");
      out.write("            $('.modal-trigger').leanModal();\r\n");
      out.write("          }); \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("          function checkPass(){\r\n");
      out.write("            var pass1 = document.getElementById('password').value;\r\n");
      out.write("            var pass2 = document.getElementById('conf-password').value;\r\n");
      out.write("            var good = \"#66cc66\";\r\n");
      out.write("            var bad = \"#ff6666\";\r\n");
      out.write("\r\n");
      out.write("            if(pass1 == pass2 && pass2 == pass1 && pass1 != null) {\r\n");
      out.write("              document.getElementById('confirmMsg').style.color = good;\r\n");
      out.write("              document.getElementById('confirmMsg').innerHTML = \"Password Match!\";\r\n");
      out.write("              document.getElementById('savebtn').disabled = false;\r\n");
      out.write("            }else{\r\n");
      out.write("              document.getElementById('confirmMsg').style.color = bad;\r\n");
      out.write("              document.getElementById('confirmMsg').style.color = bad;\r\n");
      out.write("              document.getElementById('confirmMsg').innerHTML = \"Password Do Not Match!\";\r\n");
      out.write("              document.getElementById('savebtn').disabled = true;\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("    </script>\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

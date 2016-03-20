package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/sessionval.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');

String user =(String)session.getAttribute("uname");
System.out.print(user);


if(	user == null)
{
	response.sendRedirect("index.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<!--\r\n");
      out.write("Design by TEMPLATED\r\n");
      out.write("http://templated.co\r\n");
      out.write("Released for free under the Creative Commons Attribution License\r\n");
      out.write("\r\n");
      out.write("Name       : GrassyGreen \r\n");
      out.write("Description: A two-column, fixed-width design with dark color scheme.\r\n");
      out.write("Version    : 1.0\r\n");
      out.write("Released   : 20140310\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>GrassyGreen</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Raleway:400,200,500,600,700,800,300\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<link href=\"default_ie6.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"menu-wrapper\">\r\n");
      out.write("\t\t<div id=\"menu\" class=\"container\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"current_page_item\"><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">About</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"addProduct.jsp\">Add Product</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Portfolio</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Contact</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"logout\">logout</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end #menu --> \r\n");
      out.write("\t<div id=\"header-wrapper\">\r\n");
      out.write("\t\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"#\">GrassyGreen</a></h1>\r\n");
      out.write("\t\t\t\t<p>Design by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"banner\"></div>\r\n");
      out.write("\t<div id=\"page\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Integer sit amet aliquet</h2>\r\n");
      out.write("\t\t\t\t<span class=\"byline\">Phasellus nec erat sit amet nibh pellentesque congue</span> </div>\r\n");
      out.write("\t\t\t<p>This is <strong>GrassyGreen</strong>, a free, fully standards-compliant CSS template designed by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>. The photos in this template are from <a href=\"http://fotogrph.com/\"> Fotogrph</a>. This free template is released under the <a href=\"http://templated.co/license\">Creative Commons Attribution</a> license, so you're pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :) </p>\r\n");
      out.write("\t\t\t<p>Consectetuer adipiscing elit. Nam pede erat, porta eu, lobortis eget, tempus et, tellus. Etiam neque. Vivamus consequat lorem at nisl. Nullam non wisi a sem semper eleifend. Donec mattis libero eget urna. Duis pretium velit ac mauris. Proin eu wisi suscipit nulla suscipit interdum. Aenean lectus lorem, imperdiet at, ultrices eget, ornare et, wisi. Pellentesque adipiscing purus ac magna. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.  Nullam non wisi a sem semper eleifend. Donec mattis libero eget urna. </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t<div class=\"box2\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t<h2>Integer gravida</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"style2\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Amet turpis, feugiat et sit amet</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Ornare in hendrerit in lectus</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Semper mod quis eget mi dolore</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Quam turpis feugiat sit dolor</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Amet ornare in hendrerit in lectus</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Quam turpis feugiat sit dolor</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Consequat etiam lorem phasellus</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer-wrapper\">\r\n");
      out.write("\t<div id=\"footer\" class=\"container\">\r\n");
      out.write("\t\t<div id=\"box1\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Latest Post</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"style1\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Semper mod quis eget mi dolore</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Quam turpis feugiat sit dolor</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Amet ornare in hendrerit in lectus</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Consequat etiam lorem phasellus</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Amet turpis, feugiat et sit amet</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Semper mod quisturpis nisi</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box2\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Popular Links</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"style1\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Semper mod quis eget mi dolore</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Quam turpis feugiat sit dolor</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Amet ornare in hendrerit in lectus</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Consequat etiam lorem phasellus</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Amet turpis, feugiat et sit amet</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Semper mod quisturpis nisi</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"box3\">\r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<h2>Follow Us</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p>Proin eu wisi suscipit nulla suscipit interdum. Aenean lectus lorem, imperdiet magna.</p>\r\n");
      out.write("\t\t\t<ul class=\"contact\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon icon-twitter\"><span>Twitter</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon icon-facebook\"><span>Facebook</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon icon-dribbble\"><span>Dribbble</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon icon-tumblr\"><span>Tumblr</span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"icon icon-rss\"><span>Pinterest</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button\">Read More</a> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"copyright\" class=\"container\">\r\n");
      out.write("\t<p>&copy; Untitled. All rights reserved. | Photos by <a href=\"http://fotogrph.com/\">Fotogrph</a> | Design by <a href=\"http://templated.co\" rel=\"nofollow\">TEMPLATED</a>.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

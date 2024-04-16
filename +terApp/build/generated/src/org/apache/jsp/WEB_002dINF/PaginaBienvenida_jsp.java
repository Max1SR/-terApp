package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaBienvenida_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>+terApp</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/Logo.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/pure-min.css\" integrity=\"sha384-\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@1.0.0/build/grids-responsive-min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<div id=\"layout\" class=\"pure-g\">\n");
      out.write("    <div class=\"sidebar pure-u-1 pure-u-md-1-4\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1 class=\"brand-title\">A Sample Blog</h1>\n");
      out.write("            <h2 class=\"brand-tagline\">Creating a blog layout using Pure</h2>\n");
      out.write("\n");
      out.write("            <nav class=\"nav\">\n");
      out.write("                <ul class=\"nav-list\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"pure-button\" href=\"http://purecss.io\">Pure</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"pure-button\" href=\"http://yuilibrary.com\">YUI Library</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"content pure-u-1 pure-u-md-3-4\">\n");
      out.write("        <div>\n");
      out.write("            <!-- A wrapper for all the blog posts -->\n");
      out.write("            <div class=\"posts\">\n");
      out.write("                <h1 class=\"content-subhead\">Pinned Post</h1>\n");
      out.write("\n");
      out.write("                <!-- A single blog post -->\n");
      out.write("                <section class=\"post\">\n");
      out.write("                    <header class=\"post-header\">\n");
      out.write("                        <img width=\"48\" height=\"48\" alt=\"Tilo Mitra&#x27;s avatar\" class=\"post-avatar\" src=\"img/common/tilo-avatar.png\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"post-title\">Introducing Pure</h2>\n");
      out.write("\n");
      out.write("                        <p class=\"post-meta\">\n");
      out.write("                            By <a href=\"#\" class=\"post-author\">Tilo Mitra</a> under <a class=\"post-category post-category-design\" href=\"#\">CSS</a> <a class=\"post-category post-category-pure\" href=\"#\">Pure</a>\n");
      out.write("                        </p>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"post-description\">\n");
      out.write("                        <p>\n");
      out.write("                            Yesterday at CSSConf, we launched Pure – a new CSS library. Phew! Here are the <a href=\"https://speakerdeck.com/tilomitra/pure-bliss\">slides from the presentation</a>. Although it looks pretty minimalist, we’ve been working on Pure for several months. After many iterations, we have released Pure as a set of small, responsive, CSS modules that you can use in every web project.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"posts\">\n");
      out.write("                <h1 class=\"content-subhead\">Recent Posts</h1>\n");
      out.write("\n");
      out.write("                <section class=\"post\">\n");
      out.write("                    <header class=\"post-header\">\n");
      out.write("                        <img width=\"48\" height=\"48\" alt=\"Eric Ferraiuolo&#x27;s avatar\" class=\"post-avatar\" src=\"img/common/ericf-avatar.png\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"post-title\">Everything You Need to Know About Grunt</h2>\n");
      out.write("\n");
      out.write("                        <p class=\"post-meta\">\n");
      out.write("                            By <a class=\"post-author\" href=\"#\">Eric Ferraiuolo</a> under <a class=\"post-category post-category-js\" href=\"#\">JavaScript</a>\n");
      out.write("                        </p>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"post-description\">\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"post\">\n");
      out.write("                    <header class=\"post-header\">\n");
      out.write("                        <img width=\"48\" height=\"48\" alt=\"Reid Burke&#x27;s avatar\" class=\"post-avatar\" src=\"img/common/reid-avatar.png\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"post-title\">Photos from CSSConf and JSConf</h2>\n");
      out.write("\n");
      out.write("                        <p class=\"post-meta\">\n");
      out.write("                            By <a class=\"post-author\" href=\"#\">Reid Burke</a> under <a class=\"post-category\" href=\"#\">Uncategorized</a>\n");
      out.write("                        </p>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"post-description\">\n");
      out.write("                        <div class=\"post-images pure-g\">\n");
      out.write("                            <div class=\"pure-u-1 pure-u-md-1-2\">\n");
      out.write("                                <a href=\"http://www.flickr.com/photos/uberlife/8915936174/\">\n");
      out.write("                                    <img alt=\"Photo of someone working poolside at a resort\"\n");
      out.write("                                         class=\"pure-img-responsive\"\n");
      out.write("                                         src=\"http://farm8.staticflickr.com/7448/8915936174_8d54ec76c6.jpg\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"post-image-meta\">\n");
      out.write("                                    <h3>CSSConf Photos</h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"pure-u-1 pure-u-md-1-2\">\n");
      out.write("                                <a href=\"http://www.flickr.com/photos/uberlife/8907351301/\">\n");
      out.write("                                    <img alt=\"Photo of the sunset on the beach\"\n");
      out.write("                                         class=\"pure-img-responsive\"\n");
      out.write("                                         src=\"http://farm8.staticflickr.com/7382/8907351301_bd7460cffb.jpg\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"post-image-meta\">\n");
      out.write("                                    <h3>JSConf Photos</h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"post\">\n");
      out.write("                    <header class=\"post-header\">\n");
      out.write("                        <img width=\"48\" height=\"48\" alt=\"Andrew Wooldridge&#x27;s avatar\" class=\"post-avatar\" src=\"img/common/andrew-avatar.png\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"post-title\">YUI 3.10.2 Released</h2>\n");
      out.write("\n");
      out.write("                        <p class=\"post-meta\">\n");
      out.write("                            By <a class=\"post-author\" href=\"#\">Andrew Wooldridge</a> under <a class=\"post-category post-category-yui\" href=\"#\">YUI</a>\n");
      out.write("                        </p>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <div class=\"post-description\">\n");
      out.write("                        <p>\n");
      out.write("                            We are happy to announce the release of YUI 3.10.2! You can find it now on the Yahoo! CDN, download it directly, or pull it in via npm. We’ve also updated the YUI Library website with the latest documentation.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"pure-menu pure-menu-horizontal\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"pure-menu-item\"><a href=\"http://purecss.io/\" class=\"pure-menu-link\">About</a></li>\n");
      out.write("                        <li class=\"pure-menu-item\"><a href=\"http://twitter.com/yuilibrary/\" class=\"pure-menu-link\">Twitter</a></li>\n");
      out.write("                        <li class=\"pure-menu-item\"><a href=\"http://github.com/pure-css/pure/\" class=\"pure-menu-link\">GitHub</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

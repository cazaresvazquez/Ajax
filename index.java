import java.io.*;
import javax.servlet:*;
import javax.srvlet.http.*;
public class comentarioLibro extends httpServlet{
    protected void service (HttpServletRequest request,
                                httpServletResponse response)
                                throws servletException, IOException{
                                    response.setContentType("text/plain");
                                    PrintWriter out = response.getWriter(); 
                                    //Array de descripciones
                                    String[] comentarios= 
                                    {
                                        "requiere conocimientos basicos de programacion orientada a objetos",
                                        "puede construir facilmente aplicaciones para web",
                                        "Aprendera rapidamente los principales trucos"
                                        "Introduce las principales tecnologuias de la plataforma"};
                                    
                                    int sel;
                                    //tit es el nombre del parametro enviado en 
                                    //la peticion
                                    sel=Interger.parseInt(request.getParameter("tit"));
                                    out.printIn(comentarios[sel]);
                                    out.close();
                                    
                                }
}
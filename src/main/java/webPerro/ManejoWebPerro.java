package webPerro;

import java.io.IOException;
import java.io.PrintWriter;
import javax.script.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel esteban rivera gomez
 */
//programacion II
@WebServlet("/perro")
public class ManejoWebPerro extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
       PrintWriter out=response.getWriter();   
        final int precioGran=10000;
        final int precioMed=5000;
        final int precioPeq=3000;
        
       String grandey=request.getParameter("grande");
       String medianoy=request.getParameter("mediano");
       String pequenoy=request.getParameter("pequeno");
       String horasy=request.getParameter("horas");
       
       int grandes=Integer.parseInt(grandey);
       int medianos=Integer.parseInt(medianoy);
       int pequenos=Integer.parseInt(pequenoy);
       int horasT=Integer.parseInt(horasy);
       
      int costo=(grandes*precioGran*horasT)+(medianos*precioMed*horasT)+(pequenos*precioPeq*horasT);
      int total=grandes+medianos+pequenos;
      if(total>1){
          costo=(int)(costo-(costo*0.1));
      }
       
       response.setContentType("text/html");
       
       out.println("<html>");
       out.println("<head>");
       out.println("<meta charset=\"UTF-8\">");
       out.println("<title>resultado servlet</title>");
       out.println("<link rel=\"stylesheet\" href=\"estilos.css\">");
       out.println("</head>");
       out.println("<body class='pagina'>");
       out.println("<div class=\"contenedor\">");
       out.println("<table width=600px id='enfasisColumna' >");
         out.println("<img src=\"imagenes/1_-ibuSKYP9s_MLISSK4mfcw.png\" id=\"imagen\">");
            out.println("<tr>");
            out.println("<h1 class=\"titulo\">cheems pet</h1>");
            out.println("<h3 class=\"subtitulo\">los mejores paseos de tu amigo canino</h3>");
            out.println("</tr>");
            
            out.println("<tr>");
                 out.println("<td class='columna'>");
                     out.println("cantidad perros grandes");
                 out.println("</td>");
                 out.println("<td>");
                     out.println(""+ grandes);
                 out.println("</td>");
            out.println("</tr>");


            out.println("<tr>");
               out.println("<td class='columna'>");
                     out.println("cantidad perros medianos");
             out.println("</td>");
              out.println("<td>");
                     out.println(""+medianos);
             out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
               out.println("<td class='columna'>");
                    out.println("cantidad de  perros pequeños");
             out.println("</td>");
             out.println("<td>");
                       out.println(""+pequenos);
             out.println("</td>");
            out.println("</tr>");
        out.println("</div>");
        
        out.println("<tr>");
               out.println("<td class='columna'>");
                    out.println("horas de paseo");
             out.println("</td>");
             out.println("<td>");
                       out.println(""+horasT);
             out.println("</td>");
            out.println("</tr>");
        out.println("</div>");
        
         out.println("<tr>");
               out.println("<td class='columna' id='total'>");
                    out.println("costo total del paseo");
             out.println("</td>");
             out.println("<td id='resultado'>");
                       out.println("$"+costo);
             out.println("</td>");
            out.println("</tr>");
            
            
                     out.println("<tr>");
             out.println("<td class='columna' id='total'>");
                out.println("<img class='doraemon' src=\"imagenes/doraemon-dancing.gif\" alt=\"\"/>");
             out.println("</td>");
             out.println("<td>");
                       out.println("");
             out.println("</td>");
            out.println("</tr>");
            
        out.println("</div>");
       
       
       out.close();
       
        
       
    }
}

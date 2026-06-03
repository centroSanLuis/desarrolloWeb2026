package com.harrypotter.gringots.controllers;

import com.harrypotter.gringots.dto.ConversionDTO;
import com.harrypotter.gringots.models.ConversorModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="conversion", urlPatterns = {"/conversion"})
public class ConversionController extends HttpServlet {

    private ConversorModel conversorModel;

    @Override
    public void init() throws ServletException {
        conversorModel = new ConversorModel();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Double euros = Double.valueOf(req.getParameter("euros"));

            ConversionDTO conversion = new ConversionDTO(euros);

            ConversionDTO resultado = conversorModel.calcularGaleones(conversion);

            if(resultado.getMensajeError()!=null){
                resp.sendRedirect("index.jsp?error=" + resultado.getMensajeError());
            }else{
                resp.sendRedirect("banco.jsp?galeones=" + resultado.getGaleones());
            }

        }catch (NumberFormatException e){
            resp.getWriter().print(e.getMessage());
        }

    }
}

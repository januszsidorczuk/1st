package Servlets;

import Services.EquipmentService;

import javax.persistence.Entity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name="addEntity",urlPatterns = {"/add"} )
public class EquipmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.getParameter("producer");
        req.getParameter("model");
        req.getParameter("serial");
        req.getParameter("isWorking");

        EquipmentService insertEquipmentEntity = new EquipmentService();
        insertEquipmentEntity.Put("producer","model","serial","isWorking");
    }
}

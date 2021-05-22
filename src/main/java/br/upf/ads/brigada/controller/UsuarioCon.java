package br.upf.ads.brigada.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.upf.ads.brigada.jpa.JpaUtil;

@WebServlet("/Usuario/UsuarioCon")
public class UsuarioCon extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		listar(request, response);
	}

	@SuppressWarnings("unchecked")
	private void listar(HttpServletRequest request, HttpServletResponse response) {
		try {
			EntityManager em = JpaUtil.getEntityManager();
			List<UsuarioCon> lista = em.createQuery("from Usuario").getResultList();
			request.setAttribute("lista", lista);
			em.close();
			request.getRequestDispatcher("UsuarioList.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package br.com.isaias.controller;


import br.com.isaias.model.BookEntity;
import br.com.isaias.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/livros")
public class ServletController extends HttpServlet {

    private EntityManager dbConnection;

    @Override
    public void init() {
        dbConnection = new JpaUtil().getEntityManagerFactory().createEntityManager();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String forward = "";
        String action = req.getParameter("action");
        String livroId = req.getParameter("livroId");

        if ("remove".equals(action) && (livroId != null && !livroId.equals(""))) {
            Long id = Long.parseLong(livroId);
            this.delete(id);

            req.setAttribute("livros", this.lista());
            forward = "/livro.jsp";
        }
        else if ("edita".equals(action) && (livroId != null && !livroId.equals(""))) {
            Long id = Long.parseLong(livroId);
            BookEntity livro = dbConnection.find(BookEntity.class, id);

            req.setAttribute("livro", livro);
            forward = "/form.jsp";
        }
        else if ("inclui".equals(action)) {
            forward = "/form.jsp";
        }
        else {
            req.setAttribute("listalivros", this.lista());
            forward = "/livro.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(forward);
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String livroId = req.getParameter("id");
        BookEntity livro = null;

        EntityTransaction transaction = dbConnection.getTransaction();

        try {
            transaction.begin();

            if (livroId != null && !"".equals(livroId)) {
                Long id = Long.parseLong(livroId);

                livro = dbConnection.find(BookEntity.class, id);
                livro.setTitulo(req.getParameter("titulo"));
                livro.setAutor(req.getParameter("autor"));
                livro.setResumo(req.getParameter("resumo"));
                livro.setLancamento(req.getParameter("lancamento"));
            }
            else {
                livro = new BookEntity();
                livro.setTitulo(req.getParameter("titulo"));
                livro.setAutor(req.getParameter("autor"));
                livro.setResumo(req.getParameter("resumo"));
                livro.setLancamento(req.getParameter("lancamento"));
            }
            dbConnection.persist(livro);
            dbConnection.flush();

            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Não foi possível salvar o livro: "+ e.getMessage());
        }

        req.setAttribute("listaLivros", this.lista());
        RequestDispatcher rd = req.getRequestDispatcher("/livro.jsp");
        rd.forward(req, resp);
    }

    private List<BookEntity> lista() {
        return dbConnection
                .createQuery("select l from BookEntity l", BookEntity.class)
                .getResultList();
    }

    private void delete(Long livroId) {
        EntityTransaction transaction = dbConnection.getTransaction();

        try {
            transaction.begin();

            BookEntity livro = dbConnection.find(BookEntity.class, livroId);
            dbConnection.remove(livro);
            dbConnection.flush();

            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Não foi possível deletar o livro: "+ e.getMessage());
        }
    }

    @Override
    public void destroy() {
        if (dbConnection != null && dbConnection.isOpen()) {
            dbConnection.close();
        }
    }

    }


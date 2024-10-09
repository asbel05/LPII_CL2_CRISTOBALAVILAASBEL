package Daolmp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.iUsuario;
import model.TblUsuariocl2;

public class UsuarioImp implements iUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(tblusuario);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(tblusuario);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			TblUsuariocl2 codelim = em.find(TblUsuariocl2.class, tblusuario.getIdusuariocl2());
			em.remove(codelim);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		List<TblUsuariocl2> listado = null;
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select p from TblUsuariocl2 p", TblUsuariocl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
		} finally {
			em.close();
		}
		return listado;
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		TblUsuariocl2 buscacod = null;
		try {
			em.getTransaction().begin();
			buscacod = em.find(TblUsuariocl2.class, tblusuario.getIdusuariocl2());
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.getMessage();
		} finally {
			em.close();
		}
		return buscacod;
	}

}

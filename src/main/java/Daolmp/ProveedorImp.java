package Daolmp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.iProveedor;
import model.TblProveedorcl2;

public class ProveedorImp implements iProveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(tblproveedor);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(tblproveedor);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			TblProveedorcl2 codelim = em.find(TblProveedorcl2.class, tblproveedor.getIdprooveedorcl2());
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
	public List<TblProveedorcl2> ListadoProveedor() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		List<TblProveedorcl2> listado = null;
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select p from TblProveedorcl2 p", TblProveedorcl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
		} finally {
			em.close();
		}
		return listado;
	}

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CRISTOBALAVILAASBEL");
		EntityManager em = emf.createEntityManager();
		TblProveedorcl2 buscacod = null;
		try {
			em.getTransaction().begin();
			buscacod = em.find(TblProveedorcl2.class, tblproveedor.getIdprooveedorcl2());
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

package Test;

import java.util.Date;
import java.util.List;

import Daolmp.ProveedorImp;
import model.TblProveedorcl2;
import model.TblUsuariocl2;

public class TestProveedor {

	public static void main(String[] args) {
		Date fech = new Date();

		// instanciamos las clases..
		TblProveedorcl2 tblproveedor = new TblProveedorcl2();
		ProveedorImp provimp = new ProveedorImp();

//		// METODO REGISTRAR
//		tblproveedor.setNomproveecl2("PUMA");
//		tblproveedor.setRucproveecl2("45634562342");
//		tblproveedor.setRsocialproveecl2("PUMA SAC");
//		tblproveedor.setEmailproveecl2("PUMA@gmail.com");
//		tblproveedor.setFeingproveecl2(new Date(fech.getTime()));
//		// invocamos al metodo
//		provimp.RegistrarProveedor(tblproveedor);
//		System.out.println("Proveedor registrado en la BD");
//
//		// METODO ACTUALIZAR
//		tblproveedor.setIdprooveedorcl2(2);
//		tblproveedor.setNomproveecl2("ADIDAS");
//		tblproveedor.setRucproveecl2("9874563453223");
//		tblproveedor.setRsocialproveecl2("ADIDAS SAC");
//		tblproveedor.setEmailproveecl2("adidas@gmail.com");
//		tblproveedor.setFeingproveecl2(new Date(fech.getTime()));
//		// invocamos al metodo
//		provimp.ActualizarProveedor(tblproveedor);
//		System.out.println("Proveedor actualizado en la BD");
//
//		// METODO ELIMINAR
//		tblproveedor.setIdprooveedorcl2(1);
//		provimp.EliminarProveedor(tblproveedor);
//		System.out.println("Proveedor eliminado en la BD");
//
//		// METODO LISTAR
//		List<TblProveedorcl2> listado = provimp.ListadoProveedor();
//		for (TblProveedorcl2 proveedor : listado) {
//			System.out.println("ID: " + proveedor.getIdprooveedorcl2() + ", Nombre: " + proveedor.getNomproveecl2()
//					+ ", RUC: " + proveedor.getRucproveecl2());
//		}
//
		// METODO BUSCAR
		tblproveedor.setIdprooveedorcl2(3);
		TblProveedorcl2 buscado = provimp.BuscarProveedor(tblproveedor);
		System.out.println(buscado.getIdprooveedorcl2() + " " + buscado.getNomproveecl2() + " "
				+ buscado.getRucproveecl2() + " " + buscado.getRsocialproveecl2() + " " + buscado.getEmailproveecl2()
				+ " " + buscado.getFeingproveecl2());
	}

}

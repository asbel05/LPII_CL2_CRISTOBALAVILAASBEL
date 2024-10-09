package Test;

import java.util.List;

import Daolmp.UsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		// instanciamos las clases..
		TblUsuariocl2 tblusuario = new TblUsuariocl2();
		UsuarioImp usuimp = new UsuarioImp();

		// // METODO REGISTRAR
		// tblusuario.setUsuariocl2("asbel");
		// tblusuario.setPasswordcl2("cibertec123");
		// // INVOCAMOS METODO
		// usuimp.RegistrarUsuario(tblusuario);
		// System.out.println("Usuario registrado en la BD");

		// // METODO ACTUALIZAR
		// tblusuario.setIdusuariocl2(2);
		// tblusuario.setUsuariocl2("adriano");
		// tblusuario.setPasswordcl2("idat123123213");
		// // INVOCAMOS METODO
		// usuimp.ActualizarUsuario(tblusuario);
		// System.out.println("Usuario actualizado en la BD");

		// METODO ELIMINAR
		// tblusuario.setIdusuariocl2(2);
		// usuimp.EliminarUsuario(tblusuario);
		// System.out.println("Usuario eliminado en la BD");

		// METODO LISTAR
		List<TblUsuariocl2> listado = usuimp.ListadoUsuario();
		for (TblUsuariocl2 usuario : listado) {
			System.out.println("ID: " + usuario.getIdusuariocl2() + ", Usuario: " + usuario.getUsuariocl2()
					+ ", Password: " + usuario.getPasswordcl2());
		}

		// // METODO BUSCAR
		// tblusuario.setIdusuariocl2(3);
		// TblUsuariocl2 buscado = usuimp.BuscarUsuario(tblusuario);
		// System.out.println(buscado.getIdusuariocl2() + " " +
		// buscado.getUsuariocl2() + " " + buscado.getPasswordcl2());
	}

}

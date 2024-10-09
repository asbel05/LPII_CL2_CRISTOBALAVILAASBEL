package interfaces;

import java.util.List;
import model.TblProveedorcl2;

public interface iProveedor {
//declaramos los metodos
	void RegistrarProveedor(TblProveedorcl2 tblproveedor);
	void ActualizarProveedor(TblProveedorcl2 tblproveedor);
	void EliminarProveedor(TblProveedorcl2 tblproveedor);
	List<TblProveedorcl2> ListadoProveedor();
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor);
}//fin de la interface icliente...

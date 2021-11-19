package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.cliente;
import modelo.clienteDAO;
import modelo.producto;
import modelo.productoDAO;
import modelo.proveedor;
import modelo.proveedorDAO;
import modelo.usuario;
import modelo.usuarioDAO;
import modelo.venta2;

/**
 * Servlet implementation class controlador
 */
public class controlador extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public controlador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Usuario
    usuario us = new usuario();
    usuarioDAO uDAO = new usuarioDAO();
    int cedula;
    
    //cliente
    cliente cl = new cliente();
    clienteDAO cDAO = new clienteDAO();
    int cedulac;
    
    //Proveedor
    proveedor pr = new proveedor();
    proveedorDAO pDAO = new proveedorDAO();
    int id;
    
    //Producto
    producto pd = new producto();
    productoDAO pdDAO = new productoDAO();
    int codigo;
    
    venta2 v = new venta2();
    List<venta2>Lista=new ArrayList<>();
    int item;
    int c_producto;
    String nombre_p;
    double precio;
    int cantidad;
    double subtotal;
    double ivaproducto;
    double total;
    double totaliva;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("conexion post");
		String menu = request.getParameter("menu");
		String accion = request.getParameter("accion");
		
		if(menu.equals("principal")) {
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}
		
		if(menu.equals("usuario")) {
			switch (accion) {
				case "Listar":
					List lista= uDAO.listar();
					request.setAttribute("usuario", lista);
					break;
				case "Agregar":
					String nombre_u=request.getParameter("txtnombreu");
					String c_usuario=request.getParameter("txtcedulau");
					String email_u=request.getParameter("txtemailu");
					String usuario=request.getParameter("txtusuario");
					String pass=request.getParameter("txtpass");
					us.setNombre_u(nombre_u);
					us.setC_usuario(Integer.parseInt(c_usuario));
					us.setEmail_u(email_u);
					us.setUsuario(usuario);
					us.setPass(pass);
					uDAO.agregar(us);
					request.getRequestDispatcher("controlador?menu=usuario&accion=Listar").forward(request, response);
					break;
				
				case "Editar":
					cedula= Integer.parseInt(request.getParameter("c_usuario"));
					usuario e=uDAO.listarCedula(cedula);
					request.setAttribute("usuarios", e);
					request.getRequestDispatcher("controlador?menu=usuario&accion=Listar").forward(request, response);
					break;
					
				case "Actualizar":
					String nombre_u1=request.getParameter("txtnombreu");
					String c_usuario1=request.getParameter("txtcedulau");
					String email_u1=request.getParameter("txtemailu");
					String usuario1=request.getParameter("txtusuario");
					String pass1=request.getParameter("txtpass");
					us.setNombre_u(nombre_u1);
					us.setC_usuario(cedula);
					us.setEmail_u(email_u1);
					us.setUsuario(usuario1);
					us.setPass(pass1);
					uDAO.actualizar(us);
					request.getRequestDispatcher("controlador?menu=usuario&accion=Listar").forward(request, response);

					break;
					
				case "Eliminar":
					cedula =Integer.parseInt(request.getParameter("c_usuario"));
					uDAO.delete(cedula);
					request.getRequestDispatcher("controlador?menu=usuario&accion=Listar").forward(request, response);
					break;
			}
			request.getRequestDispatcher("usuario.jsp").forward(request, response);
		
		}
		if(menu.equals("cliente")) {
			switch (accion) {
			case "Listar":
				List lista= cDAO.listar();
				request.setAttribute("cliente", lista);
				break;
			case "Agregar":
				String nombre_c=request.getParameter("txtnombrec");
				String c_cliente=request.getParameter("txtcedulac");
				String email_c=request.getParameter("txtemailc");
				String direccion_c=request.getParameter("txtdireccionc");
				String telefono_c=request.getParameter("txttelefonoc");
				cl.setNombre_c(nombre_c);
				cl.setC_cliente(Integer.parseInt(c_cliente));
				cl.setEmail_c(email_c);
				cl.setDireccion_c(direccion_c);
				cl.setTelefono_c(telefono_c);
				cDAO.agregar(cl);
				request.getRequestDispatcher("controlador?menu=cliente&accion=Listar").forward(request, response);
				break;
			
			case "Editar":
				cedulac = Integer.parseInt(request.getParameter("c_cliente"));
				cliente c =cDAO.listarCedula(cedulac);
				request.setAttribute("clientes", c);
				request.getRequestDispatcher("controlador?menu=cliente&accion=Listar").forward(request, response);
				break;
				
			case "Actualizar":
				String nombre_c1=request.getParameter("txtnombrec");
				String c_cliente1=request.getParameter("txtcedulac");
				String email_c1=request.getParameter("txtemailc");
				String direccion_c1=request.getParameter("txtdireccionc");
				String telefono_c1=request.getParameter("txttelefonoc");
				cl.setNombre_c(nombre_c1);
				cl.setC_cliente(cedulac);
				cl.setEmail_c(email_c1);
				cl.setDireccion_c(direccion_c1);
				cl.setTelefono_c(telefono_c1);
				cDAO.actualizar(cl);
				request.getRequestDispatcher("controlador?menu=cliente&accion=Listar").forward(request, response);

				break;
				
			case "Eliminar":
				cedulac =Integer.parseInt(request.getParameter("c_cliente"));
				cDAO.delete(cedulac);
				request.getRequestDispatcher("controlador?menu=cliente&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("cliente.jsp").forward(request, response);
		}
		if(menu.equals("producto")) {
			switch (accion) {
			case "Listar":
				List lista= pdDAO.listar();
				request.setAttribute("producto", lista);
				break;
			case "Agregar":
				String n_producto=request.getParameter("txtnombrepd");
				String c_producto=request.getParameter("txtcodigop");
				String ivaproducto=request.getParameter("txtiva");
				String idproveedor=request.getParameter("txtidp");
				String p_compra=request.getParameter("txtpcompra");
				String p_venta=request.getParameter("txtpventa");

				pd.setN_producto(n_producto);
				pd.setC_producto(Integer.parseInt(c_producto));
				pd.setIvaproducto(Double.parseDouble(ivaproducto));
				pd.setIdproveedor(Integer.parseInt(idproveedor));
				pd.setP_compra(Double.parseDouble(p_compra));
				pd.setP_venta(Double.parseDouble(p_venta));
				pdDAO.agregar(pd);
				request.getRequestDispatcher("controlador?menu=producto&accion=Listar").forward(request, response);
				break;
			
			case "Editar":
				codigo = Integer.parseInt(request.getParameter("c_producto"));
				producto r =pdDAO.listarCodigo(codigo);
				request.setAttribute("productos", r);
				request.getRequestDispatcher("controlador?menu=producto&accion=Listar").forward(request, response);
				break;
				
			case "Actualizar":
				String n_producto1=request.getParameter("txtnombrepd");
				String c_producto1=request.getParameter("txtcodigop");
				String ivaproducto1=request.getParameter("txtiva");
				String idproveedor1=request.getParameter("txtidp");
				String p_compra1=request.getParameter("txtpcompra");
				String p_venta1=request.getParameter("txtpventa");

				pd.setN_producto(n_producto1);
				pd.setC_producto(Integer.parseInt(c_producto1));
				pd.setIvaproducto(Double.parseDouble(ivaproducto1));
				pd.setIdproveedor(Integer.parseInt(idproveedor1));
				pd.setP_compra(Double.parseDouble(p_compra1));
				pd.setP_venta(Double.parseDouble(p_venta1));
				pdDAO.actualizar(pd);
				request.getRequestDispatcher("controlador?menu=producto&accion=Listar").forward(request, response);
				break;
				
			case "Eliminar":
				codigo = Integer.parseInt(request.getParameter("c_producto"));
				pdDAO.delete(codigo);
				request.getRequestDispatcher("controlador?menu=producto&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("producto.jsp").forward(request, response);
		}
		if(menu.equals("proveedor")) {
			switch (accion) {
			case "Listar":
				List lista= pDAO.listar();
				request.setAttribute("proveedor", lista);
				break;
				
			case "Agregar":
				String nombre_p=request.getParameter("txtnombrep");
				String idproveedor=request.getParameter("txtid");
				String ciudad_p=request.getParameter("txtciudadp");
				String direccion_p=request.getParameter("txtdireccionp");
				String telefono_p=request.getParameter("txttelefonop");
				pr.setNombre_p(nombre_p);
				pr.setIdproveedor(Integer.parseInt(idproveedor));
				pr.setCiudad_p(ciudad_p);
				pr.setDireccion_p(direccion_p);
				pr.setTelefono_p(telefono_p);
				pDAO.agregar(pr);
				request.getRequestDispatcher("controlador?menu=proveedor&accion=Listar").forward(request, response);
				break;
			
			case "Editar":
				id = Integer.parseInt(request.getParameter("idproveedor"));
				proveedor p =pDAO.listarId(id);
				request.setAttribute("proveedores", p);
				request.getRequestDispatcher("controlador?menu=proveedor&accion=Listar").forward(request, response);
				break;
				
			case "Actualizar":
				String nombre_p1=request.getParameter("txtnombrep");
				String idproveedor1=request.getParameter("txtid");
				String ciudad_p1=request.getParameter("txtciudadp");
				String direccion_p1=request.getParameter("txtdireccionp");
				String telefono_p1=request.getParameter("txttelefonop");
				pr.setNombre_p(nombre_p1);
				pr.setIdproveedor(id);
				pr.setCiudad_p(ciudad_p1);
				pr.setDireccion_p(direccion_p1);
				pr.setTelefono_p(telefono_p1);
				pDAO.actualizar(pr);
				request.getRequestDispatcher("controlador?menu=proveedor&accion=Listar").forward(request, response);

				break;
				
			case "Eliminar":
				id =Integer.parseInt(request.getParameter("idproveedor"));
				pDAO.delete(id);
				request.getRequestDispatcher("controlador?menu=proveedor&accion=Listar").forward(request, response);
				break;
			}
			request.getRequestDispatcher("proveedor.jsp").forward(request, response);
		}
		if(menu.equals("venta")) {
			switch(accion) {
				case "BuscarCliente":
					String c_cliente=request.getParameter("cedulacliente");
					cl.setC_cliente(Integer.parseInt(c_cliente));
					cliente cl=cDAO.buscar(Integer.parseInt(c_cliente));
					request.setAttribute("clienteB", cl);
					
				break;
				case "Agregar":
					total=0.0;
					item=item+1;
					c_producto=pd.getC_producto();
					nombre_p=request.getParameter("nombreproducto");
					precio=Double.parseDouble(request.getParameter("precio"));
					cantidad=Integer.parseInt(request.getParameter("cant"));
					ivaproducto=Double.parseDouble(request.getParameter("Iva"));
					subtotal=precio*cantidad;
					ivaproducto=ivaproducto*cantidad;
					v=new venta2();
					v.setItem(item);
					v.setC_producto(c_producto);
					v.setNombre_p(nombre_p);
					v.setPrecio(precio);
					v.setCantidad(cantidad);
					v.setSubtotal(subtotal);
					v.setIvaproducto(ivaproducto);
					Lista.add(v);
					for (int i = 0; i < Lista.size(); i++) {
						total = total +Lista.get(i).getSubtotal()+Lista.get(i).getIvaproducto();
					}
					for (int i = 0; i < Lista.size(); i++) {
						totaliva = totaliva +Lista.get(i).getIvaproducto();
					}
					request.setAttribute("total", total);
					request.setAttribute("totaliva", totaliva);
					request.setAttribute("productoB", pd);
					request.setAttribute("lista", Lista);
					
				case "BuscarProducto":
					String c_producto=request.getParameter("codigoproducto");
					pd.setC_producto(Integer.parseInt(c_producto));
					producto pd=pdDAO.buscar(Integer.parseInt(c_producto));
					request.setAttribute("productoB", pd);
					request.setAttribute("lista", Lista);
				break;
			}
			request.getRequestDispatcher("venta.jsp").forward(request, response);
		}
		if(menu.equals("reporte")) {
			request.getRequestDispatcher("reporte.jsp").forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

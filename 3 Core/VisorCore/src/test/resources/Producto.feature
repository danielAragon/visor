Feature: Mantenimiento de Producto
	Como Jefe de Almacen necesito realizar la gestion de Productos
	
Scenario: Registrar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Mantenimiento de Producto
	And 	luego hago clic en el boton de NuevoProducto
	And 	en la nueva pantalla escribo en el campo NombreProducto el valor de "Coca Cola"
	And 	en la nueva pantalla selecciono del combobox CategoriaProducto el valor de "Bebidas Gasificadas"
	And 	en la nueva pantalla selecciono del combobox ProveedorProducto el valor de "Coca-Cola Company"
	And 	en la nueva pantalla selecciono el radiobutton NacionalidadProducto el valor de "Importado"
	And 	en la nueva pantalla selecciono el checkbox GarantiaProducto y lo dejo en blanco
	And 	presiono el boton de GuardarProducto
	Then  el sistema me mostrara "Se guardo correctamente el producto"
	
Scenario: Actualizar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Mantenimiento de Producto
	And 	busco el producto "Fanta" para seleccionarlo de la tabla de Productos
	And 	hago clic en el boton de EditarProducto
	And 	en la nueva pantalla escribo el nombreProducto de "Glacitas"
	And 	en la nueva pantalla selecciono del combobox CategoriaProducto el valor de "Galleta"
	And 	en la nueva pantalla selecciono del combobox ProveedorProducto el valor de "Alicorp"
	And 	en la nueva pantalla selecciono el radiobutton NacionalidadProducto el valor de "Nacional"
	And 	en la nueva pantalla selecciono el checkbox GarantiaProducto y lo dejo en blanco
	And 	presiono el boton de ActualizarProducto
	Then 	el sistema me mostrara "Se actualizo correctamente el Producto"
	
Scenario: Eliminar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Mantenimiento de Producto
	And 	busco el producto "Oreo" para seleccionarlo de la tabla de Productos
	And 	hago clic en el boton de EliminarProducto
	And 	en la ventana de confirmacion hago click en Confirmar
	Then 	el sistema me mostrara "Se elimino correctamente el Producto"

Feature: Mantenimiento de Producto
Como Jefe de Almacen necesito realizar la gestion de Productos
	
Scenario: Registrar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Matenimiento de Producto
	And 	luego hago clic en el boton de Nuevo
	And 	en la nueva pantalla escribo en el campo Nombre el valor de "Sublime"
	And 	escojo una de las categorias del combo box
	And   escribo en el campo Precio del Producto el valor de "12.00"
	And 	presiono el boton de Guardar
	Then 	el sistema me mostrara el mensaje de "Se guardo correctamente el Producto"
	
Scenario: Actualizar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Matenimiento de Producto
	And 	busco el producto "Sublime" para seleccionarla de la tabla de Productos
	And 	hago clic en el boton de Editar
	And 	en la nueva pantalla escribo el nombre de "Sublime Pecanas"
	And 	en el campo de categoria escojo "Chocolates"
	And 	en el campo de precio escribo el valor de "12.00"
	And 	presiono el boton de Guardar
	Then 	el sistema me mostrara el mensaje de "Se actualizo correctamente la Producto"
	
Scenario: Eliminar Producto
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Matenimiento de Producto
	And 	busco el producto "Sublime Pecanas" para seleccionarla de la tabla de Productos
	And   hago clic en el boton Eliminar
	And   confirmo la eliminacion del producto seleccionado
	Then 	el sistema me mostrara el mensaje de "Se elimino de manera correcta el Producto"
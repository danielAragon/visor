Feature: Mantenimiento de Categoria
Como Jefe de Almacen necesito realizar la gestion de Categorias
	
Scenario: Registrar Categoria
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Matenimiento de Categoria
	And 	luego hago clic en el boton de Nuevo
	And 	en la nueva pantalla escribo en el campo Nombre el valor de "Chocolates"
	And 	presiono el boton de Guardar
	Then 	el sistema me mostrara el mensaje de "Se guardo correctamente la Categoria"
	
Scenario: Actualizar Categoria
	Given despues de iniciar sesion en la aplicacion
	When 	hago clic en el enlace de Matenimiento de Categoria
	And 	busco la categoria "Chocolates" para seleccionarla de la tabla de Categorias
	And 	hago clic en el boton de Editar
	And 	en la nueva pantalla escribo el nombre de "Lacteos"
	And 	presiono el boton de Actualizar
	Then 	el sistema me mostrara el mensaje de "Se actualizo correctamente la Categoria"
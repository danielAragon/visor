$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Categoria.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Categoria",
  "description": "Como Jefe de Almacen necesito realizar la gestion de Categorias",
  "id": "mantenimiento-de-categoria",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Registrar Categoria",
  "description": "",
  "id": "mantenimiento-de-categoria;registrar-categoria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "hago clic en el enlace de Matenimiento de Categoria",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "luego hago clic en el boton de Nuevo",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Chocolates\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "presiono el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "el sistema me mostrara el mensaje de \"Se guardo correctamente la Categoria\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 310806131,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.hago_clic_en_el_enlace_de_Matenimiento_de_Categoria()"
});
formatter.result({
  "duration": 118870,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.luego_hago_clic_en_el_boton_de_Nuevo()"
});
formatter.result({
  "duration": 321744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chocolates",
      "offset": 61
    }
  ],
  "location": "CategoriaIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 4343225,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 567192932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente la Categoria",
      "offset": 38
    }
  ],
  "location": "CategoriaIntegrationTest.el_sistema_me_mostrara_el_mensaje_de(String)"
});
formatter.result({
  "duration": 91536,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Actualizar Categoria",
  "description": "",
  "id": "mantenimiento-de-categoria;actualizar-categoria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "hago clic en el enlace de Matenimiento de Categoria",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "busco la categoria \"Chocolates\" para seleccionarla de la tabla de Categorias",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "hago clic en el boton de Editar",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "en la nueva pantalla escribo el nombre de \"Lacteos\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "presiono el boton de Actualizar",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "el sistema me mostrara el mensaje de \"Se actualizo correctamente la Categoria\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 459817,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.hago_clic_en_el_enlace_de_Matenimiento_de_Categoria()"
});
formatter.result({
  "duration": 3931824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chocolates",
      "offset": 20
    }
  ],
  "location": "CategoriaIntegrationTest.busco_la_categoria_para_seleccionarla_de_la_tabla_de_Categorias(String)"
});
formatter.result({
  "duration": 17651677,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.hago_clic_en_el_boton_de_Editar()"
});
formatter.result({
  "duration": 109796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lacteos",
      "offset": 43
    }
  ],
  "location": "CategoriaIntegrationTest.en_la_nueva_pantalla_escribo_el_nombre_de(String)"
});
formatter.result({
  "duration": 64491,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegrationTest.presiono_el_boton_de_Actualizar()"
});
formatter.result({
  "duration": 15805312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente la Categoria",
      "offset": 38
    }
  ],
  "location": "CategoriaIntegrationTest.el_sistema_me_mostrara_el_mensaje_de(String)"
});
formatter.result({
  "duration": 56650,
  "status": "passed"
});
formatter.uri("Producto.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Producto",
  "description": "Como Jefe de Almacen necesito realizar la gestion de Productos",
  "id": "mantenimiento-de-producto",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Registrar Producto",
  "description": "",
  "id": "mantenimiento-de-producto;registrar-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "hago clic en el enlace de Mantenimiento de Producto",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "luego hago clic en el boton de NuevoProducto",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "en la nueva pantalla escribo en el campo NombreProducto el valor de \"Coca Cola\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "en la nueva pantalla selecciono del combobox CategoriaProducto el valor de \"Bebidas Gasificadas\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "en la nueva pantalla selecciono del combobox ProveedorProducto el valor de \"Coca-Cola Company\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "en la nueva pantalla selecciono el radiobutton NacionalidadProducto el valor de \"Importado\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "en la nueva pantalla selecciono el checkbox GarantiaProducto y lo dejo en blanco",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "presiono el boton de GuardarProducto",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "el sistema me mostrara \"Se guardo correctamente el producto\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 397049,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.hago_clic_en_el_enlace_de_Mantenimiento_de_Producto()"
});
formatter.result({
  "duration": 4123118,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.luego_hago_clic_en_el_boton_de_NuevoProducto()"
});
formatter.result({
  "duration": 113203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coca Cola",
      "offset": 69
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_NombreProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 79129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bebidas Gasificadas",
      "offset": 76
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_del_combobox_CategoriaProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 7285669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coca-Cola Company",
      "offset": 76
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_del_combobox_ProveedorProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 15092262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Importado",
      "offset": 81
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_el_radiobutton_NacionalidadProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 84859,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_el_checkbox_GarantiaProducto_y_lo_dejo_en_blanco()"
});
formatter.result({
  "duration": 33194,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.presiono_el_boton_de_GuardarProducto()"
});
formatter.result({
  "duration": 14918523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente el producto",
      "offset": 24
    }
  ],
  "location": "ProductoIntegrationTest.el_sistema_me_mostrara(String)"
});
formatter.result({
  "duration": 72869,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Actualizar Producto",
  "description": "",
  "id": "mantenimiento-de-producto;actualizar-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "hago clic en el enlace de Mantenimiento de Producto",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "busco el producto \"Fanta\" para seleccionarlo de la tabla de Productos",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "hago clic en el boton de EditarProducto",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "en la nueva pantalla escribo el nombreProducto de \"Glacitas\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "en la nueva pantalla selecciono del combobox CategoriaProducto el valor de \"Galleta\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "en la nueva pantalla selecciono del combobox ProveedorProducto el valor de \"Alicorp\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "en la nueva pantalla selecciono el radiobutton NacionalidadProducto el valor de \"Nacional\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "en la nueva pantalla selecciono el checkbox GarantiaProducto y lo dejo en blanco",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "presiono el boton de ActualizarProducto",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "el sistema me mostrara \"Se actualizo correctamente el Producto\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 287035,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.hago_clic_en_el_enlace_de_Mantenimiento_de_Producto()"
});
formatter.result({
  "duration": 840581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fanta",
      "offset": 19
    }
  ],
  "location": "ProductoIntegrationTest.busco_el_producto_para_seleccionarlo_de_la_tabla_de_Productos(String)"
});
formatter.result({
  "duration": 14264357,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.hago_clic_en_el_boton_de_EditarProducto()"
});
formatter.result({
  "duration": 127830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Glacitas",
      "offset": 51
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_escribo_el_nombreProducto_de(String)"
});
formatter.result({
  "duration": 4003840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Galleta",
      "offset": 76
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_del_combobox_CategoriaProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 11215794,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alicorp",
      "offset": 76
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_del_combobox_ProveedorProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 7878701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nacional",
      "offset": 81
    }
  ],
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_el_radiobutton_NacionalidadProducto_el_valor_de(String)"
});
formatter.result({
  "duration": 54758,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.en_la_nueva_pantalla_selecciono_el_checkbox_GarantiaProducto_y_lo_dejo_en_blanco()"
});
formatter.result({
  "duration": 19939,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.presiono_el_boton_de_ActualizarProducto()"
});
formatter.result({
  "duration": 8982689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente el Producto",
      "offset": 24
    }
  ],
  "location": "ProductoIntegrationTest.el_sistema_me_mostrara(String)"
});
formatter.result({
  "duration": 479642,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Eliminar Producto",
  "description": "",
  "id": "mantenimiento-de-producto;eliminar-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "hago clic en el enlace de Mantenimiento de Producto",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "busco el producto \"Oreo\" para seleccionarlo de la tabla de Productos",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "hago clic en el boton de EliminarProducto",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "en la ventana de confirmacion hago click en Confirmar",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "el sistema me mostrara \"Se elimino correctamente el Producto\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 403266,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.hago_clic_en_el_enlace_de_Mantenimiento_de_Producto()"
});
formatter.result({
  "duration": 442660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oreo",
      "offset": 19
    }
  ],
  "location": "ProductoIntegrationTest.busco_el_producto_para_seleccionarlo_de_la_tabla_de_Productos(String)"
});
formatter.result({
  "duration": 18539481,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.hago_clic_en_el_boton_de_EliminarProducto()"
});
formatter.result({
  "duration": 101902,
  "status": "passed"
});
formatter.match({
  "location": "ProductoIntegrationTest.en_la_ventana_de_confirmacion_hago_click_en_Confirmar()"
});
formatter.result({
  "duration": 11133945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se elimino correctamente el Producto",
      "offset": 24
    }
  ],
  "location": "ProductoIntegrationTest.el_sistema_me_mostrara(String)"
});
formatter.result({
  "duration": 61572,
  "status": "passed"
});
});
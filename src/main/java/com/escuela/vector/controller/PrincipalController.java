package com.escuela.vector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.escuela.vector.beans.PruebaConexionBdBean;
import com.escuela.vector.bo.BoPruebaConexionBd;

@Controller
@RequestMapping(value="/")
public class PrincipalController {
	
	@Autowired
	private BoPruebaConexionBd boPruebaConexion;

	 @RequestMapping(value="prueba")
	 public ModelAndView pruebaPagina () {
	 	System.out.println("prueba nuevo proyecto");
	 	return new ModelAndView("readingList");
	 }
	 
	 @RequestMapping(value="pruebaConexion")
	 public ResponseEntity<PruebaConexionBdBean> pruebaConexion(){
		 PruebaConexionBdBean respuesta;
		 respuesta = boPruebaConexion.pruebaConexion();
		 return new ResponseEntity<PruebaConexionBdBean>(respuesta,HttpStatus.OK);
	 }
}

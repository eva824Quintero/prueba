package com.escuela.vector.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.escuela.vector.beans.RespuestaBdBean;
import com.escuela.vector.dao.DaoPruebaConexionBd;
@Service
public class DaoPruebaConexionBdImpl implements DaoPruebaConexionBd {
	
	@Autowired
	private JdbcTemplate conexion;

	@Override
	public RespuestaBdBean pruebaConexion() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList("SELECT * FROM PRIVILEGIOS"));
		
		return retorno;
	}

}

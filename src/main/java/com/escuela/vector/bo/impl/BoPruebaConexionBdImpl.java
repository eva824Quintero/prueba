package com.escuela.vector.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.vector.beans.PruebaConexionBdBean;
import com.escuela.vector.beans.RespuestaBdBean;
import com.escuela.vector.bo.BoPruebaConexionBd;
import com.escuela.vector.dao.DaoPruebaConexionBd;

/**
 * The Class BoPruebaConexionBdImpl.
 */
@Service
public class BoPruebaConexionBdImpl implements BoPruebaConexionBd {
	
	/** The dao prueba conexion. */
	@Autowired
	private DaoPruebaConexionBd daoPruebaConexion;

	/* (non-Javadoc)
	 * @see com.escuela.vector.bo.BoPruebaConexionBd#pruebaConexion()
	 */
	@Override
	public PruebaConexionBdBean pruebaConexion() {
		RespuestaBdBean respuesta=daoPruebaConexion.pruebaConexion();
		PruebaConexionBdBean retorno = new PruebaConexionBdBean();
		for (int i = 0; i < respuesta.getResultadoQuery().size(); i++) {
			retorno.setCampoUno(respuesta.getResultadoQuery().get(i).get("ID_PRIVILEGIO").toString());
		}
		return retorno;
	}

}

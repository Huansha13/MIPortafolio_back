package com.yfhl.miportafolio.control.service.impl;

import com.yfhl.miportafolio.control.model.*;
import com.yfhl.miportafolio.control.model.enums.EstadoRespuestaEnum;
import com.yfhl.miportafolio.control.model.enums.MensajeEnum;
import com.yfhl.miportafolio.control.to.ResponseTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfhl.miportafolio.control.dao.PerfilDao;
import com.yfhl.miportafolio.control.service.PerfilService;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	private PerfilDao perfilDao;

	@Override
	public ResponseTo<Perfil> obtenerPerfilByUser(String username) {
		ResponseTo<Perfil> response = new ResponseTo<>(MensajeEnum.RESP_OBTENER_PERFIL_BY_USER.getValue());
		try {
			var perfil = perfilDao.obtenerPerfilByUser(username);
			if (perfil != null) {
				response.setResponse(perfil);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}
		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());

		}
		return response;
	}

	@Override
	public ResponseTo<List<CategoriaHabilidad>> obtenerCategoriaHabiidades() {
		ResponseTo<List<CategoriaHabilidad>> response = new ResponseTo<>(MensajeEnum.OBTENER_CATEGORIA_HABILIDADES.getValue());
		try {
			var catHabilidades = perfilDao.obtenerCategoriaHabiidades();
			if (catHabilidades != null && !catHabilidades.isEmpty()) {
				response.setResponse(catHabilidades);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}
		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());

		}
		return response;
	}

	@Override
	public ResponseTo<List<Proyecto>> obtenerProyectos() {
		ResponseTo<List<Proyecto>> response = new ResponseTo<>(MensajeEnum.OBTENER_PROYECTO.getValue());
		try {
			var proyecto = perfilDao.obtenerProyecto();
			if (proyecto != null && !proyecto.isEmpty()) {
				response.setResponse(proyecto);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}

		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());

		}

		return response;
	}

	@Override
	public ResponseTo<List<MiServicio>> obtenerMiServicio() {
		ResponseTo<List<MiServicio>> response = new ResponseTo<>(MensajeEnum.RESPUESTA_NULL.getValue());
		try {
			var miServicio = perfilDao.obtenerMiServicio();
			if (miServicio != null && !miServicio.isEmpty()) {
				response.setResponse(miServicio);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}
		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());
		}

		return response;
	}


	@Override
	public ResponseTo<List<Certificado>> obtenerCertificado() {
		ResponseTo<List<Certificado>> response = new ResponseTo<>(MensajeEnum.RESPUESTA_NULL.getValue());
		try {
			var certificado = perfilDao.obtenerCertificado();
			if (certificado != null && !certificado.isEmpty()) {
				response.setResponse(certificado);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());

			}
		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());
		}
		return response;
	}


	@Override
	public ResponseTo<List<Menu>> obtenerMenu() {
		ResponseTo<List<Menu>> response = new ResponseTo<>(MensajeEnum.RESP_OBTENER_MENU.getValue());
		try {
			var menu = perfilDao.obtenerMenu();
			if (menu != null && !menu.isEmpty()) {
				response.setResponse(menu);
			} else {
				response.setMessage(MensajeEnum.RESPUESTA_NULL.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}
		} catch (Exception exception) {
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
			response.setMessage(exception.getMessage());

		}
		return response;

	}

	@Override
	public ResponseTo<List<Resumen>> obtenerResumen() {
		ResponseTo<List<Resumen>> response = new ResponseTo<>(MensajeEnum.RESP_OBTENER_RESUMEN.getValue());
		try {
			var resumen = perfilDao.obtenerResumen();
			if (resumen != null && !resumen.isEmpty()) {
				response.setResponse(resumen);
			} else {
				response.setMessage(MensajeEnum.RESP_OBTENER_RESUMEN.getValue());
				response.setStatus(EstadoRespuestaEnum.NOT_FOUND.getValue());
			}
		} catch (Exception exception) {
			response.setMessage(exception.getMessage());
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());
		}
		return response;
	}

	@Override
	public ResponseTo<List<Contacto>> obtenerContacto() {
		ResponseTo<List<Contacto>> response = new ResponseTo<>(MensajeEnum.OBTENER_CONTACTO.getValue());
		try {
			var contacto = perfilDao.obtenerContacto();
			if (contacto != null && !contacto.isEmpty()) {
				response.setResponse(contacto);
			}

		} catch (Exception exception) {
			response.setMessage(exception.getMessage());
			response.setStatus(EstadoRespuestaEnum.INTERNAL_SERVER_ERROR.getValue());

		}
		return response;
	}
}


package com.geekshubsacademy.junit.reto.testing;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import com.geekshubsacademy.junit.v6.Tarea;
import com.geekshubsacademy.junit.v6.TareaRepository;

public class RetoTest {

	@Test
	public void unaTareaSeGuardaConLaFechaActual() throws SQLException {
		Tarea tarea = new Tarea("Reto Testing");
		Connection connection = mock(Connection.class);
		PreparedStatement preparedStatement = mock(PreparedStatement.class);
		when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);

		TareaRepository repository = new TareaRepository(connection);
		repository.save(tarea);
		// ¿Cómo compruebo que la tarea se guarda con la fecha actual?
	}

}

package com.aonyi.ntbpersistencia.dao;

import com.aonyi.ntbpersistencia.modelo.*;
import java.util.List;

public interface IClienteDao {
    //declaración de métodos para acceder a la base de datos
    public List<Cliente> getLista();
    public Cliente get(int id);
    public void save(Cliente cliente);
    public void delete(Cliente cliente);
}

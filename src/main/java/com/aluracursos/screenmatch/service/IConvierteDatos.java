package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    <T> T ObtenerDatos(String json, Class<T> clase);

}

package br.com.pegasus.dominio.ports.entrada.base;

public interface BasePortaEntrada<T> {
    void criar(T ator);
    T buscarPorId(Long id);
}

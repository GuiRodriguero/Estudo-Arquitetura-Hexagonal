package br.com.pegasus.dominio.ports.entrada.base;

public interface BaseUseCase<T> {
    void criar(T ator);
    T buscarPorId(Long id);
}

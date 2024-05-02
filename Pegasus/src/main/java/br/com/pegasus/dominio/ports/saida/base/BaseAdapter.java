package br.com.pegasus.dominio.ports.saida.base;

public interface BaseAdapter<T> {
    void salvar(T ator);
    T buscarPorId(Long id);
}

package br.com.pegasus.infraestrutura.adapters.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class AdapterSaidaBase<A, E> {

    public E toEntidade(A ator, Class<E> classeEntidade) {
        return converteAtributos(ator, criaInstanciaDaClasse(classeEntidade));
    }

    public A toDominio(E entidade, Class<A> classeAtor) {
        return converteAtributos(entidade, criaInstanciaDaClasse(classeAtor));
    }

    private <T, U> T converteAtributos(U fonte, T alvo) {
        for (Method metodo : fonte.getClass().getMethods()) {
            if (metodo.getName().startsWith("get")) {
                String nomeMetodoSetter = metodo.getName().replaceFirst("get", "set");
                try {
                    Method setter = alvo.getClass().getMethod(nomeMetodoSetter, metodo.getReturnType());
                    setter.invoke(alvo, metodo.invoke(fonte));
                } catch (NoSuchMethodException e) {
                    // Ignora se o alvo não tem um setter para o atributo
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Falha em realizar a conversão entre classes", e);
                }
            }
        }
        return alvo;
    }

    private <T> T criaInstanciaDaClasse(Class<T> classe) {
        try {
            return classe.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
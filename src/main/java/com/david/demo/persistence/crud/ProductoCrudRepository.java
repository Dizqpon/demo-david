package com.david.demo.persistence.crud;

import com.david.demo.persistence.entity.Categoria;
import com.david.demo.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Esta es la forma de hacerlo de manera nativa
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    List<Categoria> findByCategoriaOrderByNombreAsc(String categorias);
}

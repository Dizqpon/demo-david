package com.david.demo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    public ComprasProductoPK() {}
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComprasProductoPK that)) return false;

        if (!getIdCompra().equals(that.getIdCompra())) return false;
        return getIdProducto().equals(that.getIdProducto());
    }

    @Override
    public int hashCode() {
        int result = getIdCompra().hashCode();
        result = 31 * result + getIdProducto().hashCode();
        return result;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}

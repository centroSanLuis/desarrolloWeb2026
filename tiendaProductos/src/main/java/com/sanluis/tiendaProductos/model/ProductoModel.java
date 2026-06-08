package com.sanluis.tiendaProductos.model;

import com.sanluis.tiendaProductos.dto.ProductoDTO;

import java.util.ArrayList;

public class ProductoModel {

    private ArrayList<ProductoDTO> listaProductos;
    private static ProductoModel productoModel = null;

    private ProductoModel() {
        listaProductos = new ArrayList<>();
        listaProductos.add(new ProductoDTO("chicles", 3, 0));
    }

    public ProductoDTO getProductoByName(String nombre){
        for(ProductoDTO producto : listaProductos){
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }

        return null;
    }

    public static ProductoModel getInstance(){
        if(productoModel == null){
            productoModel = new ProductoModel();
        }

        return productoModel;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.filtrodto.clasesFiltro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pryet
 */
public  class FiltroGeneral {
    private String cadena;
    private  List<FiltroGeneral> filtros=new ArrayList<>();


    public List<FiltroGeneral> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<FiltroGeneral> filtros) {
        this.filtros = filtros;
    }

    public FiltroGeneral(String cadena) {
        this.cadena=cadena;
    }
    
    public void addFiltro(FiltroGeneral filtro){
        filtros.add(filtro);
    }

    public String filtrar(){
        for (FiltroGeneral filtro : filtros) {
            cadena+=filtro.cadena;
        }
        return cadena;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.filtrodto.clasesFiltro;

/**
 *
 * @author pryet
 */
public class TipoFiltro2 extends FiltroGeneral{

    private int edad;
   
    public TipoFiltro2(int edad) {
        super(String.valueOf(edad));
    }

}

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
public class Main {
    public static void main(String[] args) {
        TipoFiltro1 f1=new TipoFiltro1("Paco");
        TipoFiltro2 f2=new TipoFiltro2(22);
        FiltroGeneral filtro=new FiltroGeneral("Tu nombre es: ");
        filtro.addFiltro(f1);
        filtro.addFiltro(f2);
        System.out.println(filtro.filtrar());
    }
}

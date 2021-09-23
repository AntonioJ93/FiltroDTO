/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.filtrodto;

/**
 *
 * @author pryet
 */
public enum WhereEnum {
    AND(" and "),
    OR(" or "),
    MAYOR_QUE(" > "),
    MENOR_QUE(" < "),
    EQUAL(" = ");
    
   private String cadena;

    private WhereEnum(String cadena) {
        this.cadena = cadena;
    }

}

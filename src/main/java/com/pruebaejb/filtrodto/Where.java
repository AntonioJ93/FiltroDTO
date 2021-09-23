/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.filtrodto;

import java.util.List;

/**
 *
 * @author pryet
 */
public class Where {
    private String campo;
    private String cadena;
    private String valor;
    
    public  Where(String campo,String valor){
        this.campo=campo;
        this.valor=valor;
    } 
    
    public void equal(){ 
        cadena=" "+campo+WhereEnum.EQUAL+valor;
    }
    public String getCadena(){
        return cadena;
    }
}

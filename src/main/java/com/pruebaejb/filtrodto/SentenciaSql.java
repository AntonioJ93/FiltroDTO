/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaejb.filtrodto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pryet
 */
public class SentenciaSql {
    
    protected String tabla;
    protected List<String> campos;
    protected List<Where> condicionesWehre;
    protected List<String> condicionesOrder;

    private SentenciaSql() {
        this.tabla = "";
        this.campos = new ArrayList<>();
        this.condicionesWehre = new ArrayList<>();
        this.condicionesOrder = new ArrayList<>();
    }
    
    
    public static SentenciaSqlBuilder Builder(){
        return new SentenciaSqlBuilder();
    }

    
    public static class SentenciaSqlBuilder{
        private SentenciaSql sentencia;
       
        private SentenciaSqlBuilder(){
            sentencia=new SentenciaSql();
        }

        public SentenciaSqlBuilder tabla(String tabla){
            sentencia.tabla=tabla;
            return this;
        }
        
        public SentenciaSqlBuilder addCampo(String campo){
            if(sentencia.campos.size()>0){
                sentencia.campos.add(","+campo);
            }else{
                sentencia.campos.add(campo);
            }
            return this;
        }
        
        public SentenciaSqlBuilder addCondicionWhere(Where condicion){
            if(sentencia.condicionesWehre.size()>0){
                sentencia.campos.add(condicion.getCadena());
            }else{
                sentencia.campos.add("Where "+condicion.getCadena());
            }
            return this;
        }
        public SentenciaSql build(){
            return sentencia;
        }
    }
}

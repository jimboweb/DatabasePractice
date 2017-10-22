/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jimstewart
 */

public class DataReader {
    private final String persistence;
    EntityManagerFactory emf;
    @PersistenceContext
    EntityManager em;


    public DataReader(){
        persistence = "DataAnalyzerPU";
        emf = Persistence.createEntityManagerFactory(persistence);
        em = emf.createEntityManager();
    }
    
    public DataReader(String persistence){
        this.persistence = persistence;
        emf = Persistence.createEntityManagerFactory(this.persistence);
        em = emf.createEntityManager();
    }

    
    public List<String> getFieldNames(String tableName){
        String queryString = "select column_name from information_schema.columns where table_name = '"+ tableName +"';";
        Query fieldQuery = em.createNativeQuery(queryString);
        
        List<String> fieldNames;
        fieldNames = fieldQuery.getResultList();
        
        return fieldNames;
    }
    
    public String[] getTables(){
        Query tableQuery = em.createNativeQuery("SHOW TABLES;");
        List<Object> tableQueryResult = tableQuery.getResultList();
        int n = tableQueryResult.size();
        String[] tableList = new String[n];
        for(int i=0;i<n; i++)
            tableList[i] = tableQueryResult.get(i).toString();
        return tableList;
    }

}


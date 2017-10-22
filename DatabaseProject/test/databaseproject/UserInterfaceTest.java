/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import databaseproject.DatabaseProject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

/**
 *
 * @author jimstewart
 */
public class UserInterfaceTest extends TestCase {
    UserInterface ui;
    public UserInterfaceTest() {
        ui = new UserInterface();
    }
    
    /**
     *
     */
    public void testPopulateComboBox(){
    List<String> columns = new ArrayList<>();
    columns.add("Joe");
    columns.add("Bob");
    columns.add("Susan");
    columns.add("Amir");
    JComboBox result = ui.populateTableCb(columns);
    DefaultComboBoxModel resultModel = (DefaultComboBoxModel)result.getModel();
    //DefaultComboBoxModel 
    int resultListSize = result.getSize().height;
    
//    if(result.equals(resultList)){
//        System.out.println("Test passed");
//    } else {
//        System.out.println("Test not passed");
//        System.out.println("List passed:");
//        for(String s:columns)
//            System.out.println(s);
//        System.out.println("List received:");
//        for(String s:resultList)
//            System.out.println(s);
//
//    }

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void testComboBox(){
        
        
    }
    
}

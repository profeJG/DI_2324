/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.clientsmanager.logic;

import es.gva.edu.sanchezgarcia.jg.clientsmanager.dto.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josegaspar
 */
public class LogicApp {
    private static List<Client> clientsList =new ArrayList<>();
    
    public static void addClient(Client c)
    {
        clientsList.add(c);
        
    }
    public static List<Client> getClientsList(){
        return clientsList;
    }
    
}

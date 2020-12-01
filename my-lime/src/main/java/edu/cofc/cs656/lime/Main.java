//package com.example.rest;

package edu.cofc.cs656;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

import business.edu.cofc.cs656.services.UserServices;


import java.util.List;

import model.edu.cofc.cs656.models.Task;
import model.edu.cofc.cs656.models.Admin;
import model.edu.cofc.cs656.models.Juicer;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.Scooter;
import model.edu.cofc.cs656.models.RegionRentalPrice;
import model.edu.cofc.cs656.models.RepairRequest;
import model.edu.cofc.cs656.models.RepairShop;

import business.edu.cofc.cs656.services.RentalPricingServices;
import business.edu.cofc.cs656.services.RepairServices;
import business.edu.cofc.cs656.services.ScooterServices;
import business.edu.cofc.cs656.services.TaskServices;
import business.edu.cofc.cs656.services.RentalPricingServices;


/**
 * Main class.
 *
 */
public class Main {
    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "http://localhost:8085/myapp/";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in com.example.rest package
        final ResourceConfig rc = new ResourceConfig().packages("business.edu.cofc.cs656.services");

        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
	{
        final HttpServer server = startServer();
        
		System.out.println(String.format("\n\nTest code started.\n\n", BASE_URI));
		UserServices.Initialize();
		TestCode();	
		UserServices.Initialize();
		System.out.println(String.format("\n\nTest code complete.", BASE_URI));
		
		System.out.println(String.format("\n\nLime app started.\nHit enter to stop it...", BASE_URI));
				
        System.in.read();
        server.stop();
    }
	
	private static void TestCode()
	{
	   //initialize services
    	UserServices userServ = new UserServices();
    	TaskServices taskServ = new TaskServices();
    	RentalPricingServices priceServ = new RentalPricingServices();
    	ScooterServices scooterServ = new ScooterServices(taskServ,priceServ);
    	RepairServices repairServ = new RepairServices();
    	
    	System.out.println(userServ.toString());
    	System.out.println(taskServ.toString());
    	System.out.println(priceServ.toString());
    	System.out.println(scooterServ.toString());
    	System.out.println(repairServ.toString());
    	
    //register accounts
    	Admin admin1 = new Admin("adminAccount@lime.com","P@S5W0RD","Lime Owner","123-45-6789");
    	System.out.println(userServ.RegisterAdmin(admin1));
    	
    	Renter renter1 = new Renter("mike@gmail.com","12345","Mike Smith","123-45-6789");
    	Renter renter2 = new Renter("barbara@yahoo.com","54321","Barabara Miles","321-54-9876");
    	Renter renter3 = new Renter("walter@aol.com","Password","Walter Jones","987-65-4321");
    	System.out.println(userServ.RegisterRenter(renter1));
    	System.out.println(userServ.RegisterRenter(renter2));
    	System.out.println(userServ.RegisterRenter(renter3));
    	 	
    	Juicer juicer1 = new Juicer("wilma@gmail.com","drowssaP","Wilma Smith","333-33-3333");
    	Juicer juicer2 = new Juicer("jim@yahoo.com","hello","Jim Hughes","222-22-2222");  
    	Juicer juicer3 = new Juicer("wilma@gmail.com","abcdefg","Wilma Smith","333-33-3333");
    	System.out.println(userServ.RegisterJuicer(juicer1));
    	System.out.println(userServ.RegisterJuicer(juicer2));
    	System.out.println(userServ.RegisterJuicer(juicer3));
    	
    //login as admin 
    	Admin admin;
    	admin = userServ.LoginAsAdmin("adminAccount@lime.com", "P@S5W0RD");    
    	System.out.println(userServ.toString());
    	
    	//add scooters
    	Scooter scooter1 = new Scooter("Charleston, SC");
    	Scooter scooter2 = new Scooter("Charleston, SC");
      	Scooter scooter3 = new Scooter("Columbia, SC");
    	Scooter scooter4 = new Scooter("Columbia, SC");
    	System.out.println(scooterServ.AddScooter(scooter1));
    	System.out.println(scooterServ.AddScooter(scooter2));
    	System.out.println(scooterServ.AddScooter(scooter3));
    	System.out.println(scooterServ.AddScooter(scooter4)); 
    	
    	//add region pricing
    	System.out.println(priceServ.AddRegionRentalPrice("Charleston, SC", 25.5));
    	System.out.println(priceServ.AddRegionRentalPrice("Columbia, SC", 10.0));
    	System.out.println(priceServ.AddRegionRentalPrice("Charleston, SC", 20.0));
    	System.out.println(priceServ.AddRegionRentalPrice("Charlotte, NC", 15.0));
    	
    	//adjust region pricing
    	System.out.println(priceServ.AdjustAll(0.90));
    	System.out.println(priceServ.GetRegionRentalPrice("Charleston, SC"));
    	System.out.println(priceServ.GetRegionRentalPrice("Charlotte, NC"));
    	System.out.println(priceServ.SetRegionPrice("Charlotte, NC", 10.0));
    	System.out.println(priceServ.GetRegionRentalPrice("Charlotte, NC"));
    	
    	System.out.println(repairServ.AddRepairShop("Scooter Repair","RequestRepair@ScooterRepair.com","123 Repair Lane, Charleston SC 29409"));
    	System.out.println(repairServ.AddRepairShop("Mr Fix-it","request@MrFixIt.com","211 Walnut Street, Charleston SC 29407"));
    	System.out.println(repairServ.AddRepairShop("Scooter Repair","RequestRepair@ScooterRepair.com","123 Repair Lane, Charleston SC 29409"));
    	
    //login as renter
    	Renter renter;
    	renter = userServ.LoginAsRenter("mike@gmail.com","wrong password"); 
    	System.out.println(userServ.toString());
    	renter = userServ.LoginAsRenter("mike@gmail.com","12345"); 
    	System.out.println(userServ.toString());
    	
    	//View rentals
    	List<Scooter> scooters = scooterServ.ViewScooters();
    	scooters.forEach((temp) -> {System.out.println(temp.toString());});
    	
    	//Rent Scooter
    	System.out.println(scooterServ.RentScooter(renter.GetUserID(), 1002));
    	scooterServ.GetScooterByID(1002).SetBatteryLevel(50);
    	
    	//View rentals
    	scooters = scooterServ.ViewScooters();
    	scooters.forEach((temp) -> {System.out.println(temp.toString());}); 
    	
    	System.out.println(scooterServ.CompleteRental(1002));

    	//View rentals
    	scooters = scooterServ.ViewScooters();
    	scooters.forEach((temp) -> {System.out.println(temp.toString());});   
    	
    	//Rent Scooter
    	System.out.println(scooterServ.RentScooter(renter.GetUserID(), 1000));
    	scooterServ.GetScooterByID(1000).SetBatteryLevel(10);    	
    	System.out.println(scooterServ.CompleteRental(1000));
    	
    	//Rent Scooter
    	System.out.println(scooterServ.RentScooter(renter.GetUserID(), 1003));
    	scooterServ.GetScooterByID(1003).SetBatteryLevel(10);
    	System.out.println(scooterServ.CompleteRental(1003));      	

    	//View rentals
    	scooters = scooterServ.ViewScooters();
    	scooters.forEach((temp) -> {System.out.println(temp.toString());});      	
    	
    //Login as Juicer
    	Juicer juicer;
    	juicer = userServ.LoginAsJuicer("wilma@gmail.com","drowssaP"); 
    	System.out.println(userServ.toString());  	
    	
    	List<Task> tasks = taskServ.ViewAllTasks();
    	tasks.forEach((temp) -> {System.out.println(temp.toString());}); 
    	
    
    	
        
        

    	System.out.println(repairServ.AddRepairRequest(1000,"Battery not charging."));
    	System.out.println(repairServ.AddRepairRequest(1001,"Front wheel does not turn."));
    	System.out.println(repairServ.AddRepairRequest(1003,"Rear wheel does not spin."));
    	
    	
    	List<RepairRequest> repairRequests = repairServ.ViewRepairRequests();
    	repairRequests.forEach((temp) -> {System.out.println(temp.toString());}); 
    	
    	List<RepairShop> repairShops = repairServ.ViewRepairShops();
    	repairShops.forEach((temp) -> {System.out.println(temp.toString());});
    	
    	
    	//System.out.println(repairService.EmailShop(rsList.get(0),  rrList.get(0));
	}
	
}





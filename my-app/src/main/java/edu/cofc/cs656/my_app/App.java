package edu.cofc.cs656.my_app;

import java.util.List;

import edu.cofc.cs656.models.Renter;
import edu.cofc.cs656.models.Juicer;
import edu.cofc.cs656.services.SignUpServices;

import edu.cofc.cs656.services.RepairServices;
import edu.cofc.cs656.models.RepairRequest;
import edu.cofc.cs656.models.RepairShop;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Renter r = new Renter();
        r.SetName("Bill");
        System.out.println( r.GetName() );
        
        Juicer j = new Juicer();
        j.SetName("Frank");
        System.out.println( j.GetName() );
        
        SignUpServices sns = new SignUpServices();
        sns.CreateUser(1);
        System.out.println( sns.toString() );
        
        RepairServices repairService = new RepairServices();
        repairService.AddRepairShop("Scooter Repair","RequestRepair@ScooterRepair.com","123 Repair Lane, Charleston SC 29409");
        repairService.AddRepairShop("Mr Fix-it","request@MrFixIt.com","211 Walnut Street, Charleston SC 29407");
        repairService.AddRepairShop("Scooter Repair","RequestRepair@ScooterRepair.com","123 Repair Lane, Charleston SC 29409");
        repairService.AddRepairRequest(10001,2,"Battery not charging.");
        repairService.AddRepairRequest(10001,1,"Front wheel does not turn.");
        repairService.AddRepairRequest(10002,1,"Rear wheel does not spin.");
        System.out.println( repairService.toString() ); 
                
        
        List<RepairRequest> rrList = repairService.ViewRepairRequests();
        
        System.out.println( rrList.get(0).GetIssueDescription()); 
        
        List<RepairShop> rsList = repairService.ViewRepairShops();
        rsList.forEach( (temp) -> { System.out.println( temp.toString() ); }   );
        repairService.EmailShop(rsList.get(0),  rrList.get(0));
        System.out.println( repairService.toString() );
        
        
        
    }
}

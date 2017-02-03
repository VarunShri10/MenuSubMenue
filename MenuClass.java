/**
 * @author Varun
 * Aim :  This Function Will Implement menu and subItem Selection
 * Created Date : 2-02-2017
 * Modified Date :
 */
package MenuPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuClass implements IAction{
	
	
	MenuClass menuObject;			//It creates MenuList
	MenuClass menu[];				//This is array of SubMenues
	int subMenuelength;				//It is SubMenue Length
	String label;					//It denotes Choice
	int flagVariable=0;				//It checks Invalid Input from user
	static ArrayList<String> result=new ArrayList<String>();		//It contain series of Choice selected by user
	
	@Override // This Function will override actionFunction of Interface and recursively calls itself and passes Array of subMenu in it
	 public  void actionFunction(MenuClass MenuParameter[]) {
			int choice;
			if(MenuParameter.length>0){
				Scanner scannerObject=new Scanner(System.in);
				for(int index=0;index<MenuParameter.length;index++){
						System.out.println((index+1)+" : "+MenuParameter[index].label);
				}
				System.out.println("Enter Choice : ");
				choice=scannerObject.nextInt();
				if(choice<=MenuParameter.length&&choice>0){
					result.add(MenuParameter[choice-1].label);
					MenuParameter[choice-1].menuObject.actionFunction(MenuParameter[choice-1].menuObject.menu);
				}
				else{
					System.out.println("Invalid Choice");
					flagVariable=1;
				}
			}
	}
	
	// This Function will display Selected Choice
	public void display(){
		if(flagVariable==0)
		{
			int size=result.size();
			for(int index=0;index<size;index++){
			if(index==(result.size()-1))	
				System.out.print(result.get(index));
			else
				System.out.print(result.get(index)+"->");
			}
			
		}
	}
	
	
}

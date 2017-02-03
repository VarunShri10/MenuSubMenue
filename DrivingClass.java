/**
 * @author Varun
 * Aim :  This Function Will Implement menu driven Class and assign choice to menuList
 * Created Date : 2-02-2017
 * Modified Date :
 */
package MenuPackage;

public class DrivingClass {

	public static void main(String[] args) {
		
		System.out.println("Hobbies  ");
		//First Level
		MenuClass menuClassObject=new MenuClass();
		menuClassObject.menu=new MenuClass[4];
		
		menuClassObject.menu[0]=new MenuClass();			//Reading
		menuClassObject.menu[0].label="Reading";
		menuClassObject.menu[0].subMenuelength=2;
		menuClassObject.menu[0].menuObject=new MenuClass();
		menuClassObject.menu[0].menuObject.menu=new MenuClass[2];				
		
				menuClassObject.menu[0].menuObject.menu[0]=new MenuClass();				//Reading->Books
				menuClassObject.menu[0].menuObject.menu[0].label="Books";			
				menuClassObject.menu[0].menuObject.menu[0].subMenuelength=3;
				menuClassObject.menu[0].menuObject.menu[0].menuObject=new MenuClass();
				menuClassObject.menu[0].menuObject.menu[0].menuObject.menu=new MenuClass[3];		
			
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[0]=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[0].label="Academic";		//Reading -> Books-> Academic
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[0].subMenuelength=0;	
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[0].menuObject=new MenuClass();		
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[0].menuObject.menu=new MenuClass[0];
						
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[1]=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[1].label="Comics";		//Reading -> Books-> Comics
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[1].subMenuelength=0;
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[1].menuObject=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[1].menuObject.menu=new MenuClass[0];
							
				
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[2]=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[2].label="Magazine";		//Reading -> Books-> Magezine
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[2].subMenuelength=0;
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[2].menuObject=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[0].menuObject.menu[2].menuObject.menu=new MenuClass[0];
						
			
	
			
			
				menuClassObject.menu[0].menuObject.menu[1]=new MenuClass();				//Reading->Novels
				menuClassObject.menu[0].menuObject.menu[1].label="Novels";
				menuClassObject.menu[0].menuObject.menu[1].subMenuelength=2;
				menuClassObject.menu[0].menuObject.menu[1].menuObject=new MenuClass();
				menuClassObject.menu[0].menuObject.menu[1].menuObject.menu=new MenuClass[2];
						
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[0]=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[0].label="Fiction";			//Reading -> Novels -> Fiction
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[0].subMenuelength=0;
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[0].menuObject=new MenuClass();	
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[0].menuObject.menu=new MenuClass[0];
							

						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[1]=new MenuClass();
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[1].label=" Non Fiction";		//Reading -> Novels -> Fiction
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[1].subMenuelength=0;
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[1].menuObject=new MenuClass();	
						menuClassObject.menu[0].menuObject.menu[1].menuObject.menu[1].menuObject.menu=new MenuClass[0];
							


						
		
	menuClassObject.menu[1]=new MenuClass();				//Watching										
	menuClassObject.menu[1].label="Watching";
	menuClassObject.menu[1].subMenuelength=2;
	menuClassObject.menu[1].menuObject=new MenuClass();
	menuClassObject.menu[1].menuObject.menu=new MenuClass[2];	
			
			
			menuClassObject.menu[1].menuObject.menu[0]=new MenuClass();				//Watching->Movies
			menuClassObject.menu[1].menuObject.menu[0].label="Movies";
			menuClassObject.menu[1].menuObject.menu[0].subMenuelength=2;
			menuClassObject.menu[1].menuObject.menu[0].menuObject=new MenuClass();
			menuClassObject.menu[1].menuObject.menu[0].menuObject.menu=new MenuClass[2];

					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[0]=new MenuClass();
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[0].label="HollyWood";		//Watching->Movies->HolluWood
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[0].subMenuelength=0;
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[0].menuObject=new MenuClass();	
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[0].menuObject.menu=new MenuClass[0];
						

					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[1]=new MenuClass();
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[1].label="Bollywood";		//Watching->Movies->Bollywood
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[1].subMenuelength=0;
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[1].menuObject=new MenuClass();	
					menuClassObject.menu[1].menuObject.menu[0].menuObject.menu[1].menuObject.menu=new MenuClass[0];
					
			
			
			menuClassObject.menu[1].menuObject.menu[1]=new MenuClass();				//Watching->TV Shows
			menuClassObject.menu[1].menuObject.menu[1].label="TV Shows";
			menuClassObject.menu[1].menuObject.menu[1].subMenuelength=2;
			menuClassObject.menu[1].menuObject.menu[1].menuObject=new MenuClass();
			menuClassObject.menu[1].menuObject.menu[1].menuObject.menu=new MenuClass[2];

					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[0]=new MenuClass();
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[0].label="Drama";		//Watching->TV Shows->Drama
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[0].subMenuelength=0;
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[0].menuObject=new MenuClass();
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[0].menuObject.menu=new MenuClass[0];
							

					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[1]=new MenuClass();
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[1].label="Thriller";		//Watching->TV Shows->Thriller
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[1].subMenuelength=0;
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[1].menuObject=new MenuClass();	
					menuClassObject.menu[1].menuObject.menu[1].menuObject.menu[1].menuObject.menu=new MenuClass[0];
					
		
		
	menuClassObject.menu[2]=new MenuClass();			//Sports
	menuClassObject.menu[2].label="Sports";
	menuClassObject.menu[2].subMenuelength=2;
	menuClassObject.menu[2].menuObject=new MenuClass();
	menuClassObject.menu[2].menuObject.menu=new MenuClass[2];	
		
	
			menuClassObject.menu[2].menuObject.menu[0]=new MenuClass();				//Sports->Indoor
			menuClassObject.menu[2].menuObject.menu[0].label="Indoor";
			menuClassObject.menu[2].menuObject.menu[0].subMenuelength=2;
			menuClassObject.menu[2].menuObject.menu[0].menuObject=new MenuClass();
			menuClassObject.menu[2].menuObject.menu[0].menuObject.menu=new MenuClass[3];
		
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[0]=new MenuClass();
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[0].label="Table Tennis";		//Sports->Indoor->TableTennis
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[0].subMenuelength=0;
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[0].menuObject=new MenuClass();	
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[0].menuObject.menu=new MenuClass[0];
				
					
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[1]=new MenuClass();
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[1].label="Chess";		//Sports->Indoor->Chess
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[1].subMenuelength=0;	
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[1].menuObject=new MenuClass();	
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[1].menuObject.menu=new MenuClass[0];
					

					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[2]=new MenuClass();
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[2].label="Badminton";		//Sports->Indoor->Badminton
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[2].subMenuelength=0;
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[2].menuObject=new MenuClass();	
					menuClassObject.menu[2].menuObject.menu[0].menuObject.menu[2].menuObject.menu=new MenuClass[0];
					
					
			menuClassObject.menu[2].menuObject.menu[1]=new MenuClass();				//Sports->Outdoor
			menuClassObject.menu[2].menuObject.menu[1].label="Outdoor";
			menuClassObject.menu[2].menuObject.menu[1].subMenuelength=2;
			menuClassObject.menu[2].menuObject.menu[1].menuObject=new MenuClass();
			menuClassObject.menu[2].menuObject.menu[1].menuObject.menu=new MenuClass[2];
		
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[0]=new MenuClass();		//Sports->OutDoor->FootBall
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[0].label="Football";		//Sports->OutDoor->FootBall
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[0].subMenuelength=0;
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[0].menuObject=new MenuClass();	
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[0].menuObject.menu=new MenuClass[0];
				
			
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1]=new MenuClass();
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].label="Cricket";		//Sports->OutDoor->Cricket
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].subMenuelength=3;		
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject=new MenuClass();	
					menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu=new MenuClass[3];
					
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[0]=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[0].label="T20";			// Sports->OutDoor->Cricket->T20
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[0].subMenuelength=0;
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[0].menuObject=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[0].menuObject.menu=new MenuClass[0];
							
							
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[1]=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[1].label="ODI";			// Sports->OutDoor->Cricket->ODI
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[1].subMenuelength=0;
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[1].menuObject=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[1].menuObject.menu=new MenuClass[0];
							
							
							
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[2]=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[2].label="TEST";			// Sports->OutDoor->Cricket->TEST
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[2].subMenuelength=0;
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[2].menuObject=new MenuClass();
							menuClassObject.menu[2].menuObject.menu[1].menuObject.menu[1].menuObject.menu[2].menuObject.menu=new MenuClass[0];
							
							
		
	menuClassObject.menu[3]=new MenuClass();			//Exit
	menuClassObject.menu[3].label="Exit";
	menuClassObject.menu[3].subMenuelength=0;
	menuClassObject.menu[3].menuObject=new MenuClass();
	menuClassObject.menu[3].menuObject.menu=new MenuClass[0];
	
		
	
		
				menuClassObject.actionFunction(menuClassObject.menu);			//Calls To Function
				menuClassObject.display();						
				
		
			


	}
}

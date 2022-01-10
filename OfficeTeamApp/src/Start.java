
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.team.office.Team;
import com.team.office.TeamDao;
import java.io.IOException;


public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
             
		System.out.println("WelcomE to My New TCS Team Members Here ..!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to Add Team Memebers");
			System.out.println("Press 2 to Delete Team Memebers");
			System.out.println("Press 3 to Display Team Memebers");
			System.out.println("Press 4 to Exit App from Team Memebers");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1)
			{
				//add office team members..
				System.out.println("Enter User Name TCS: ");
				String name = br.readLine();
				
				System.out.println("Enter User PhoneNo TCS: ");
				String phone = br.readLine();
				
				System.out.println("Enter User City TCS: ");
				String city = br.readLine();
				
				//create team office object to store team members
				
			Team tm = new Team(name, phone, city);
			boolean answer = TeamDao.insertTeamTcsToDB(tm);
			if(answer)
			{
				System.out.println("TCS OFFICE MEMBERS OFFICALLY ADDED SUCCESFULLY......! Thank you for Visiting.: ");
			}else
			{
				System.out.println("Oops Something went wrong please try again");
			}
			
			System.out.println(tm);
				
			}else if(c == 2)
			{
				 //delete team members..
				System.out.println("Enter TCS TeamID To DELETE...! :  ");
				int officeId = Integer.parseInt(br.readLine());
				boolean f = TeamDao.deleteTeam(officeId);
				if (f)
				{
					System.out.println("Succesfully Delete you data from database...!");
				}else
				{
					System.out.println("Dosen't match your id in databases....please try correct one!");
				}
				
			}else if(c == 3)
			{
				//display team members..
				TeamDao.showAllTeam();
				
			}else if(c == 4)
			{
				//exit into the application..
				break;
			}else
			{
				
			}
		}
		
	 System.out.println("Thank you for Using our Application for Equire...! Team TCS");
	 System.out.println("See you soon if you need us then we will meet here ! Team TCS");
	}

}

package Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;

public class HomeTest1 extends BaseTest
{
		LoginClass LC;
		HomePage1 HP;
		public HomeTest1()
		{
			super();
		}
		@BeforeMethod
		public void setup() throws InterruptedException
		{
			initilization();
			LC = new LoginClass();
			HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));

		}

		@Test(groups= {"SanityTesting"})
		public void UserModule() throws InterruptedException
		{
			
			HP.Users();
		}
		
		@Test(priority=2)
		public void FeeManagementModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.FeeManagement();
		}
		
		
		@Test(priority=3)
		public void ScheduleModule() throws InterruptedException 
		{
			Thread.sleep(4000);
			HP.Schedule();
		}
		
		@Test(priority=4)
		public void ClassroomsModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Classrooms();
		}
		
		@Test(priority=5)
		public void AnnouncementsModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Announcements();
		}
		@Test(priority=6)
		public void AttendanceModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Attendance();
		}
		
		@Test(priority=7)
		public void DigitalLibraryModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.DigitalLibrary();
		}
		@Test(priority=8)
		public void AssignmentsModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Assignments();
		}
		
		@Test(priority=9)
		
	
		public void TestModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Test();
		}
		
		@Test(priority=10)
		public void aulasCareModule() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.aulasCare();
		}
		
		@Test(priority=11)
		public void profileIcon() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.profileIcon();
		}
		

		@Test(priority=12)
		public void MyProfile() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.profileIcon();
			Thread.sleep(5000);
			HP.MyProfile();
			Thread.sleep(5000);
			HP.UsersProfile();
			Thread.sleep(5000);
			HP.InstitutesDetails();
			Thread.sleep(5000);
			HP.Subscriptions();
			Thread.sleep(5000);
			HP.BankDetails();
			Thread.sleep(5000);
			HP.Settings();
			Thread.sleep(5000);
			HP.SupportDetails();
			
		}
		
		
/*
		@Test(priority=13)
		public void UsersProfile() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.UsersProfile();
		}
		@Test(priority=14)
		public void InstitutesDetails() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.InstitutesDetails();
		}
		
		@Test(priority=15)
		public void Subscriptions() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Subscriptions();
		}
		@Test(priority=16)
		public void BankDetails() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.BankDetails();
		}
		@Test(priority=17)
		public void Settings() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Settings();
		}
		@Test(priority=18)
		public void SupportDetails() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.SupportDetails();
		}
		@Test(priority=19)
		public void Logout() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Logout();
		}
		*/
	
		@Test(priority=13)
		public void Notification() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.Notification();
			Thread.sleep(4000);
			HP.ViewAll();
			Thread.sleep(4000);
			HP.OpenNotification();
			Thread.sleep(4000);
			HP.Close();
			Thread.sleep(4000);
			HP.NotificationPages();
		}
		
		
		@Test(priority=14)
		public void imgIcon() throws InterruptedException
		{
			Thread.sleep(4000);
			HP.imgIcon();
		}
	
	
}

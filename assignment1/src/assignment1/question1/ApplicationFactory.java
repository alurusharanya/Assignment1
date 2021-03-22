package assignment1.question1;

import java.util.*;
public class ApplicationFactory {	
	public String fetchApplication(int a){
		String[] app= {"Twitter","Webex","Github","Eclipse"};
		return app[--a];
}
public void applicationDetails(String ans) {
	String[][]app1= {
			{"Twitter","Twitter is a 'microblogging' system that allows you to send and receive short posts called tweets."},
			{"Webex"," webex is used for Online video conferencing, online meetings, screen sharing, online training"},
			{"Github","GitHub is a code hosting platform for version control and collaboration. It lets you and others work together on projects from anywhere."},
			{"Eclipse","Eclipse is an integrated development environment used in computer programming. It contains a base workspace and an extensible plug-in system for customizing the environment."}
	};
	
	for(int i=0;i<4;i++) {
		if(app1[i][0]==ans)
		System.out.println(app1[i][1]);
	}
}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=1;
		while(choice!=999){
		System.out.println("Select an Application:\n1.Twitter\n2.Webex\n3.Github\n4.Eclipse");
		int opt=sc.nextInt();
		ApplicationFactory af=new ApplicationFactory();
		String ans=af.fetchApplication(opt);
		af.applicationDetails(ans);
		System.out.println("Press 999 to end the application or press any number to choose application");
		choice=sc.nextInt();
	}
		System.out.println("End of application");
		sc.close();
	}

}

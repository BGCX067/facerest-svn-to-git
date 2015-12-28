package com.fb.model;

import java.net.URI;
import java.net.URL;
import java.util.List;

import com.restfb.BinaryAttachment;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.Page;
import com.restfb.types.Group;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.sun.corba.se.spi.ior.ObjectId;


public class PublicationManager
{

    
    

	public List<Publication> getPublicationsToday()
	{
		FacebookClient facebookClient = new DefaultFacebookClient("CAAIN9QYywl0BAP3igwlXypV7lJ2MZB0Yxel5JNIUlh5YXAZAQHT55ewA7jxJZCIp4nP4XPyUV6ZCMYrZCTmxdxMeZC4Jao4CoZAsh4pO49gICT4EZAa1QZAsaMlSj5lHhoPqq75qb7qYnwaO5JFQeoJSpcIqStMPW7ZBR76YdWELgbOuYmOl12j4gWcZBweHz6k35QZD");
		
		String url = "https://www.facebook.com/login.php?skip_api_login=1&api_key=2490221586&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fredirect_uri%3Dhttp%253A%252F%252Fstatic.ak.facebook.com%252Fconnect%252Fxd_arbiter.php%253Fversion%253D27%2523cb%253Df26828ce64%2526domain%253Dfr.slideshare.net%2526origin%253Dhttp%25253A%25252F%25252Ffr.slideshare.net%25252Ff2ab7f740%2526relation%253Dopener%2526frame%253Df3f32234e4%26display%3Dpopup%26scope%3Demail%252Cpublish_actions%252Cuser_about_me%252Cuser_birthday%252Cuser_location%252Cuser_website%252Cuser_work_history%26response_type%3Dtoken%252Csigned_request%26domain%3Dfr.slideshare.net%26client_id%3D2490221586%26ret%3Dlogin%26sdk%3Djoey&cancel_uri=http%3A%2F%2Fstatic.ak.facebook.com%2Fconnect%2Fxd_arbiter.php%3Fversion%3D27%23cb%3Df26828ce64%26domain%3Dfr.slideshare.net%26origin%3Dhttp%253A%252F%252Ffr.slideshare.net%252Ff2ab7f740%26relation%3Dopener%26frame%3Df3f32234e4%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup";
		
//		User user = facebookClient.fetchObject("me/feed", User.class);
//		System.out.println(user);
//		
//		FacebookType publish =facebookClient.publish("/me/feed", FacebookType.class,
//	                Parameter.with("message", "message de l'application"));
//		 		          
//		 facebookClient.deleteObject(publish.getId());
//		System.out.println("------------------------------------------");
//		Connection<FacebookType.Metadata.Connections>  app=facebookClient.fetchConnection("/me/friends",FacebookType.Metadata.Connections.class );
//		for(FacebookType.Metadata.Connections p : app.getData())
//			System.out.println(p.getPosts());
//		
//		System.out.println("------------------------------------------");
//		 Page page = facebookClient.fetchObject("cocacola", Page.class);
//		 System.out.println(page.getName());
//		System.out.println("------------------------------------------");
//		Connection<Post> posts = facebookClient.fetchConnection("me/friends", Post.class);
//		
//		for(Post p : posts.getData())
//			System.out.println(p.getCaption());
//		System.out.println("------------------------------------------");
//		Connection<User> friends = facebookClient.fetchConnection("me/friends", User.class);
//		
//		for(User p : friends.getData())
//			System.out.println(p.getName());
//		System.out.println("------------------------------------------");
//		Group group =facebookClient.fetchObject("/me",Group.class);
//		System.out.println("getId"+group.getName());
//		System.out.println("------------------------------------------");
	  ;
		return null;
	}
	
	public List<Publication> getPublicationsAll(int position)
	{
		return null;
	}
	
	public static void main(String[] args) {
		new PublicationManager().getPublicationsToday();
	}
}

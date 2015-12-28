package com.fb.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.codec.binary.Base64;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

/**
 * Servlet implementation class Controteur
 */
@WebServlet("/Controteur")
public class Controteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String fbSecretKey = "abcdefghijklmno";
	    String fbAppId = "153466254862652";
        String fbCanvasPage = "http://apps.facebook.com/example-app/";
        String fbCanvasUrl = "http://localhost:8080/JFB/";
        
        
        response.sendRedirect("https://www.facebook.com/dialog/oauth?client_id=" + fbAppId + 
        "&redirect_uri=" + URLEncoder.encode(fbCanvasUrl, "UTF-8") + 
        "&scope=publish_stream,offline_access,email");
	    
        
//		PrintWriter out=response.getWriter();
//		if(request.getParameter("signed_request") != null) {
//
//            //it is important to enable url-safe mode for Base64 encoder 
//            Base64 base64 = new Base64(true);
//
//            //split request into signature and data
//            String[] signedRequest = request.getParameter("signed_request").split("\\.", 2);
//
//            //parse signature
//            String sig = new String(base64.decode(signedRequest[0].getBytes("UTF-8")));
//
//            //parse data and convert to json object
//            JSONObject data = (JSONObject)JSONSerializer.toJSON(new String(base64.decode(signedRequest[1].getBytes("UTF-8"))));
//
//            //check signature algorithm
//            if(!data.getString("algorithm").equals("HMAC-SHA256")) {
//                //unknown algorithm is used
//                return;
//            }
//
//            //check if data is signed correctly
//            try {
//				if(!hmacSHA256(signedRequest[1], fbSecretKey).equals(sig)) {
//				    //signature is not correct, possibly the data was tampered with
//				    return;
//				}
//			} catch (Exception e) {
//			}
//
//            //check if user authorized the app
//            if(!data.has("user_id") || !data.has("oauth_token")) {
//                //this is guest, create authorization url that will be passed to javascript
//                //note that redirect_uri (page the user will be forwarded to after authorization) is set to fbCanvasUrl
//                request.setAttribute("redirectUrl", "https://www.facebook.com/dialog/oauth?client_id=" + fbAppId + 
//                        "&redirect_uri=" + URLEncoder.encode(fbCanvasUrl, "UTF-8") + 
//                        "&scope=publish_stream,offline_access,email");
//            } else {
//                //this is authorized user, get their info from Graph API using received access token
//                String accessToken = data.getString("oauth_token");
//                FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
//                User user = facebookClient.fetchObject("me", User.class);
//                request.setAttribute("user", user);
//            }
//
//        } else {
//            //this page was opened not inside facebook iframe,
//            //possibly as a post-authorization redirect.
//            //do server side forward to facebook app
//            return;
//        }
		
		
		
	}
	
    private String hmacSHA256(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKey);
        byte[] hmacData = mac.doFinal(data.getBytes("UTF-8"));
        return new String(hmacData);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}

<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
	<div class="login_form_container">
		<form id="login_form"
			action="http://www.facebook.com/login.php?login_attempt=1&amp;popup=1"
			method="post"
			onsubmit="return window.Event &amp;&amp; Event.__inlineSubmit &amp;&amp; Event.__inlineSubmit(this,event)">
			<input type="hidden" name="lsd" value="AVoFMw-f" autocomplete="off">
			<div id="loginform">
				<input type="hidden" autocomplete="off" id="api_key" name="api_key"
					value="2490221586"><input type="hidden" autocomplete="off"
					id="display" name="display" value="popup"><input
					type="hidden" autocomplete="off" id="enable_profile_selector"
					name="enable_profile_selector" value=""><input
					type="hidden" autocomplete="off" id="legacy_return"
					name="legacy_return" value="1">
					<input type="hidden"
					autocomplete="off" id="next" name="next"
					value="https://www.facebook.com/dialog/oauth?redirect_uri=http%3A%2F%2Fstatic.ak.facebook.com%2Fconnect%2Fxd_arbiter.php%3Fversion%3D27%23cb%3Df26828ce64%26domain%3Dfr.slideshare.net%26origin%3Dhttp%253A%252F%252Ffr.slideshare.net%252Ff2ab7f740%26relation%3Dopener%26frame%3Df3f32234e4&amp;display=popup&amp;scope=email%2Cpublish_actions%2Cuser_about_me%2Cuser_birthday%2Cuser_location%2Cuser_website%2Cuser_work_history&amp;response_type=token%2Csigned_request&amp;domain=fr.slideshare.net&amp;client_id=2490221586&amp;ret=login&amp;sdk=joey"><input
					type="hidden" autocomplete="off" id="profile_selector_ids"
					name="profile_selector_ids" value=""><input type="hidden"
					autocomplete="off" id="skip_api_login" name="skip_api_login"
					value="1"><input type="hidden" autocomplete="off"
					id="signed_next" name="signed_next" value="1"><input
					type="hidden" autocomplete="off" id="trynum" name="trynum"
					value="1"><input type="hidden" autocomplete="off"
					name="timezone" value="0" id="u_0_0"><input type="hidden"
					name="lgnrnd" value="140156_cDfY"><input type="hidden"
					id="lgnjs" name="lgnjs" value="1381438895">
				<div class="form_row clearfix">
					<label for="email" class="login_form_label">Email or Phone:</label><input
						type="text" class="inputtext" id="email" name="email" value="">
				</div>
				<div class="form_row clearfix">
					<label for="pass" class="login_form_label">Password:</label><input
						type="password" name="pass" id="pass" class="inputpassword">
				</div>
			</div>
			<div id="dialog_buttons" class="dialog_buttons">
				<label class="uiButton uiButtonConfirm uiButtonLarge"
					id="loginbutton" for="u_0_1"><input value="Log In"
					name="login" type="submit" id="u_0_1">
				</label><label class="uiButton uiButtonLarge" for="u_0_2"><input
					value="Cancel" name="cancel" type="button"
					onclick="window.close();" id="u_0_2">
				</label>
			</div>
		</form>
	</div>
</body>
</html>
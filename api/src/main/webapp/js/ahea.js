const CLIENT_ID = "ahea_client_id";
const CLIENT_SECRIT = "ahea_client_secrit";
const SERVER_ID = "ahea";
const SERVER_PASSWORD = "ahea123";
const AUTH_SERVER_URL = "127.0.0.1:9090/api/";

var Base64={_keyStr:"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",encode:function(e){var t="";var n,r,i,s,o,u,a;var f=0;e=Base64._utf8_encode(e);while(f<e.length){n=e.charCodeAt(f++);r=e.charCodeAt(f++);i=e.charCodeAt(f++);s=n>>2;o=(n&3)<<4|r>>4;u=(r&15)<<2|i>>6;a=i&63;if(isNaN(r)){u=a=64}else if(isNaN(i)){a=64}t=t+this._keyStr.charAt(s)+this._keyStr.charAt(o)+this._keyStr.charAt(u)+this._keyStr.charAt(a)}return t},decode:function(e){var t="";var n,r,i;var s,o,u,a;var f=0;e=e.replace(/[^A-Za-z0-9+/=]/g,"");while(f<e.length){s=this._keyStr.indexOf(e.charAt(f++));o=this._keyStr.indexOf(e.charAt(f++));u=this._keyStr.indexOf(e.charAt(f++));a=this._keyStr.indexOf(e.charAt(f++));n=s<<2|o>>4;r=(o&15)<<4|u>>2;i=(u&3)<<6|a;t=t+String.fromCharCode(n);if(u!=64){t=t+String.fromCharCode(r)}if(a!=64){t=t+String.fromCharCode(i)}}t=Base64._utf8_decode(t);return t},_utf8_encode:function(e){e=e.replace(/rn/g,"n");var t="";for(var n=0;n<e.length;n++){var r=e.charCodeAt(n);if(r<128){t+=String.fromCharCode(r)}else if(r>127&&r<2048){t+=String.fromCharCode(r>>6|192);t+=String.fromCharCode(r&63|128)}else{t+=String.fromCharCode(r>>12|224);t+=String.fromCharCode(r>>6&63|128);t+=String.fromCharCode(r&63|128)}}return t},_utf8_decode:function(e){var t="";var n=0;var r=c1=c2=0;while(n<e.length){r=e.charCodeAt(n);if(r<128){t+=String.fromCharCode(r);n++}else if(r>191&&r<224){c2=e.charCodeAt(n+1);t+=String.fromCharCode((r&31)<<6|c2&63);n+=2}else{c2=e.charCodeAt(n+1);c3=e.charCodeAt(n+2);t+=String.fromCharCode((r&15)<<12|(c2&63)<<6|c3&63);n+=3}}return t}}


function makeBaseAuth(user, pswd) {
	var token = user + ':' + pswd;
	var hash = "";
	if (btoa) {
		hash = btoa(token);
	}
	return "Basic " + hash;
}

var ahea = new function() {
	this.ajax = function(ajaxParam) {
		alert('call ajaxFunction');

		
		
		$.ajax({
					url : "http://" + CLIENT_ID + ":" + CLIENT_SECRIT + "@" + AUTH_SERVER_URL + "oauth/token",
					data : {
						grant_type : "password",
						client_id : CLIENT_ID,
						client_secret : CLIENT_SECRIT,
						scope : "read",
						username : SERVER_ID,
						password : SERVER_PASSWORD
					},
					headers : {"Authorization":makeBaseAuth(SERVER_ID,SERVER_PASSWORD)},
					crossDomain: true,
					dataType: "json",
			        cache: false,
					method : 'POST',
					async: false,
					success : function(data) {
						
						localStorage.setItem("access_token", data.access_token)
					}
				});
		
		var ajaxParams = { type: 'POST', 
				headers: { 
					'Access-Control-Allow-Origin': '*' , 
					'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, OPTIONS', 
					'Access-Control-Allow-Headers': 'Content-Type, Content-Range, Content-Disposition, Content-Description',
					'Authorization': 'Bearer ' + localStorage.getItem("access_token")
				}, 
				cache: false, 
				contentType: "application/text; charset=utf-8", 
				
			};
		
		$.extend(ajaxParams,ajaxParam);
		
		$.ajax(ajaxParams)
		.done(function() { /*doing anything*/})
		.fail(function(jqXHR) { alert(JSON.stringify(jqXHR)); }) 
		.then(function( data, textStatus, jqXHR ) {alert(data);});
		

		// curl
		// ahea_client_id:ahea_client_secrit@localhost:9090/api/oauth/token
		// -d grant_type=password -d client_id=ahea_client_id -d scope=read
		// -d username=ahea -d password=ahea123

		

	};

};
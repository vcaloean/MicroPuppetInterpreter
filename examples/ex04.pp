#% Virtual resource
#% Catalog:
#% {
#% 	 "type": "User",
#% 	 "title": "alice",
#% 	 "parameters": {
#% 		 "uid": 100
#% 	 }
#% }

node default {
	realize User['alice']
	@user { 'alice': uid => 100 }
}
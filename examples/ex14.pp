#% Class 'a' being called from the default node
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	include a
}

class a {
	user { 'alice':	password => 12345 }
}
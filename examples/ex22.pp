#% Multiple includes
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
	include a
}

class a {
	user { 'alice':	password => 12345 }
}
#% Class parameters
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

class a ($variable = 12345) {
	user { 'alice':	password => $variable }
}
#% Missing parameters
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	a::b { 'alice': variable => 12345 }
}

class a {
	define b ($variable, $owner = "alice") {
		user { $owner: password => $variable }
	}
}
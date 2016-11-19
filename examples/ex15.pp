#% Class inheritance
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

class a inherits b {
	user { 'alice': password => $variable }
}

class b {
	$variable = 12345
}
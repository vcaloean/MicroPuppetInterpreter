#% Class inheritance and parameters
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

class a ($variable = 12345) inherits b {
	user { $owner: password => $variable }
}

class b {
	$owner = "alice"
}
#% A class declaration not using all the parameters
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	class { 'a': owner => 'alice' }
}

class a ($owner = "bob", $variable = 12345) {
	user { $owner: password => $variable }
}
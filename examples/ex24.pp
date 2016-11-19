#% A class declaration overwriting parameters
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345
#%   }
#% }

node default {
	class { 'a': variable => 12345 }
}

class a ($variable = 67890) {
	user { 'alice': password => $variable }
}
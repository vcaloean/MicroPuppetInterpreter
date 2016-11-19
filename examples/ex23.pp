#% A class declaration
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

class a ($variable) {
	user { 'alice': password => $variable }
}